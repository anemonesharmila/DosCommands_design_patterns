/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.operationTypes;

import java.io.File;
import java.io.InputStreamReader;

/**
 *
 * @author sharmila
 */
public class ListDirectoryOperation extends Operation {
   
    public ListDirectoryOperation(String[] takeCommands) {
        super(takeCommands);
    }

    @Override
    public void operationExecuted(InputStreamReader input, String[] takeCommands) {
           if(takeCommands.length>1)
           {
                File file=new File(takeCommands[1]);
                String[] directories=file.list();
                for(String d:directories)
                {
                    System.out.println(d +" ");
                }
                file.getAbsolutePath();
                
           }
            
           else 
           {
                String PresentWD=System.getProperty("user.dir");
              //  System.out.println(PresentWD);
                File f=new File(PresentWD);
                String[] listDir=f.list();
                
                for(String l:listDir)
                {
                    System.out.println(l +" ");
                }
              
           }
       
    }
    
}
