import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            Cashier cashier = new Cashier();

           
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty!");
            }

            
            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.nextLine().trim();
            if (!phoneNumber.matches("\\d{10}")) { // assuming phone number is 10 digits
                throw new IllegalArgumentException("Invalid phone number! Please enter 10 digits.");
            }

            
            System.out.print("Enter row number for seat reservation: ");
            int row = scanner.nextInt();

            System.out.print("Enter seat number for seat reservation: ");
            int seat = scanner.nextInt();

            cashier.bookSeat(row, seat);  

            
            User user = new User(name, "Avenger Endgame");  
            cashier.printTicket(user);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}
