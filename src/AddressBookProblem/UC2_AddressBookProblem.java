package AddressBookProblem;

import java.util.Scanner;
import java.util.ArrayList;
public class UC2_AddressBookProblem {
    private String first;
    private String last;
    private String add;
    private String city;
    private String state;
    private int zip;
    private long phoneNo;
    private String email;
    static ArrayList<UC1_AddressBookProblem> contactBook = new ArrayList<>();
    public void readData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        first = s.next();
        System.out.println("Enter the last name : ");
        last = s.next();
        System.out.println("Enter the address : ");
        add = s.next();
        System.out.println("Enter the city : ");
        city = s.next();
        System.out.println("Enter the state : ");
        state = s.next();
        System.out.println("Enter the zip code : ");
        zip = s.nextInt();
        System.out.println("Enter the phone number : ");
        phoneNo = s.nextLong();
        System.out.println("Enter the email : ");
        email = s.next();
        UC1_AddressBookProblem contact = new UC1_AddressBookProblem(first , last , add , city , state , zip , phoneNo , email);
        contactBook.add(contact);
        System.out.println("\nContact added Successfully.");
    }

    public void DisplayContacts() {
        int i;
        System.out.println("\nContacts Present in Address Book:");
        for(i = 0 ; i < contactBook.size() ; i++) {
            System.out.println(contactBook.get(i));
        }
    }

    public static void main(String[] args) {
        UC2_AddressBookProblem a = new UC2_AddressBookProblem();
        a.readData();
        a.DisplayContacts();
    }
}