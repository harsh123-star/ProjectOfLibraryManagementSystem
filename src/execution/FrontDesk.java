/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUED_BOOKS =2;
    private static final int SHOW_ALL_BOOKS_ISSUED = 3;
    public static final int  EXIT =4;

    public static void main(String[] args) {
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("ENTER YOUR CHOICE FROM: [1,2,3,4]");
        Scanner scannerObject = new Scanner(System.in);

        int choice = scannerObject.nextInt();




//        Scanner scannerObject = new Scanner(System.in);
////OBJECT CREATED FOR BOOK
//        Book bookobject = new Book();
//        System.out.println(bookobject);
//
//
//        Library libraryObject = new Library();
//        System.out.println(libraryObject);
//
//
//        Student studentObject = new Student();
//        System.out.println(studentObject);
    }
}
