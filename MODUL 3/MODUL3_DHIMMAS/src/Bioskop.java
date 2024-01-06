class Bioskop {
    
    public void printTicket(User user) {
        System.out.println("Printing ticket for: " + user);
    }

    // Assume bookSeat method exists here
    public void bookSeat(int row, int seat) {
        System.out.println("Booking seat at Row " + row + ", Seat " + seat);
    }
}