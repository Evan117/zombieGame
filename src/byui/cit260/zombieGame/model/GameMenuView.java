/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.model;

import byui.cit260.zombieGame.view.MapView;
import byui.cit260.zombieGame.view.MoveView;
import java.util.Scanner;

/**
 *
 * @author Boyd
 */
public class GameMenuView {
   
    public final String GAMEMENU = "\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Game Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nV - View Map"
            + "\nE - View Equipment"
            + "\nM - Move"
            + "\nU - Use Equipment"
            + "\nW - Select Weapon"            
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
            ;
    private boolean promptMessage;

 /*   public void displayMenu(){
        
        char selection = ' ';
        
        do {
            
            System.out.println(GAMEMENU);// display the main menu
            
            String input = this.getInput();// get the user selection
            selection = input.charAt(0);//get first character of string
            
            this.doActionGame(selection);//do action based on selection
            
          }
        
        while (selection != 'Q');//while selection is not Quit
        
    } 
    
    */

    public void displayGameMenuView() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doActionGame(menuOption);
            }
        while (!done);
    
    }

     /*   private String getInput() {


        
    getInput(): value
        BEGIN
        WHILE valid value has not been entered
         DISPLAY a message prompting the user to enter a value
         GET the value entered from keyboard
         Trim blanks off front and end of value
         IF invalid value entered THEN
         DISPLAY invalid value message
         CONTINUE
         ENDIF
         BREAK
        ENDWHILE
        RETURN value    
        
 
 

    return "WHAT_AM_I? See line 95";
    }

    */

    private String getMenuOption() {
     
        
        Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                System.out.println(this.GAMEMENU);
                
                value = keyboard.nextLine();//get the name from the keyboard
                
                value = value.trim();//trim off the excess blanks
                
                // if the name is invalid < one character in length
                
                if (value.length()< 1){
                
                System.out.println("invalid value - the value cannot be blank.");
                
                continue;//and repeat again
                
                        }
                
                valid = true;//set flag to end repetition
                
                }

                return value;//return the value       
    
    
    
    
    
    }
    public boolean doActionGame(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "V"://what is the goal?
                this.displayMapView();
               break;
            
            case "E"://How to move
                System.out.println("\nView Equipment");
               break;
               
            case "M"://how to get items noted out to test inventory menu -Evan

                MoveView moveMenu = new MoveView();
                moveMenu.displayMoveMenuView();


                //System.out.println("\nYou have moved");

                break;
                
            case "U"://combat - how to fight
                System.out.println("\nSelect Equipment");
                break;
                
                
            case "W"://combat - how to fight
                System.out.println("\nView and Select Weapons");
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

   

    private void displayMapView() {
 
      MapView mapView = new MapView();
 
     
      mapView.displayMapView();   
    
    
    }

    
}
