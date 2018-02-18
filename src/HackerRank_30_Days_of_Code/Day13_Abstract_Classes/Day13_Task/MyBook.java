package HackerRank_30_Days_of_Code.Day13_Abstract_Classes.Day13_Task;

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {
    /**
     * Task
     * Given a Book class and a Solution class,
     * write a MyBook class that does the following:
     * Inherits from Book
     * Has a parameterized constructor taking these 3 parameters:
     * string title
     * string author
     * int price
     * Implements the Book class' abstract display() method so it prints these  lines:
     * Title:, a space, and then the current instance's title.
     * Author, a space, and then the current instance's author.
     * Price, a space, and then the current instance's price.
     * Note: Because these classes are being written in the same file,
     * you must NOT use an access modifier (e.g.: public)
     * when declaring MyBook or your code will not execute.
     */
// Declare the price instance variable
    int price;

    /**
     * Class Constructor
     *
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     * Print the title, author, and price in the specified format.
     **/
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}