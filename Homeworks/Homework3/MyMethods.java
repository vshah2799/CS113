import java.util.Scanner;
import java.util.Scanner.*;
public class MyMethods {

    public int surface() {
        Scanner numscan = new Scanner(System.in);
        MyMethods.println("Please input the width");
        int width = numscan.nextInt();
        MyMethods.println("Please input the length");
        int length = numscan.nextInt();
        MyMethods.println("Please input the height");
        int height = numscan.nextInt();
        int totalSurfaceArea = 2*(length*width) + 2*(length*height) + 2*(height*width);
        return totalSurfaceArea;
    }

    public double rightTriangle(){
        Scanner numscan = new Scanner(System.in);
        MyMethods.println("Enter the first side");
        double sideA = numscan.nextDouble();
        MyMethods.println("Enter the hypotenuse");
        double hypo = numscan.nextDouble();
        double thirdSide = Math.sqrt(sideA) + Math.sqrt(hypo);
        return thirdSide;
    }


    public static void println(String x) {
        System.out.println(x);
    }
}
