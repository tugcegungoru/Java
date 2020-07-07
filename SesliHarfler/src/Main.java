public class Main {

    public static void main(String[] args) {
        char harf = 'o';
        char[] inceSesli = {'e','i','ö','ü','E','İ','Ö','Ü'};
        char[] kalinSesli = {'a','ı','o','u','A','I','O','U'};
        boolean sesliMi = false;
        for (char h1:inceSesli) {
            if (h1 == harf) {
                System.out.println("Harf ince seslidir.");
                sesliMi =true;
                return;
            }
        }

        for (char h2:kalinSesli) {
            if (h2 == harf) {
                System.out.println("Harf kalin seslidir.");
                sesliMi=true;
                return;
            }
        }
        if(!sesliMi){
            System.out.println("Harf sessizdir.");
        }
    }
}
