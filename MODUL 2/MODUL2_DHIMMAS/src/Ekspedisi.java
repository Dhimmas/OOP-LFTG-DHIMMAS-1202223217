public class Ekspedisi {
    protected int jumlahCabang;
    protected String pusat;
    protected float tarif;

    public Ekspedisi(int jumlahCabang, String pusat, float tarif){
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
    }

    public void informasi(){
        System.out.println("Ekspedisi tidak diketahui dengan jumlah cabang" + jumlahCabang + "dan berpusat di" + pusat + "mempunyai tarif sebesar" + tarif +"per kilogram");
    }
}

    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)

    // TO DO: Create Constructor of Ekspedisi

    // TO DO: Create 'informasi' Method to show Information

