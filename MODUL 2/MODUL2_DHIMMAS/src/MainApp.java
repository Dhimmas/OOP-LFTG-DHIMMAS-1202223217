public class MainApp {
    public static void main(String[] args){
        Ekspedisi ekspedisi = new Ekspedisi(12, "Tangerang", 100f);
        ekspedisi.informasi();
    
        TelUExpress teluexpress = new TelUExpress(15, "Jakarta", 10000f,true);
        teluexpress.informasi();
        teluexpress.ambil("Tangerang");
        teluexpress.antar(1292818);
        teluexpress.antar(1202010, 1302101);

        FRIExpress friexpress = new FRIExpress(12, "Bandung", 1000f, true);
        friexpress.informasi();
        friexpress.terima(12);
        friexpress.kirim("Bekasi");
        friexpress.kirim("Bojongsoang", "Dayeuhkolot");
        


    }
}
