package oops.abstraction.interfaces.mulitple_interface;

public class Document implements Printable, Showable {
    public void print() {
        System.out.println("Document printed successfully.");
    }
    public void show() {
        System.out.println("Document displayed on screen.");
    }
}
