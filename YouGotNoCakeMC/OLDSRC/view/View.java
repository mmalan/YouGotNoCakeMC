/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Clayton H. & Matt M.
 */
public abstract class View implements ViewInterface {

    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        String value = "";
        boolean done = false;

        do {
            System.out.println(this.displayMessage); // display prompt message
            value = this.getInput(); //get value end user entered
            done = this.doAction(value); // do action based on value entered
        } while (!done);
    }

    @Override
    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;

        while (!valid) { //while a valid name has not been retrieved
            //get selection from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) { //blank value entered
                System.out.println("You must enter a value");
                continue;
            }
            break;
        }
        return selection; //return the name
    }

//    public String getPromptMessage(){
//        return promptMessage;
//    }
//    
//    public void setPromptMessage(String message) {
//        this.promptMessage = message;
//    }
}
