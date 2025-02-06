package Assigments;

import java.util.EmptyStackException;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

class Book {
    private int bookId;
    private String bookName;
    private int bookPrice;
    private String bookAuthor;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Book(int bookId, String bookName, int bookPrice, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
                + bookAuthor + "]";
    }

}

public class StackAss {
    public static void main(String[] args) {
        Stack<Book> ss = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("1: Push the element in stack");
        System.out.println("2: First element of stack");
        System.out.println("3: Disply all stack data");

        do {
            System.out.println("Choose any of Above");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    ss.push(new Book(1, "Abc", 200, "opl"));
                    ss.push(new Book(2, "Abc", 200, "opl"));
                    ss.push(new Book(3, "Abc", 200, "opl"));
                    ss.push(new Book(4, "Abc", 200, "opl"));
                    ss.push(new Book(5, "Abc", 200, "opl"));
                    ss.push(new Book(6, "Abc", 200, "opl"));
                    ss.push(new Book(7, "Abc", 200, "opl"));
                    ss.push(new Book(8, "Abc", 200, "opl"));
                    ss.push(new Book(9, "Abc", 200, "opl"));
                    ss.push(new Book(10, "Abc", 200, "opl"));
                    break;
                case 2:
                    try {
                        System.out.println(ss.peek());
                    } catch (EmptyStackException e) {
                        System.out.println("You Stack is Empty ");
                        System.out.println(e);
                    }
                    break;
                case 3:
                    ListIterator ll = ss.listIterator(ss.size());

                    while (ll.hasPrevious()) {
                        System.out.println(ll.previous());
                    }
                    break;
                default:
                    System.out.println("You Entered Wrong Value");
                    break;

            }
        } while (a < 4);

    }
}
