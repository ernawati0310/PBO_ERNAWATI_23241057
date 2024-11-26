 class Display {
    // variabel objek / data member
    private String nama;
    // variabel static milik class
    static String tipe = "Display";


    // kostruktor
    Display (String nama){
        this.nama = nama;
    }

    //  method cetak
    void cetak(){
        System.out.println("display nama: " + this.nama);
    }

   // method setter
   void setTipe (String tipeInput){
     tipe = tipeInput; // cara 1
     this.tipe = tipeInput; // cara 2
     Display.tipe = tipeInput; // cara 3
   }
 }

public class App {
    public static void main(String[] args) throws Exception {
        // instasiasi objek
       Display display1 = new Display("Monitor");
       display1.cetak();
       Display display2 = new Display( "Smartphone");
       display2.cetak();
 
    // menampilkan isi dari static variabel
    System.out.println( "menampilkan Static variabel");
    System.out.println(" objek1 : " + Display.tipe);
    System.out.println("objek2 :" + display2.tipe );
    System.out.println("class :" + Display.tipe );

    //menulis ulang isi variabel static
    // display1.tipe = "tampilan";
    // display2.tipe = "tampilan";
    Display.tipe = "Tampilan";


    // menggunakan setter
    display1.setTipe( "spanduk");

   // memamnggil isi variabel static
   System.out.println("menampilkan static variabel");
   System.err.println("objek1");
}
}
 

 