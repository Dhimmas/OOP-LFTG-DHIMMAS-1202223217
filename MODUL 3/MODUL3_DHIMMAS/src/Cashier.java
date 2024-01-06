public class Cashier extends Bioskop {

    
    public void printTicket(User user) {
        System.out.println("Printing ticket for: " + user);
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        User user = new User("John Doe", "Avengers: Endgame");
        cashier.bookSeat(1, 5); 
        cashier.printTicket(user); 
    }
}