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
public class OneStepChangeDirOperation  extends Operation{

    public OneStepChangeDirOperation(String[] takeCommands) {
        super(takeCommands);
    }

    @Override
    public void operationExecuted(InputStreamReader input, String[] takeCommands) {
                if(takeCommands.length==1)
                {
                    String gPwd=System.getProperty("user.dir");
                  
                    File f=new File(gPwd);
                    String p=f.getParentFile().toString();
                    String pwd=System.setProperty("user.dir",p);
                }
    }
    
}
