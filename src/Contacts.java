import java.util.Scanner;

public class Contacts {
    private Helper list;

    Contacts() {
        list = new Helper();
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("You have chosen to add a new contact:");
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name: ");
        p.setFirst(sc.nextLine());
        //System.out.println(p.getFirst());
        System.out.print("Last Name: ");
        p.setLast(sc.nextLine());
        // System.out.println(p.getLast());
        System.out.print("Contact Number: ");
        String n = sc.nextLine();
        p.setNumber(n);
        while (true) {
            System.out.print("Would you like to add another contact number? (y/n): ");
            String s = sc.nextLine();
            if (s.equals("y")) {
                System.out.print("Contact Number: ");
                p.setNumber(sc.nextLine());
            } else {
                break;
            }
        }
        System.out.print("Would you like to add email address? (y/n): ");
        if (sc.nextLine().equals("y")) {
            p.setEmai(sc.nextLine());
        }

        PersonNode node = new PersonNode(p);
        list.add(node);
    }

    public void searchContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You could search for a contact from their first names: ");
        String name = sc.nextLine();
        System.out.println("ok");
        list.find(name);

    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here are all your contacts:");
        list.printList(false);
        System.out.print("Press the number against the contact to delete it: ");
        int t = sc.nextInt();
        list.removeAt(t);
    }

    public void showDetails() {
        list.printList(true);
    }
}
