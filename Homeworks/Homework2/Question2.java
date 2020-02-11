/*Write an application that prompts the user for three student names. The program
calculates and prints to the screen the average name length as well as a string containing
name initials. For example if the names are ‘John’, ‘Jake’, ‘Jill’, the program should print
4.0
JJJ
 */
import java.util.Scanner;
import java.util.Random;
public class Question2 {
    public static void main(String[] args) {
        Scanner letscan = new Scanner(System.in);
        Random ran = new Random();
        Question2.println("Please enter the first name");
        String firstName = letscan.nextLine();
        Question2.println("Please enter the second name");
        String secondName = letscan.nextLine();
        Question2.println("Please enter the third name");
        String thirdName = letscan.nextLine();

        double avgNameLength = (firstName.length() + secondName.length() + thirdName.length())/3.0;
        String initials = firstName.substring(0,1) + secondName.substring(0,1) + thirdName.substring(0,1);
        Question2.println(String.valueOf(avgNameLength));
        Question2.println(initials);
    }
    public static void println(String x){
        System.out.println(x);
    }
}
