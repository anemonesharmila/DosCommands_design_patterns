/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.operationTypes;

import java.io.InputStreamReader;


/**
 *
 * @author sharmila
 */
public abstract class Operation {
    protected String[] takeCommands;
    
    public Operation(String[] takeCommands)
    {
       
        this.takeCommands=takeCommands;
    }
   
    public abstract void operationExecuted(InputStreamReader input,String[] takeCommands);
           
}
