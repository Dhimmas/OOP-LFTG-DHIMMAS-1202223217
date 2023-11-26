class MainApp {
    public static void main(String[] args) {
        
        Bus bus = new Bus("T456", 60.0, 40, 30);
        Mobil mobil = new Mobil("B123", 150.0, 4, 4);

        
        System.out.println("Informasi mobil:");
        System.out.println(mobil.toString());
        System.out.println("\nWaktu tempuh dengan mobil: " + hitungWaktuTempuh(mobil) + " jam");

        System.out.println("\nInformasi Bus:");
        System.out.println(bus.toString());
        System.out.println("\nWaktu tempuh dengan bus: " + hitungWaktuTempuh(bus) + " jam");
    }

    private static double hitungWaktuTempuh(Kendaraan kendaraan) {
        double jarak = 150.0; 
        return jarak / kendaraan.getKecepatanMaksimum();
    }
}