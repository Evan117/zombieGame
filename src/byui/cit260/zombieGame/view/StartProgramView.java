/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import byui.cit260.zombieGame.model.Player;
import java.util.Scanner;

/*
Start Game Story follows:

Launch The Game Program

The end user enters the command to start the program. The computer 
displays a banner screen with the following description of the game: 
....

The player is prompted for and enters their name. The user enters 
their name and the computer displays a personalized welcome message 
and the Main Menu. An error message is displayed if an invalid name 
is entered and the player is prompted to re-enter a valid name or quit.



*/
/* banner message below
+---------+---------+---------+---------+---------+---------+---------+
+   In Salt Lake City in the year 2020, strange things are starting   +
+ to happen. People are getting sick, stores and businesses have      +
+ closed their doors as crime is rising at an alarming rate. Police   +
+ are overwhelmed.                                                    +
+                                                                     +
+   You are a National guardsman whose unit has been activated and    +
+ ordered to report to a Military checkpoint for assignment. While    +
+ traveling to your unit you are in an accident. When you awaken,     +
+ you are in a world of utter bedlam. What has happened? Where is     +
+ your unit? Where is your family? You must get to them and make sure + 
+ they are safe!                                                      +
+---------+---------+---------+---------+---------+---------+---------+

*/



/**
 *
 * @author Boyd
 */
public class StartProgramView extends View {
    
    public String displayMessage;
    
    public StartProgramView(){
        
        this.displayMessage = "\nPlease enter your name:";
        
        //display banner when view is created
        this.displayBanner();
        
        
    } 

    private void displayBanner() {
     
        System.out.println(
        "\n+---------+---------+---------+---------+---------+---------+---------+" +
        "\n+   In Salt Lake City in the year 2020, strange things are starting   +" +
        "\n+ to happen. People are getting sick, stores and businesses have      +" +
        "\n+ closed their doors as crime is rising at an alarming rate. Police   +" +
        "\n+ are overwhelmed.                                                    +" +
        "\n+                                                                     +" +
        "\n+   You are a National guardsman whose unit has been activated and    +" +
        "\n+ ordered to report to a Military checkpoint for assignment. While    +" +
        "\n+ traveling to your unit you are in an accident. When you awaken,     +" +
        "\n+ you are in a world of utter bedlam. What has happened? Where is     +" +
        "\n+ your unit? Where is your family? You must get to them and make sure +" +
        "\n+ they are safe!                                                      +" +
        "\n+---------+---------+---------+---------+---------+---------+---------+"
     
            );
    
    }

    public void displayStartProgramView() {
       
        // System.out.println("\n*** displayProgramView function called ***");
        
        boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String playersName = this.getInput();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doAction(playersName);
            }
        while (!done);
    
            }
// When deleted just get null
    public String getInput() {
    
        Scanner keyboard = new Scanner(System.in);//keyboard input string
        String value = "";
            boolean valid = false;//setflag to invalid valid entered
            while (!valid) {
                //while a valid name has not been retrieved
                
                //prompt for the players name
                
                System.out.println(this.displayMessage);
                
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
@Override
    public boolean doAction(String playersName) {
    
        /*
        doAction(playersName): boolean
        BEGIN
            if the length of the playersName < 2 then
            display “Invalid name: The name must be > 1 character”
            return false

            create Player with specified name
            if unsuccessful then
            display “Invalid name: The name is too short”
            return false
            display customized welcome message
            display mainMenuView
            return true
           END
          */
    
        if (playersName.length()< 2){
            
            System.out.println("\nInvalid players name: "
                 
                    + "the name must be greater than one character in length");
            
            return false;
        }
                  
       Player player = GameControl.createPlayer(playersName);
       
       if (player == null){
           
           //if unsuccessful
           
           System.out.println("\nError creating the player");
           
           return false;
       }
       
       //display next view
       
       this.displayNextView(player);
       return true;//success
       
       
 
    }

    
    
    private void displayNextView(Player player) {
  
       
        
    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++"
                     + "\n+ Welcome to the Game " + player.getName()
                     + "\n+ R.I.P. " + player.getName()
                     + "\n++++++++++++++++++++++++++++++++++++++++++"
                        );
    
                        //create main menu view object
                        MainMenuView mainMenuView = new MainMenuView();
                        // display the main menu view
                        mainMenuView.displayMainMenuView();
                        
        
    }




        
 } 

    
   
    
   
    

