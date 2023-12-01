public class TelUExpress extends Ekspedisi {
    protected boolean antarInter;

    public Ekspedisi(int jumlahCabang, String pusat, float tarif, boolean antarInter){
       super(jumlahCabang, pusat, tarif);
       this.antarInter = antarInter;
    }

    
    public void informasi(){
        System.out.println("Ekspedisi TelUExpress diketahui dengan jumlah cabang" + jumlahCabang + "dan berpusat di" + pusat + "mempunyai tarif sebesar" + tarif +"per kilogram. Selain itu, ekspedisi ini melayani pengantaran International");
    };
    
    
    public void ambil(String tempat){
        System.out.println("TelUExpress berhasil mengambil paket ke" + tempat);
    }
     
    public void antar(int resi){
        System.out.println("TelUExpress berhasil mengatar paket dengan no resi" + resi);
    }   

    
    public void antar(int resi_1, int resi_2){
        System.out.println("TelUExpress berhasil mengantar paket dengan no resi" + resi_1, + resi_2);
    }


{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)

    // TO DO: Create Constructor of TelUExpress

    // TO DO: Create 'informasi' Method to show Information

    // TO DO: Create 'ambil' Method to pick up a package

    // TO DO: Create 'antar' Method to send a package

    // TO DO: Create 'antar' Method to send two packages
}}
