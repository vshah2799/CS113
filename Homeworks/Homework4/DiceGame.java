import java.util.Scanner;
public class DiceGame {
    int userNumber;
    int userScore;
    int computerScore;

    public static void main(String[] args){
        DiceGame game1 = new DiceGame();
        game1.runner();
    }

    public void runner(){
        Scanner numscan = new Scanner(System.in);
        System.out.println("What is the number you chose? It must be between 2 and 12. Enter the number and press enter");
        userNumber = numscan.nextInt();
        Die die1 = new Die();
        Die die2 = new Die();

        while((userScore<100) && (computerScore<100)){
            System.out.println("The user's score is " + userScore);
            System.out.println("The computer score is " + computerScore);

            die1.rollVoid();
            die2.rollVoid();
            System.out.println("The roll value is " + (die1.getFaceValue() + die2.getFaceValue()));
            if(die1.getFaceValue() + die2.getFaceValue() == userNumber){
                userScore += 5;
            }
            else{
                die1.rollVoid();
                die2.rollVoid();
                System.out.println("The roll value is " + (die1.getFaceValue() + die2.getFaceValue()));
                if(die1.getFaceValue() + die2.getFaceValue() == userNumber){
                    userScore += 5;
                }
                else{
                    die1.rollVoid();
                    die2.rollVoid();
                    System.out.println("The roll value is " + (die1.getFaceValue() + die2.getFaceValue()));
                    if(die1.getFaceValue() + die2.getFaceValue() == userNumber){
                        userScore += 5;
                    }
                    else{
                        computerScore+=3;
                    }
                }
            }
        }

        System.out.println("You scored " + userScore);
        System.out.println("The computer scored " + computerScore);
        if(userScore>=100){
            System.out.println("YOU WIN!!");
        }
        else{
            System.out.println("You lose :(");
        }
    }

}
