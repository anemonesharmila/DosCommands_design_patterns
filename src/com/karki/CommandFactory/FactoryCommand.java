/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.CommandFactory;


import com.karki.operationTypes.ChangeDirectoryOperation;
import com.karki.operationTypes.CreateNewFileOperation;
import com.karki.operationTypes.DeleteOperation;
import com.karki.operationTypes.ListDirectoryOperation;
import com.karki.operationTypes.MakeDirectoryOperation;
import com.karki.operationTypes.OneStepChangeDirOperation;
import com.karki.operationTypes.Operation;
import java.io.InputStreamReader;

/**
 *
 * @author sharmila
 */
public class FactoryCommand {
  
    protected InputStreamReader input;
    public FactoryCommand(InputStreamReader input)
    {
        this.input=input;
        
    }
  
    public static Operation get(String[] takeCommands)
   {
       if(takeCommands[0].equalsIgnoreCase("md"))
       {
           return new MakeDirectoryOperation(takeCommands);
       }
       
        else if(takeCommands[0].equalsIgnoreCase("rd"))
       {
           
          return new DeleteOperation(takeCommands);
       }
       else if(takeCommands[0].equalsIgnoreCase("dir"))
        {
            return new ListDirectoryOperation(takeCommands);
        }
       else if(takeCommands[0].equalsIgnoreCase("cd"))
       {
           return new ChangeDirectoryOperation(takeCommands);
       }
       else if(takeCommands[0].equalsIgnoreCase("cd.."))
       {
           return new OneStepChangeDirOperation(takeCommands);
                   
           
       }
       else if(takeCommands[0].equalsIgnoreCase("file"))
       {
           return new CreateNewFileOperation(takeCommands);
       }
           return null;
   }

    

    
}
