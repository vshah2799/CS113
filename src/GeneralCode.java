import java.util.Scanner;

public class GeneralCode {
    public static void main(String[] args){

    milliToCombinedWeightConverter();

    }

    public static void inchesToFeetConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from inches to feet.\nPlease input the value and press enter");
        double inches = doubleScan.nextDouble();
        double feetConversion = inches/12.00;
        System.out.println(inches + " inches is " + feetConversion + " feet");
    }

    public static void gramsToPoundsConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from grams to pounds.\nPlease input the value and press enter");
        double grams = doubleScan.nextDouble();
        double poundConversion = grams/453.592;
        System.out.println(grams + " grams is " + poundConversion + " pounds");
    }

    public static void kiloMilliGramConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from kilograms, milligrams, and/or grams to just milligrams.\nPlease input the kilogram value and press enter");
        double kiloGrams = doubleScan.nextDouble();
        System.out.println("Please input the gram value and press enter");
        double grams = doubleScan.nextDouble();
        System.out.println("Please input the milligram value and press enter");
        double milliGrams = doubleScan.nextDouble();
        double combinedGrams = (kiloGrams*1000000.00) + (grams*1000.00) + milliGrams;
        System.out.println("The combined value is " + combinedGrams);
    }

    public static void milliToCombinedWeightConverter(){
        Scanner doubleScan = new Scanner(System.in);
        System.out.println("You want to convert from milligrams to a combined value of kilograms, grams, and milligrams.\nPlease input the milligram value and press enter");
        double milligramValue = doubleScan.nextDouble();
        double kilogramValue = (int)(milligramValue/1000000);
        double milliAndGramOnlyValue = milligramValue%1000000;
        double gramValue = (int)(milliAndGramOnlyValue/1000);
        double milligramLeftValue = milliAndGramOnlyValue%1000;
        System.out.println("The equivalent to " + milligramValue + " milligrams is " + kilogramValue + " kilos, " + gramValue + " grams, and " + milligramLeftValue + " milligrams");
    }

































}
