
import java.util.Random;
import java.util.Scanner;

class Game{
    int userInput;
    int randomNum;
    int noOfGuesses = 0;

    public Game(){
        Random obj = new Random();
        randomNum =obj.nextInt(100);
    }
    public void greet(){
            System.out.println("Welcome to GUESS THE NUMBER GAME...");
    }
    public void setUserInput(int n){
        userInput = n;
    }
    public void incrementGuess(){
        noOfGuesses++;
    }
    public int isCorrect(){
        if(userInput>randomNum) {
            return -1;
        }
        if (userInput<randomNum){
            return 1;
        }
        else {
            return 0;
        }
    }
}
public class gussno {
    public static void main(String[] args){
        Game object = new Game();
        Scanner obj3 = new Scanner(System.in);
        while(true){
            System.out.println("Guess a number from 1-100");
            int n = obj3.nextInt();
            object.setUserInput(n);

            if(object.isCorrect()==0){
                System.out.println("Hurray! Successfully you guess the number ");
                System.out.println(" Guessed in "+ object.noOfGuesses);
                break;

            }
            else if(object.isCorrect()==-1){
                System.out.println("Your Number is Big than actual Number");
                object.noOfGuesses++;
            }
            else if(object.isCorrect()==1){
                System.out.println("Your Number is Small than actual Number");
                object.noOfGuesses++;
            }
        }

    }
}








