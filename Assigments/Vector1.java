package Assigments;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
    public static void vectorr() {
        List<Object> vv = new Vector();

        Scanner sc = new Scanner(System.in);
        System.out.println("select any one");
        System.out.println("1: Enter the element in vector ");
        System.out.println("2: View All element in vector ");
        System.out.println("3: Search Element in vector ");
        System.out.println("4: Remove the element from vector ");
        System.out.println("5: Get Vector To specific element ");

        int a ;
        do {
            System.out.println("Enter your choice");
         a = sc.nextInt();
            switch (a) {
               
                case 1:
                System.out.println("enter the value in arraylist");
                    vv.add(sc.nextInt());
                    break;

                case 2:
                    for (Object object : vv) {
                        System.out.print(object + " ");
                    }
                    break;

                case 3:
                    System.out.println("Enter the Element To search");
                    Integer searchIndex = sc.nextInt();
                    for (int i = 0; i < vv.size(); i++) {
                        if (vv.get(i) == searchIndex) {
                            System.out.println("Its Present ");
                        } else {
                            System.out.println("Its not Present");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter the index Number");
                    int removeIndex = sc.nextInt();
                    vv.remove(removeIndex);
                    break;

                case 5:
                    System.out.println("Start index number");
                    int fromIndex = sc.nextInt();
                    System.out.println("Last IndexNumber");
                    int toIndex = sc.nextInt();
                    System.out.println(vv.subList(fromIndex, toIndex));
                    break;

            }
        } while (a < 6);

    }

    public static void main(String[] args) {
        vectorr();
    }
}
