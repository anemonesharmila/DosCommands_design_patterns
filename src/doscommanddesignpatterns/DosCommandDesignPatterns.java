/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doscommanddesignpatterns;

import com.karki.CommandFactory.FactoryCommand;
import com.karki.Entities.Commands;
import com.karki.operationTypes.Operation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sharmila
 */
public class DosCommandDesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Commands commands = new Commands();

        try {
            String line = "";
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader bReader = new BufferedReader(input);

            while (!(line = bReader.readLine()).equalsIgnoreCase("exit")) {
                System.out.print(">");
                String[] takeCommands = line.split(" ");
                Operation op = FactoryCommand.get(takeCommands);

                if (op == null) {
                    System.out.println("Invalid command! please provide the valid command");
                } else {
                    op.operationExecuted(input, takeCommands);
                }

            }
            bReader.close();
        } catch (IOException io) {
            io.getMessage();
        }
    }

}
