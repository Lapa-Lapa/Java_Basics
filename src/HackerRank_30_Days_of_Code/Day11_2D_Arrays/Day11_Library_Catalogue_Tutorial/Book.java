package HackerRank_30_Days_of_Code.Day11_2D_Arrays.Day11_Library_Catalogue_Tutorial;

public class Book {

    //Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;//whether or not the book is checked out
    int dayCheckedOut = -1;

    //Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    //Getters IntelliJ IDEA: [Alt+Insert]!!!
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    //Setters IntelliJ IDEA: [Alt+Insert]!!!
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}