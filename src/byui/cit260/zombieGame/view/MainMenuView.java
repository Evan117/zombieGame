/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.view;

import byui.cit260.zombieGame.control.GameControl;
import byui.cit260.zombieGame.model.GameMenuView;
import java.util.Scanner;
import zombiegame.ZombieGame;

/**
 *
 * @author Boyd
 */
public class MainMenuView extends View {

    public MainMenuView(){
    super("\n"
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\n+  Main Menu                          "
            + "\n++++++++++++++++++++++++++++++++++++++"
            + "\nN - Start New Game"
            + "\nL - Load Game"
            + "\nH - Help"
            + "\nS - Save Game"
            + "\nQ - Quit"
            + "\n++++++++++++++++++++++++++++++++++++++"
     );
    }
    private boolean promptMessage;

    public MainMenuView(String message) {
        super(message);
    }

    
    
    
    void displayMainMenuView() {

                boolean done = false;// set flag to not done.
        do{
            //prompt for and get player's name
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return;//exit the game
                //do the requested action and display the next view
                done = this.doAction(menuOption);
            }
        while (!done);
    
    }

    

    
@Override
    public boolean doAction(String value) {
    
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            
            case "N"://create and start a new game
                this.startNewGame();
                break;
            
            case "L"://get and start existing game
               this.loadGame();
               break;
               
            case "H"://get help
                this.displayHelpMenu();
                break;
                
            case "S"://save the current game
                this.saveGame();
                break;
 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
                
            
        }
        return false;
        
    }
    
    

    
    
    
    
    
        
        
    //    System.out.println("\n*** do action function called");
    //    return true;

    private void startNewGame() {
 
        //create new game 
        GameControl.createNewGame(ZombieGame.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
        
        
        
        
    }

    private void loadGame() {

        System.out.println("\n*** loadGame function called");    
    
    }

    private void displayHelpMenu() {

       
     HelpMenuView helpMenuView = new HelpMenuView();
 
     
        helpMenuView.displayHelpMenuView();
     
       // System.out.println(helpMenuView);    
  
    
    }

    private void saveGame() {


        System.out.println("\n*** saveGame function called");  

    }


   

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
    
    
}