import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {


    static List<Depo> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapNumaratik = 1000;

    public static void anaMenu() {

        System.out.println("====================================\n\t "
                + "YILDIZ kITAP CENTER'A HOSGELDINIZ " +
                "\n===================================" +
                "\n============= İŞLEMLER ============\r\n     " +
                "1-KITAP EKLEME \r\n    " +
                " 2-NUMARA ILE KITAP ARAMA\r\n     " +
                "3-BILGI ILE KITAP ARAMA \r\n     " +
                "4-NUMARA ILE SİLME\r\n     " +
                "5-KITAP LISTELEME\r\n " +
                "    6-CIKIS");

        System.out.println("Lutfen yapmak istediginiz islemi giriniz...");
        int islem = scan.nextInt();


        switch (islem) {

            case 1: // KITAP EKLEME
                kitapEkle();
                break;

            case 2://NUMARA ILE KITAP ARAMA
                numaraIleKitapArama();
                break;

            case 3://BILGI ILE KITAP ARAMA
                bilgiIleKitapAram();
                break;

            case 4://NUMARA ILE SİLME
                break;

            case 5://KITAP LISTELEME
                break;

            case 6://CIKIS
                break;

            default:


        }// switch sonu


    }

    private static void bilgiIleKitapAram() {
        System.out.println("Yazar adi ile aramak icin 1 \nKitap adi ile aramak icin 2 \nFiyat ile aramak icin 3");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Aradiginiz yazarin adini giriniz...");
                String yazarAdi = scan.nextLine();
                for (int i = 0; i < kitapListesi.size(); i++) {

                    if (yazarAdi == kitapListesi.get(i).getYazarAdi()) {

                        System.out.println("Kitabin no : " + kitapListesi.get(i).getKitapNo());
                        System.out.println("Kitabin yazari : " + kitapListesi.get(i).getYazarAdi());
                        System.out.println("Kitabin adi : " + kitapListesi.get(i).getKitapAdi());
                        System.out.println("Kitabin fiyati : " + kitapListesi.get(i).getKitapFiyat());

                    } else System.out.println("Aradiginiz kitap bulunamadi..");

                }

                break;

            case 2:


                break;

            case 3:


                break;


            default:

        }

    }

    private static void numaraIleKitapArama() {
        System.out.println("Aradiginiz istediginiz kitabin numarasini yaziniz...");
        int numara = scan.nextInt();

        boolean tercih = true;

        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapListesi.get(i).getKitapNo() == numara) {

                System.out.println("Kitabin no : " + kitapListesi.get(i).getKitapNo());
                System.out.println("Kitabin yazari : " + kitapListesi.get(i).getYazarAdi());
                System.out.println("Kitabin adi : " + kitapListesi.get(i).getKitapAdi());
                System.out.println("Kitabin fiyati : " + kitapListesi.get(i).getKitapFiyat());
                tercih = false;

            }
        }
        if (tercih == true) {
            System.out.println("Aradiginiz kitap bulunamdi..");
        }
    }

    private static void kitapEkle() {

        System.out.println("Lutfen yazar adi giriniz...");
        String yazarAdi = scan.nextLine();
        scan.nextLine();
        System.out.println("Lutfen kitap adi giriniz...");
        String kitapAdi = scan.nextLine();

        System.out.println("Lutfen kitabin fiyatini giriniz...");
        int kitapFiyat = scan.nextInt();

        int kitapNo = kitapNumaratik;
        kitapNumaratik++;

        Depo yeniKitap = new Depo(kitapNo, kitapAdi, yazarAdi, kitapFiyat);
        kitapListesi.add(yeniKitap);

        islemeDevamDongusu();

    }

    private static void islemeDevamDongusu() {

        int tercih = 0;

        System.out.println("Devam etmek icin 1 \nCikmak icin 2  yaziniz..");
        tercih = scan.nextInt();

        if (tercih == 1) anaMenu();
        else if (tercih == 2) cikisb();
        else System.out.println("Hatali verigirdiniz ...");
        islemeDevamDongusu();


    }

    private static void cikisb() {

        System.out.println("Isleminizi tamamladiniz yine bekleriz...");
    }

}
