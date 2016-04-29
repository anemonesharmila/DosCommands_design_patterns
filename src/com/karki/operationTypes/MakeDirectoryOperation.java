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
public class MakeDirectoryOperation  extends Operation{

    public MakeDirectoryOperation(String[] takeCommands) {
        super(takeCommands);
    }

  
    @Override
    public void operationExecuted(InputStreamReader input,String[] takeCommands) {
              
                          if(takeCommands.length>1)
                          {
                            File file=new File(takeCommands[1]);
                            file.mkdir();
                            
                          }
                          else
                          {
                              System.out.println("Please give valid file name");
                          }
                      
    }
    
}
