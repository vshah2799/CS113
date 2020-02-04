//Homework 1, CS 113, Vishal Shah+
import java.util.Scanner;

public class GeneralCode {

    public static void main(String[] args){
        System.out.println("Hello, this is Homework 1 for CS113, done by Vishal Shah.");
        runner();
    }

    public static void runner(){
        Scanner intScan = new Scanner(System.in);
        GeneralCode hw1 = new GeneralCode();
        System.out.println("Press 1 to continue to the problems or press 2 to exit");
        int selection = intScan.nextInt();
        if(selection == 1){

            System.out.println("Please enter the problem you want to run.\nEnter 1 for PP 2.5\nEnter 2 for PP 2.6\nEnter 3 for PP 2.8\nEnter 4 for PP 2.9.");
            int selection2 = intScan.nextInt();

            if (selection2 == 1){
                hw1.inchesToFeetConverter();
            }
            else if(selection2 == 2){
                hw1.gramsToPoundsConverter();
            }
            else if(selection2 == 3){
                hw1.kiloMilliGramConverter();
            }
            else if(selection2 == 4){
                hw1.milliToCombinedWeightConverter();
            }
        }
        else{
            System.out.println("Thank you");
        }
    }

    public void inchesToFeetConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from inches to feet.\nPlease input the value and press enter");
        double inches = doubleScan.nextDouble();
        double feetConversion = inches/12.00;
        System.out.println(inches + " inches is " + feetConversion + " feet");

        runner();
    }

    public void gramsToPoundsConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from grams to pounds.\nPlease input the value and press enter");
        double grams = doubleScan.nextDouble();
        double poundConversion = grams/453.592;
        System.out.println(grams + " grams is " + poundConversion + " pounds");

        runner();
    }

    public void kiloMilliGramConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from kilograms, milligrams, and/or grams to just milligrams.\nPlease input the kilogram value and press enter");
        double kiloGrams = doubleScan.nextDouble();
        System.out.println("Please input the gram value and press enter");
        double grams = doubleScan.nextDouble();
        System.out.println("Please input the milligram value and press enter");
        double milliGrams = doubleScan.nextDouble();
        double combinedGrams = (kiloGrams*1000000.00) + (grams*1000.00) + milliGrams;
        System.out.println("The combined value is " + combinedGrams);

        runner();
    }

    public void milliToCombinedWeightConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from milligrams to a combined value of kilograms, grams, and milligrams.\nPlease input the milligram value and press enter");
        double milligramValue = doubleScan.nextDouble();
        double kilogramValue = (int)(milligramValue/1000000);
        double milliAndGramOnlyValue = milligramValue%1000000;
        double gramValue = (int)(milliAndGramOnlyValue/1000);
        double milligramLeftValue = milliAndGramOnlyValue%1000;
        System.out.println("The equivalent to " + milligramValue + " milligrams is " + kilogramValue + " kilos, " + gramValue + " grams, and " + milligramLeftValue + " milligrams");

        runner();
    }

































}
