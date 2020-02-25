import java.util.ArrayList;
import java.util.Scanner;
public class NumberReader {
    ArrayList numberList = new ArrayList();

    public static void main(String[] args){
        NumberReader numRead1 = new NumberReader();
        numRead1.runner();
    }


    public void runner(){
        Scanner letscan = new Scanner(System.in);
        boolean flag = true;
        String input;

        while(flag){
            System.out.println("Please enter a number between 0 and 50, inclusive, or enter EXIT to exit the number input");
            input = letscan.nextLine();
            if(input.toLowerCase().equals("exit")){
                flag = false;
                break;
            }
            else{
                numberList.add(Integer.parseInt(input));
            }
        }

        for(int i = 0; i<numberList.size()-1; i++){
            int numOfOcc = 0;
            int currNum = (int) numberList.get(i);

            for(int h = 0; h<numberList.size()-1; h++){
                int occNum = (int) numberList.get(h);
                if(occNum==currNum) {
                    numOfOcc++;
                }
            }

            System.out.println("Number is: " + currNum + ". Occurrences: " + numOfOcc);

        }
    }
}
