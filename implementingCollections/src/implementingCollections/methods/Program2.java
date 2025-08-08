package implementingCollections.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.print("Enter the element to fill in list: ");
        Integer num = sc.nextInt();

        // First add placeholders (e.g., 0s) to the list
        for (int i = 0; i < size; i++) {
            list.add(0);
        }

        // Now fill the list with the desired number
        Collections.fill(list, num);

        System.out.println("Filled List: " + list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        sc.close();
    }
}