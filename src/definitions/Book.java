/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Book {

    private String nameOfBooks;

    private String nameOfAuthors;
    //  since it Should be a of 13 Digits
    private String isbnNumberOfBooks;


    //CREATING THE GETTER METHOD FOR THE FIELDS
    public String getNameOfBooks() {
        return nameOfBooks;
    }

    // NOW,WE WILL CREATE SETTER METHOD FOR EVERY VARIABLE
    public void setNameOfBooks(String nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    public String getNameOfAuthors() {
        return nameOfAuthors;
    }

    public void setNameOfAuthors(String nameOfAuthors) {
        this.nameOfAuthors = nameOfAuthors;
    }

    public String getIsbnNumberOfBooks() {
        return isbnNumberOfBooks;
    }

    public void setIsbnNumberOfBooks(String isbnNumberOfBooks) {
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }
    public Book(){
        this.nameOfBooks = "DISCRETE MATHEMATICS";
        this.nameOfAuthors = "KNEATH ROSAN";
        this.isbnNumberOfBooks = "4858147954410";
    }


}

