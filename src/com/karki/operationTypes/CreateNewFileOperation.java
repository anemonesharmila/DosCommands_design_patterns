/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.operationTypes;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sharmila
 */
public class CreateNewFileOperation extends Operation {

    public CreateNewFileOperation(String[] takeCommands) {
        super(takeCommands);
    }

    @Override
    public void operationExecuted(InputStreamReader input, String[] takeCommands) {
        if (takeCommands.length >= 2) {

            try {
                String path = ".";
                File fi = new File(path);
                fi.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

}
