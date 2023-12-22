public class User {
   private String nama;
   private String noHandPhone;

   // TO DO: Create Private Attributes of User (nama, noHandphone)
   public User (String nama, String noHandphone){
      this.nama = nama;
      this.noHandPhone = noHandphone;
   }
   // TO DO: Create Constructor of User
   
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      System.out.println("Masukkan"+ nama + "nama");
      System.out.println("Masukkan"+ noHandPhone + "telepon");
      System.out.println("Register Berhasil");
    }
   // TO DO: Create method to return name and phone number
   
   public String void getName() {
     System.out.println("Nama:" + nama);
  }

   public String void getnoHandPhone() {
     System.out.println("No Handphone:" + noHandPhone);
  }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getNoHandPhone() {
      return noHandPhone;
   }
}






  