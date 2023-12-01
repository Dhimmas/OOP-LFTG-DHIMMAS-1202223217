public class MainApp {
    public static void main(String[] args){
        Ekspedisi ekspedisi = new Ekspedisi(12, "Tangerang", 100f)
        ekspedisi.informasi();
    
        TelUExpress teluexpress = new TelUExpress(15, "Jakarta", 10000f);
        teluexpress.informasi();
        teluexpress.ambil();
        teluexpress.antar();
        teluexpress.antar();

        FRIExpress friexpress = new FRIExpress(12, "Bandung", 1000f);
        friexpress.informasi();
        friexpress.terima();
        friexpress.kirim();
        friexpress.kirim();
        
        // TO DO: Create expedisi Object from Ekspedisi Class

        // TO DO: Create teluexpress Object from TelUExpress Class

        // TO DO: Create friexpress Object from FRIExpress Class


    }
}
