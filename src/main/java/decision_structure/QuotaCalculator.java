package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        int quota = 10;

        System.out.println("Enter the number of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congrats! You've met your quota!");
        } else {
            int salesQuota = quota - sales;
            System.out.println("You did not make your quota. " + "You were " + salesQuota + " sales short.");
        }
    }
}
