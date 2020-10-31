package if1.latihan26.waktusaatini;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan waktu saat ini
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Waktu {
    static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);
    
    public static void tampilWaktu() {
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
    
    public static void main(String[] args) {
        tampilWaktu();
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}