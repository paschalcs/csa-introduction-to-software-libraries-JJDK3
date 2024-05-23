import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GarageSale garageSale = new GarageSale();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'new' for a new transaction, 'report' to view sales report, 'end' to end the garage sale: ");
            String action = scanner.nextLine().trim().toLowerCase();

            if (action.equals("new")) {
                garageSale.newTransaction();
            } else if (action.equals("report")) {
                garageSale.reportOverallSales();
            } else if (action.equals("end")) {
                System.out.println("Final sales report:");
                garageSale.reportOverallSales();
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
