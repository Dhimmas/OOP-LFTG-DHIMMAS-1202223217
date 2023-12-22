public class Bioskop {
    private int rows;
    private int seatsPerRow;
    int [][] seats = new int [rows][seatsPerRow];
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    
    // TO DO: Create 2 dimensional array to store seat reservation status
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
       seats [1][3] = 1;
       seats [2][6] = 1;
       seats [4][8] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking tiket bioskop");
        for (int i=0; 1<rows; i++);
            for(int k=0; seatsPerRow; k++){
                System.out.println(seats[i][k]);
            }


    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[row][seats]==0){
        seats[rows][seats]=1;
        System.out.println("Kursi berhasil dipesan");
        }else{
            System.out.println("Error");
        }
        }
    }