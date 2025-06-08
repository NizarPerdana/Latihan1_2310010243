
package hitung;


public class matematikaberaksi {
    public static void main(String[] args) {
        //membuat objek
        matematika nizar  = new matematika(4,3);
        
        System.out.println("Hasil Penjumlahan= " +nizar.setPenjumlahan());
        System.out.println("Hasil Pengurangan= " +nizar.setPengurangan());
        System.out.println("Hasil Perkalian= " +nizar.setPerkalian());
        System.out.println("Hasil Pembagian= " +nizar.setPembagian());
    }
}
