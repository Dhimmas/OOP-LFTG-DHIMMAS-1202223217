import java.util.Scanner;

public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        boolean isbooked = false;
        for (int i=0; i<super.seats.length;i++){
            for (int k=0; k<super.seats(i).length;k++){
                if (! (i==1 && k==3)|| (i==2 && k==6) || (i==4 && k==8)){
                    if (super.seats[i][k] == 1){
                        isbooked = true;
                        System.out.println("Nama" + user.getNama());
                        System.out.println("Phone" + user.getNoHandPhone());
                        System.out.println("Seats" + (i + 1)+ ","+(k + 1));
                        System.out.println("Selamat Menonton!");
                    }else {
                                System.out.println("Belum berhasil dipesan");
                            }
                        }
                    }
                }

            }
        {}
    }

    

