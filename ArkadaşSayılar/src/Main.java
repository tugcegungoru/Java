public class Main {

    // İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
    // 220 : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
    // 284 : 1 + 2 + 4 + 71 + 142 = 220

    public static void main(String[] args) {
	int sayi1 = 17296, total1 = 0;
	int sayi2 = 18416, total2 = 0;

        for(int i=1; i<sayi1;i++){
            if(sayi1 % i == 0){
                total1 += i;
            }
        }
        for(int i=1; i<sayi2;i++){
            if(sayi2 % i == 0){
                total2 += i;
            }
        }

        if(sayi1 == total2 && sayi2 == total1)
            System.out.println("Sayilar kardeştir.");
        else
            System.out.println("Sayilar kardeş değildir.");
    }
}
