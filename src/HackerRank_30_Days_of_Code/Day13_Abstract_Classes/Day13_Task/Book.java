package HackerRank_30_Days_of_Code.Day13_Abstract_Classes.Day13_Task;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}