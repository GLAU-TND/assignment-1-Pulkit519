public class Helper {
    private PersonNode head;
    private PersonNode tail;
    private int size;

    public void add(PersonNode person) {
        if (isEmpty() || person.getPerson().getFirst().toLowerCase().compareTo(head.getPerson().getFirst().toLowerCase()) <= 0) {
            person.setNext(head);
            head = person;
            size++;
        } else {
            PersonNode current = head;
            PersonNode previous = null;
            while (current != null && person.getPerson().getFirst().toLowerCase().compareTo(current.getPerson().getFirst().toLowerCase()) >= 0) {
                previous = current;
                current = current.getNext();
            }
            person.setNext(previous.getNext());
            previous.setNext(person);
            size++;
        }
    }

    public int getSize() {
        return size;
    }


    public void removeFront() {
        if (isEmpty()) {
            System.out.println("There are no contacts");
        } else {
            PersonNode removeNode = head;
            head = head.getNext();
            System.out.println(removeNode.getPerson().getFirst() + " " + removeNode.getPerson().getLast() + "'s" + " contact deleted from list!");
            size--;
        }
    }

    public void removeAt(int position) {
        if (position == 1) {
            removeFront();
            System.out.println();
        } else if (position == getSize()) {
            removeEnd();
        } else if (position > 1 && position < getSize()) {
            PersonNode current = head;
            PersonNode previous = null;
            for (int i = 1; i < position; i++) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            System.out.println(current.getPerson().getFirst() + " " + current.getPerson().getLast() + "'s" + " contact deleted from list!");
            size--;
        } else {
            System.out.println("Wrong Input!");
        }
    }

    public void removeEnd() {
        if (isEmpty()) {
            System.out.println("There are no contacts");
        } else {
            PersonNode current = head;
            PersonNode previous = null;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
            System.out.println(current.getPerson().getFirst() + " " + current.getPerson().getLast() + "'s" + " contact deleted from list!");
            size--;
        }
    }

    public void find(String name) {
        int n = 0;
        PersonNode current = head;
        while (current != null) {
            if (current.getPerson().getFirst().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                n++;
            }
            current = current.getNext();
        }
        if (n == 0) {
            System.out.println("NO RESULT FOUND!");
        } else {
            System.out.println(n + " match fount!");
            current = head;
            while (current != null) {
                if (current.getPerson().getFirst().toLowerCase().compareTo(name.toLowerCase()) == 0) {
                    current.getPerson().showPerson();
                }
                current = current.getNext();
            }
        }
    }

    public void printList(boolean check) {
        if (check == true) {
            PersonNode current = head;
            while (current != null) {
                current.getPerson().showPerson();
                current = current.getNext();
            }
        } else {
            PersonNode current = head;
            int n = 1;
            while (current != null) {
                System.out.println(n + "." + " " + current.getPerson().getFirst());
                current = current.getNext();
                n++;
            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
