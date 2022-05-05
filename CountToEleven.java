package PracticingLoops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

            System.out.println("Enter a number less than 11:");
            int number = scanner.nextInt();

            while (true){
            System.out.println(number);

            if (number >= 11) {
                break;
            }

            number = number + 1;
    }
    scanner.close();
    }
}
