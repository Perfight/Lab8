import java.util.Scanner;
class Reader {

    private String fullName;
    private static int counter = 1;
    private int libraryTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        libraryTicketNumber=counter++;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numOfBooks) {
        System.out.println(this.fullName + " took " + numOfBooks + " books.");
    }

    public void takeBook(String[] bookTitles) {
        String books = String.join(",",bookTitles);
        System.out.println(this.fullName + " took books: " + books + ".");
    }

    public void returnBook(int numOfBooks) {
        System.out.println(this.fullName + " returned " + numOfBooks + " books.");
    }

    public void returnBook(String[] bookTitles) {
        String books = String.join(",",bookTitles);
        System.out.println(this.fullName + " returned books: " + books + ".");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryTicketNumber() {
        return libraryTicketNumber;
    }

    public void setLibraryTicketNumber(int libraryTicketNumber) {
        this.libraryTicketNumber = libraryTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader[] arr = new Reader[5];
        for(int i = 0; i < arr.length; i++){
            String fullname = in.next();
            String faculty = in.next();
            String dateOfBirth = in.next();
            String phone = in.next();
            arr[i] = new Reader(fullname, faculty, dateOfBirth, phone);
        }
    }
}