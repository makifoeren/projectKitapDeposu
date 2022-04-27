import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {


    static List<Depo> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapNumaratik = 1007;

    public static void anaMenu() throws InterruptedException {

        FeykKitapEkle.feykKitapEkle();

        System.out.println("====================================\n\t "
                + "YILDIZ KITAP CENTER'A HOSGELDINIZ " +
                "\n===================================" +
                "\n============= İŞLEMLER ============\r\n     " +
                "1-KITAP EKLEME \r\n    " +
                " 2-NUMARA ILE KITAP ARAMA\r\n     " +
                "3-BILGI ILE KITAP ARAMA \r\n     " +
                "4-NUMARA ILE SİLME\r\n     " +
                "5-KITAP LISTELEME\r\n " +
                "    6-CIKIS");

        System.out.println("Lutfen yapmak istediginiz islemi giriniz...");

        int islem = 0;
        while (true) {
            try {
                islem = scan.nextInt();
                if (islem<=0 || islem>6){
                    System.out.println("Tercihiniz 1 ile 6 arasi olmalidir...");
                }else break;
            } catch (Exception e) {
                String str=scan.nextLine();
                System.out.println("Lutfen numerik veri giriniz...");
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println(" ");
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
                numaraIleSilme();
                break;

            case 5://KITAP LISTELEME
                kitapListele();

                break;

            case 6://CIKIS
                cikisb();
                break;

            default:
                System.out.println("Hatali veri girdiniz..");
                islemeDevamDongusu();

        }// switch sonu

    }

    private static void numaraIleSilme() throws InterruptedException {
        System.out.println("Silmek istediginiz kitabin numarasini giriniz...");
        int no = scan.nextInt();
        int silno = 0;
        for (Depo eachsl : kitapListesi) {
            if (eachsl.getKitapNo() == no) {
                kitapListesi.remove(eachsl);
                System.out.println("Silmek istediginiz , " + eachsl.getKitapNo() + " silindi. ");
                silno++;
                break;
            }

        }
        if (silno == 0) {
            System.out.println("Aradiginiz kitap bulunamamistir");
        }
        islemeDevamDongusu();

    }

    private static void kitapListele() throws InterruptedException {
        System.out.println("Kitaplar listeleniyor");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(" ");
        for (Depo klist : kitapListesi) {
            System.out.println(klist.toString());
        }
        islemeDevamDongusu();
    }

    private static void bilgiIleKitapAram() throws InterruptedException {
        System.out.println("Yazar adi ile aramak icin 1 \nKitap adi ile aramak icin 2 \nFiyat ile aramak icin 3");
        int secim = scan.nextInt();

        switch (secim) {
            case 1: {
                scan.nextLine();//dummy
                System.out.println("Yazar adi giriniz :");
                String yazarAdi = scan.nextLine();
                System.out.println("Yazar Adi : " + yazarAdi);

                int kontrol = 0; // kitap yoksa 0, varsa 1

                for (Depo each : kitapListesi) {
                    if (each.getYazarAdi().equalsIgnoreCase(yazarAdi)) {
                        System.out.println(each.toString());
                        kontrol++;
                    }
                }
                if (kontrol == 0) {
                    System.out.println("Aradiginiz yazar bulunamamistir");
                }
            }
            islemeDevamDongusu();
            break;

            case 2:
                scan.nextLine();//dummy
                System.out.println("Kitap adi giriniz :");
                String kitapAdi = scan.nextLine();
                System.out.println("Kitap Adi : " + kitapAdi);

                int kontrol1 = 0; // kitap yoksa 0, varsa 1

                for (Depo eachk : kitapListesi) {
                    if (eachk.getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                        System.out.println(eachk.toString());
                        kontrol1++;
                    }
                }
                if (kontrol1 == 0) {
                    System.out.println("Aradiginiz kitap bulunamamistir");
                }
                islemeDevamDongusu();

                break;

            case 3:
                scan.nextLine();//dummy
                System.out.println("Aradiginiz kitabin fiyatini giriniz :");
                int fiyat = scan.nextInt();
                System.out.println("Kitabin fiyat : " + fiyat);

                int kontrol2 = 0; // kitap yoksa 0, varsa 1

                for (Depo eachf : kitapListesi) {
                    if (eachf.getKitapFiyat() == fiyat) {
                        System.out.println(eachf.toString());
                        kontrol2++;
                    }
                }
                if (kontrol2 == 0) {
                    System.out.println("Aradiginiz kitap bulunamamistir");
                }
                islemeDevamDongusu();
                break;

            default:
                System.out.println(" Yanlis giris yaptiniz..");

                islemeDevamDongusu();

        }

    }

    private static void numaraIleKitapArama() throws InterruptedException {
        System.out.println("Aradiginiz istediginiz kitabin numarasini yaziniz...");
        int numara = scan.nextInt();

        int kontroln = 0;

        for (Depo eachn : kitapListesi) {
            if (eachn.getKitapNo() == numara) {
                System.out.println(eachn.toString());
                kontroln++;
            }
        }
        if (kontroln == 0) {
            System.out.println("Aradiginiz kitap bulunamda...");
        }
        islemeDevamDongusu();

    }

    private static void kitapEkle() throws InterruptedException {

        System.out.println("Lutfen yazar adi giriniz...");
        String yazarAdi = scan.nextLine();
        scan.nextLine();
        System.out.println("Lutfen kitap adi giriniz...");
        String kitapAdi = scan.nextLine();

        System.out.println("Lutfen kitabin fiyatini giriniz...");
        int kitapFiyat = scan.nextInt();

        int kitapNo = kitapNumaratik;
        kitapNumaratik++;

        Depo yeniKitap = new Depo(kitapNo, yazarAdi, kitapAdi, kitapFiyat);
        kitapListesi.add(yeniKitap);

        islemeDevamDongusu();

    }

    private static void islemeDevamDongusu() throws InterruptedException {

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
        System.exit(0);
    }

}
