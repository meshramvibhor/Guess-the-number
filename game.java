
import java.util.Random;
import java.util.Scanner;

class GuessTheNum{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    // getters and setters
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // constructor tp initialise number
    GuessTheNum(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    // method to take user input
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    // method to check userGuess
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}


public class game {
    public static void main(String[] args) {
        GuessTheNum g = new GuessTheNum();
        boolean b= false;

        while(!b){
            try {
                g.takeUserInput();
                b = g.isCorrectNumber();
            }
            catch (Exception e ){
                System.out.println("Please give valid Input...");

            }
        }
    }
}
