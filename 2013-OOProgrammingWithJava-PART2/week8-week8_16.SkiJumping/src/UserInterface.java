
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class UserInterface {
    private Scanner reader;
    private Tournament tourney;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.tourney = new Tournament(5); //5 judges
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        
        enrollParticipants();
        
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        playRounds();
        
        System.out.println("Thanks!");
        System.out.println("");
        
        tourney.printTournamentResults();
    }
    
    public void enrollParticipants(){
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        String name; //input stream catcher
        
        //collects participant names
        while (true){   
            System.out.print("  Participant name: ");
            name = reader.nextLine();
            if (name.equals(""))
                break;
            tourney.addParticipant(new Jumper(name));
        } //end participant enrollment
    }
    
    public void playRounds(){
        String input;
        while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            input = reader.nextLine();
            System.out.println("");

            if (!input.equals("jump"))
                break;
            
            System.out.println("Round " + tourney.getRoundCounter());
            System.out.println("");
            
            System.out.println("Jumping order:");
            for (int i = 1; i <= tourney.getNumberOfParticipants(); i++){
                System.out.println("  " + i + ". " + tourney.getParticipant(i-1));
            }
            System.out.println("");
            
            tourney.playNextRound();
            
            tourney.printPreviousRound();
        }
    }
    
}
