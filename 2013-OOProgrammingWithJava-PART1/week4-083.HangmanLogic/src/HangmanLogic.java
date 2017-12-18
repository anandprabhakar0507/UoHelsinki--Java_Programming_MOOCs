
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if (!guessedLetters.contains(letter)){
        // it the word does not contains the guessed letter, number of faults increase
            if(!word.contains(letter))
                numberOfFaults++;
                
            guessedLetters += letter;
            
        }
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        String rs = "";
        //go over each char in word
        for(char c : word.toCharArray()){
            
            //if guessedLetters does not contain the char
            if (!guessedLetters.contains(""+c))
                
                //then add _ in lieu of char to return string
                rs += "_";
            
            //else add char to return string.
            else
                rs += c;
        }       
        // return the hidden word at the end
        return rs;
    }
}
