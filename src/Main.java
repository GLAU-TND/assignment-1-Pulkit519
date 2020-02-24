import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts c = new Contacts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DBC's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program" + "\n");

        while (true) {
            System.out.println("Enter your choice");
            int t = sc.nextInt();
            if (t == 1) {
                c.addPerson();
            } else if (t == 2) {
                c.showDetails();
            } else if (t == 3) {
                c.searchContact();
            } else if (t == 4) {
                c.deleteContact();
            } else if (t == 5) {
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}
