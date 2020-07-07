public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[4];

        ogrenciler[0] = "Tuğçe";
        ogrenciler[1] = "Saadet";
        ogrenciler[2] = "Melek";
        ogrenciler[3] = "Esma";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------");
        
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
