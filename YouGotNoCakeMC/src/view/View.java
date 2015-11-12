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
    
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display(){
        String value = "";
        boolean done = false;
        do{
            System.out.println(this.promptMessage); // display prompt message
            value = this.getInput(); //get value end user entered
            done = this.doAction(value); // do action based on value entered
        }while (!done);
        
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false; //indicates if the name has been retrieved
        String value = null;
        
        
        while(!valid) { //while a valid name has not been retrieved
            
            //get selection from the keyboard and trim off the blanks
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) { //blank value entered
            System.out.println("You must enter a value");
            continue;
            }
            
            break; // out of the (exit) the repetition
        }
        
        return value ; //return the name
    }
    
    public String getPromptMessage(){
        return promptMessage;
    }
    
    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
}
