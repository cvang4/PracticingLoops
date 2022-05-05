package PracticingLoops;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        while(true) {
            System.out.println("Do you want to take a break?");
            String userinput = scanner.nextLine();
            if(userinput.equals("yes")) {
                break;
            }
            System.out.println("Ok we'll keep going then!");
        }
        System.out.println("Take your 15 and get ready to come back!");
        scanner.close();
    }
}
