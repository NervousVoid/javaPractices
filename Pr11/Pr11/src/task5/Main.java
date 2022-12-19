package task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<>();
        Random r = new Random();
        Date d = new Date();


        long al_start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            if (i == 78475) {
                al.add(111111);
                continue;
            }
            int num = (int) (r.nextInt(1000));
            al.add(num);
        }
        long al_end = System.currentTimeMillis();

        long ll_start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            if (i == 78475) {
                ll.add(111111);
                continue;
            }
            int num = (int) (r.nextInt(1000));
            ll.add(num);
        }
        long ll_end = System.currentTimeMillis();
        System.out.printf("Add Array List: %d\n", al_end - al_start);
        System.out.printf("Add Linked List: %d\n", ll_end - ll_start);


        al_start = System.currentTimeMillis();
        al.remove(6464844);
        al_end = System.currentTimeMillis();
        ll_start = System.currentTimeMillis();
        ll.remove(6464844);
        ll_end = System.currentTimeMillis();
        System.out.printf("Remove Array List: %d\n", al_end - al_start);
        System.out.printf("Remove Linked List: %d\n", ll_end - ll_start);


        al_start = System.currentTimeMillis();
        al.add(6464844, 123);
        al_end = System.currentTimeMillis();
        ll_start = System.currentTimeMillis();
        ll.add(6464844, 123);
        ll_end = System.currentTimeMillis();
        System.out.printf("Insert Array List: %d\n", al_end - al_start);
        System.out.printf("Insert Linked List: %d\n", ll_end - ll_start);


        al_start = System.currentTimeMillis();
        al.remove(al.indexOf(111111));
        al_end = System.currentTimeMillis();
        ll_start = System.currentTimeMillis();
        ll.remove(ll.indexOf(111111));
        ll_end = System.currentTimeMillis();
        System.out.printf("Find by value Array List: %d\n", al_end - al_start);
        System.out.printf("Find by value Linked List: %d\n", ll_end - ll_start);
    }
}
