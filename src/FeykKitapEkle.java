public class FeykKitapEkle {

    public static void feykKitapEkle() {

        Depo k1 = new Depo(1000, "Ahmet Can", "Hayat", 12);
        Depo k2 = new Depo(1001, "Ali Kilic", "Matematik", 13);
        Depo k3 = new Depo(1002, "Tahir", "Kimya", 15);
        Depo k4 = new Depo(1003, "Yildiz", "Kimya", 10);
        Depo k5 = new Depo(1004, "yakup", "Turkce", 14);
        Depo k6 = new Depo(1005, "Ahmet", "Yasam", 15);
        Depo k7 = new Depo(1006, "Ahmet", "Güven", 19);


        Methods.kitapListesi.add(k1);
        Methods.kitapListesi.add(k2);
        Methods.kitapListesi.add(k3);
        Methods.kitapListesi.add(k4);
        Methods.kitapListesi.add(k5);
        Methods.kitapListesi.add(k6);
        Methods.kitapListesi.add(k7);


    }
}