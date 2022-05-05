package PracticingLoops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        while(true) {
            System.out.println("Enter a positive number:");
            int number = scanner.nextInt();
            if(number==0){
                System.out.println("Process finished with exit code 0");
                break;
            }
            if (number < 0){
                System.out.println("Number must be a positive number!");
            }
            System.out.println("Number is " + number);
        }
        scanner.close();
    }
}
