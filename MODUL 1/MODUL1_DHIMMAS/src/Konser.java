public class Konser {
    private String namaband;
    private int tanggal;
    private String lokasi;
    private int hargatiket;

    private Konser(String namaband, int tanggal, String lokasi,int hargatiket) {
        this.namaband = namaband;
        this.tanggal = tanggal;
        this.lokasi = namaband;
        this.hargatiket = tanggal;

    }
    public String getNamaband() {
        return namaband;
    }
    public void setNamaband(String namaband) {
        this.namaband = namaband;
    }
    public int getTanggal() {
        return tanggal;
    }
    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    public String getLokasi() {
        return lokasi;
    }
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public int getHargatiket() {
        return hargatiket;
    }
    public void setHargatiket(int hargatiket) {
        this.hargatiket = hargatiket;
    }
    
    }
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter

    
