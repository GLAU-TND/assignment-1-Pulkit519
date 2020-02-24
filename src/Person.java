import java.util.ArrayList;

public class Person {
    private String first;
    private String last;
    private String temp;
    private String emai;
    private ArrayList<String> numbers = new ArrayList<>();

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public void setNumber(String n) {
        numbers.add(n);
    }

    public void showNumber() {
        if (numbers.size() > 1) {
            System.out.print("Contact Number(s): ");
        } else {
            System.out.print("Contact Number: ");
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    public void showPerson() {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + first);
        System.out.println("Last Name: " + last);
        showNumber();
        System.out.println("\n" + "Email address: " + emai);
        System.out.println("-------- * -------- * -------- * --------");
    }

    @Override
    public String toString() {
        return first;
    }
}
