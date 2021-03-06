/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import java.util.Scanner;

/**
 *
 * @author Boyd
 */
public class MapView {
    
    
    public final String MAP = "\n"
            + "\n+---------+---------+---------+---------+---------+---------+---------+"
            + "\n    |     |   TEMPLE SQUARE REFUGEE CAMP    |     |     ZOO     |     |"
            + "\n    |     |---------------------------------|     |-------------|     |"
            + "\n    |  +         +         +         +         +         +         +  |"
            + "\n    |     |-------------|     |-------------|     |-------------|     |"
            + "\n    |     |             | XXX |             |     |             |     |"
            + "\n    |     |             |     |   SHOPPING  |     | CATHEDRAL   |     |"
            + "\n    |  +  |      +      |  +  |     MALL    |  +  |             |  +  |"
            + "\n    |     |  CONVENTION |     |             |     |             |     |"
            + "\n    |     |    CENTER   |     |             |     |             |     |"
            + "\n    |     |             |     |-------------|     |-------------|     |"
            + "\n    |  +  |      +      |  +         +         +         +         +  |"
            + "\n    |     |             |     |-------------|     |-------------|     |"
            + "\n    | XXX |             |     |             |     |             |     |"
            + "\n    |     |             |     |    HOTEL    |     |  APARTMENT  |     |"
            + "\n    |  +  |      +      |  +  |             |  +  |    BLDG     |  +  |"
            + "\n    |     |             |     |             |     |             |     |"
            + "\n    |     |             |     |             |     |             |     |"
            + "\n    |     |-------------| XXX |-------------|     |-------------| XXX |"
            + "\n    |  +         +         +         +         +         +         +  |"
            + "\n    |     |-------------|                         |-------------|     |"
            + "\n    |     |             |                         |             |     |"
            + "\n    |     |     BUS     |          PARK           |    CITY     |     |"
            + "\n    |  +  |   STATION   |  +         +         +  |    HALL     |  +  |"
            + "\n    |     |             |                         |             |     |"
            + "\n    |     |             |                         |             |     |"
            + "\n    | XXX |-------------|                         |-------------|     |"
            + "\n    |  +         +         +         +         +         +         +  |"
            + "\n    |     |-------------|     |-------------|     |-------------|     |"
            + "\n    |     |      |      |     |             |     |             |     |"
            + "\n    |     |      |      |     |   GROCERY   |     |   POLICE    |     |"
            + "\n    |  +  |------|------|  +  |    STORE    |  +  |   STATION   |  +  |"
            + "\n    |     |      |      |     |             |     |             |     |"
            + "\n    |     |      |      |     |             |     |             | XXX |"
            + "\n    |     |-------------|     |-------------|     |-------------|     |"
            + "\n    |  +         +         +         +         +         +         +  |"
            + "\n    |     |-------------|     |-------------|     |-------------|     |"
            + "\n    |     |             |     |             |     |             |     |"
            + "\n    |     |   SPORTING  |     |             |     | CONVENIENCE |     |"
            + "\n    |  +  |    GOODS    |  +  |   HOSPITAL  |  +  |    STORE    |  +  |"
            + "\n    |     |    STORE    |     |             |     |             |     |"
            + "\n    |     |             |     |             |     |             |     |"
            + "\n    |     |-------------|     |-------------|     |-------------|     |"
            + "\n    |  +         +         +         +         +         +         +  |"
            + "\n    |     |-------------|     |-------------|     |-------------|     |"
            + "\n    |     |             |     |             |     |      |      |     |"
            + "\n    |     |    FIRE     |     |             |     |      |      |     |"
            + "\n    |  +  |  STATION    |  +  |    SCHOOL   |  +  |------|------|  +  |"
            + "\n    |     |             |     |             |     |      |      |     |"
            + "\n    |     |             |     |             |     |      |      |     |"
            + "\n|---|     |-------------|     |-------------|     |-------------|     |"
            + "\n+    START       +         +         +         +         +         +  |"
            + "\n|---------------------------------------------------------------------|"
            +"\n "
            + "\nPress Q to Quit:"
            ;
    private boolean promptMessage;

    public void displayMenu(){
        
        char selection = ' ';
        
        do {
            
            System.out.println(MAP);// display the main menu
            
            String input = this.getInput();// get the user selection
            selection = input.charAt(0);//get first character of string
            
            this.doActionHelp(selection);//do action based on selection
            
          }
        
        while (selection != 'Q');//while selection is not exit
        
    }    

    public void displayMapView() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doActionHelp(menuOption);
            }
        while (!done);
    
    }

    private String getInput() {

    /*
        
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
        
     */
 

    return "WHAT_AM_I? See line 95";
    }

    private String getMenuOption() {
     
        
        Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                System.out.println(this.MAP);
                
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
    public boolean doActionHelp(String choice){
    
        // this is the help menu do action function
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "G"://what is the goal?
                System.out.println("\nThe Goal is to get safely to the refugee camp");
                break;

 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }    

    private void doActionHelp(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
