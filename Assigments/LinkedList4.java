package Assigments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
     
public class LinkedList4 {
    public static void linkedListProgram() {
        LinkedList ll = new LinkedList<>();
        for (int i = 101; i <= 110; i++) {
            ll.add(i);
        }

        ListIterator lst = ll.listIterator();
        while (lst.hasNext()) {
            System.out.print(lst.next() + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        int sum = 0;
        for (int i = 0; i < ll.size(); i++) {
            sum += (int) ll.get(i);
        }
        System.out.println("Sum Of LinkedList is " + sum);

        int size = ll.size();
        System.out.println("Size of linked list  " + size);
        double average = sum / size;
        System.out.println("Average of LinkedList is " + average);

        System.out.println("Reverse the list");

        ListIterator reverse = ll.listIterator(ll.size());
        while (reverse.hasPrevious()) {
            System.out.print(reverse.previous() + " ");
        }
        System.out.println();
        System.out.println("Shuffle");
        Collections.shuffle(ll);
        for (Object object : ll) {
            System.out.print(object + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate() {
        LinkedList ll = new LinkedList<>();
        ll.add(100);
        ll.add(100);
        ll.add(200);
        ll.add(100);
        ll.add(300);
        ll.add(100);
        ll.add(400);
        ll.add(100);
        ll.add(500);
        ll.add(500);
        System.out.println("List with duplicate ");
        ListIterator lst1 = ll.listIterator();

        while (lst1.hasNext()) {
            System.out.print(lst1.next() + " ");
        }

        System.out.println();
        for (int i = 0; i < ll.size(); i++) {
            for (int j = i + 1; j < ll.size(); j++) {
                if (ll.get(i).equals(ll.get(j))) {
                    ll.remove(j);
                }
            }
        }
        System.out.println("Remove Duplicate ");
        ListIterator lst = ll.listIterator();

        while (lst.hasNext()) {
            System.out.print(lst.next() + " ");
        }

    }

    public static void main(String[] args) {
        linkedListProgram();
        removeDuplicate();
    }
}
