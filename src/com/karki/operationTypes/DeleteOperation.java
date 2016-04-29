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
public class DeleteOperation extends Operation {

    public DeleteOperation(String[] takeCommands) {
        super(takeCommands);
    }

    
    @Override
    public void operationExecuted(InputStreamReader input, String[] takeCommands) {
        
                          if(takeCommands.length>1)
                          {
                            File file=new File(takeCommands[1]);
                            file.delete();
                          }
                      
    }

}
