package com.pluralsight;
import java.util.Scanner;

public class neighborhoodLibrary {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Welcome to our library! \nPlease select one of the following options.");
//        System.out.println("(1) Show Available Books");
//        System.out.println("(2) Show Checked Out Books");
//        System.out.println("(3) Exit");


        Book[] book = new Book[20];
        //Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo)

        book[0]= new Book(1, "00001", "Harry Potter" ,true ,"Abigiel");
        book [1]= new Book(2,"00002","Pride and Prejudice",false, "");
        book [2]= new Book(3,"00003","Little Women",true, "Petunia");
        book [3]= new Book(4,"00004","The Sicilian",false, "");
        book [4]= new Book(5,"00005","Emma ",false, "");
        book [5]= new Book(6,"00006","Wuthering Heights",false, "");
        book [6]= new Book(7,"00007","A Little Life",false, "");
        book [7]= new Book(8,"00008","12 Rules for life",false, "");
        book [8]= new Book(9,"00009","The Picture of Dorian Grey",false, "");
        book [9]= new Book(10,"000010","Who Moved My Cheese",true, "Sarah");
        book [10]= new Book(11,"00011","Jane Eyre",false, "");
        book [11]= new Book(12,"00012","Maps Of Meaning",false, "");
        book [12]= new Book(13,"00013","The Great Gatsby",true, "Chichi");
        book [13]= new Book(14,"00014","Pale Fire",false, "");
        book [14]= new Book(15,"00015","Les Miserables",false, "");
        book [15]= new Book(16,"00016","To Kill a Mockingbird",false, "");
        book [16]= new Book(17,"00017","The Call of the Wild",false, "");
        book [17]= new Book(18,"00018","Persuasion",true, "Arsema");
        book [18]= new Book(19,"00019","To The Lighthouse",false, "");
        book [19]= new Book(20,"00020","1984",false, "");






            //       int firstChoice = myScanner.nextInt();
//        switch(firstChoice){
//            case 1:
//
//                break;
//            case 2:
//
//                break;
//            case 3:
//
//                break;
//            default:
//                System.out.println("Invalid input. Select 1,2 or 3.");
//
//        }

    }

}
