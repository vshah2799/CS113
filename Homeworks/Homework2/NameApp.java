/*Write an application called NameApp that prompts for and reads the user’s first and last
name (separately). Then print a string composed of the first letter of the user’s first
name, followed by the first five characters of the user’s last name, followed by a
random integer in the range 10 to 99.
Assume that the last name is at least five letters long. Similar algorithms are sometimes
used to generate usernames for a new computer accounts.
*/
import java.util.Scanner;
import java.util.Random;
public class NameApp {
    public static void main(String[] args) {
        Scanner letscan = new Scanner(System.in);
        Random ran = new Random();
        NameApp.println("Please enter your first name");
        String firstName = letscan.nextLine();
        NameApp.println("Please enter your last name");
        String lastName = letscan.nextLine();
        String output = firstName.substring(0,1) + lastName.substring(0, 5) + (ran.nextInt(89) + 10) ;
        NameApp.println(output);
    }
    public static void println(String x){
        System.out.println(x);
    }

}

