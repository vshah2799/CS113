import java.util.ArrayList;
import java.util.Scanner;
public class TestBooks {
    ArrayList bookObjectList = new ArrayList();
    String smallestBook;
    int smallestBookNum;
    int totalNumOfPages;
    int avgNumOfPages;
    public static void main(String[] args){
        TestBooks test = new TestBooks();
        test.runner();

    }

    public void runner(){
        Scanner numscan = new Scanner(System.in);
        Scanner letscan = new Scanner(System.in);
        int pages;
        String title;
        TestBooks.println("How many books did you read during the summer? PLease enter the number and then press enter. " +
                          "You will enter the title and number of pages for each book after.");
        int amountOfBooksRead = numscan.nextInt();

        TestBooks.println("Enter the title");
        title = letscan.nextLine();
        TestBooks.println("Enter the amount of pages in the book");
        pages = numscan.nextInt();
        smallestBookNum = pages;
        totalNumOfPages += pages;
        smallestBook = title;
        bookObjectList.add(new Book(pages, title));

        for(int i = 0;i<amountOfBooksRead-1; i++ ){
            TestBooks.println("Enter the title");
            title = letscan.nextLine();
            TestBooks.println("Enter the amount of pages in the book");
            pages = numscan.nextInt();
            totalNumOfPages += pages;
            bookObjectList.add(new Book(pages, title));
            if(smallestBookNum>pages){
                smallestBook = title;
            }
        }

        avgNumOfPages = totalNumOfPages/amountOfBooksRead;

        TestBooks.println("The smallest book is " + smallestBook + ". The average number of pages is " + avgNumOfPages + " *AVERAGE NUMBER IS ROUNDED DOWN*");
    }









    public static void println(String x) {
        System.out.println(x);
    }



}
