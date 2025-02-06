package Assigments;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayList3 {
    public static void arrayList() {
        ArrayList aa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println(
                "1. Add elements to the list.\n2. Retrieve an element at a specific index.\n3. Update an element at a specific index.\n4. Remove an element by value and by index.\n5. Check if the list contains a specific element.\n6. Find the index of a specific element.\n7. Clear the list.\n8. Get all Data");
        do {
            System.out.println("Choose Any Number");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    for (int i = 101; i <= 110; i++) {
                        aa.add(i);
                    }
                    break;
                case 2:
                    System.out.println("Enter The Index Number ");
                    int index = sc.nextInt();
                    System.out.println(aa.get(index));
                    break;
                case 3:
                    System.out.println("Enter The Update Number and index number ");
                    int index2 = sc.nextInt();
                    int update = sc.nextInt();
                    aa.add(index2, update);
                    break;
                case 4:
                    System.out.println("Enter The Index Number For Remove Eelement ");
                    int index3 = sc.nextInt();
                    aa.remove(index3);
                    break;
                case 5:
                    System.out.println("Enter the element for check ");
                    Integer ele = sc.nextInt();
                    for (int i = 0; i < aa.size(); i++) {
                        if (aa.get(i) == ele) {
                            System.out.println("Element is Present At  " + aa.get(i) + " Index");
                        } else {
                            System.out.println("Element is not present");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter the element for search index");
                    Integer ii = sc.nextInt();
                    int value = aa.indexOf(ii);
                    System.out.println("Index Of Give " + value);
                    break;

                case 7:
                    aa.removeAll(aa);
                    break;
                case 8:
                    ListIterator ll = aa.listIterator();

                    while (ll.hasNext()) {
                        System.out.print(ll.next()+" ");
                    }
                    break;
                default:
                    System.out.println("Entered Wrong Number");
                    break;

            }

        } while (a < 9);
    }

    public static void main(String[] args) {
        arrayList();
    }
}
