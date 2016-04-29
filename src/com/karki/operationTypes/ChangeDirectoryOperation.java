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
public class ChangeDirectoryOperation extends Operation{

    public ChangeDirectoryOperation(String[] takeCommands) {
        super(takeCommands);
    }

    @Override
    public void operationExecuted(InputStreamReader input, String[] takeCommands) {
        if(takeCommands[0].equalsIgnoreCase("cd"))
        {
            if(takeCommands.length>1)
            {
               File file=new File("/");
               String changeDir=System.setProperty("user.dir",takeCommands[1]);
               System.out.println(changeDir);
               String PresentWd=System.getProperty("user.dir");
               System.out.println(PresentWd);
               
            }
        }
    }
    
}
