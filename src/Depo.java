import java.util.Scanner;

public class Depo {

    String kitapAdi;
    String yazarAdi;
    int kitapNo;
    int kitapFiyat;


    public Depo() {
    }

    public Depo(String kitapAdi, String yazarAdi, int kitapNo, int kitapFiyat) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapNo = kitapNo;
        this.kitapFiyat = kitapFiyat;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public int getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(int kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }
}
