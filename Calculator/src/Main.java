public class Main {

    public static void main(String[] args) {

        DortIslem islem = new DortIslem();
        int sayi1 = 10;
        int sayi2 = 2;

        System.out.println( islem.Toplama(sayi1,sayi2));
        System.out.println(islem.Çıkarma(sayi1,sayi2));
        System.out.println(islem.Çarpma(sayi1,sayi2));
        System.out.println(islem.Bölme(sayi1,sayi2));
    }
}
