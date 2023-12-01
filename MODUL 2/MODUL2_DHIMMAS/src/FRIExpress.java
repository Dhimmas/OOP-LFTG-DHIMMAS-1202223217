public class FRIExpress extends Ekspedisi {

    protected boolean pecahBelah;
    
    public Ekspedisi(int jumlahCabang, String pusat, float tarif, boolean pecahBelah){
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;}
    
    @Override
    public void informasi(){
        System.out.println("Ekspedisi FRIExpress diketahui dengan jumlah cabang" + jumlahCabang + "dan berpusat di" + pusat + "mempunyai tarif sebesar" + tarif + "per kilogram. Selain itu, ekspedisi ini melayani pecah belah");
    };
        
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima paket yang masuk untuk disortir sebanyak" + jumlahPaket );
    }
    
    public void kirim(String tujuan){
        System.out.println("FRIExpress baru saja mengirimkan paket yang ke tujuan" + tujuan);
    }   
    

    public void kirim(String tujuan_1, String tujuan_2){
        System.out.println("FRIExpress baru saja mengirimkan paket ke tujuan" + tujuan_1, tujuan_2 );
    }
    

    
    {
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)

    // TO DO: Create Constructor of FRIExpress

    // TO DO: Create 'informasi' Method to show Information

    // TO DO: Create 'terima' Method to accept a number of packages

    // TO DO: Create 'kirim' Method to send a package to a destination

    // TO DO: Create 'kirim' Method to send a package to two destinations
}}
