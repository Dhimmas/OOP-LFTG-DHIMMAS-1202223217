public class TelUExpress extends Ekspedisi {
    protected boolean antarInter;

    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarInter){
       super(jumlahCabang, pusat, tarif);
       this.antarInter = antarInter;
    }

    @Override
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
        System.out.println("TelUExpress berhasil mengantar paket dengan no resi" + resi_1 + resi_2);
    }


{

}}
