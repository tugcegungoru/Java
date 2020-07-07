public class Main {

    public static void main(String[] args) {
        int number = 19;
        int counter = 0;

        if(number == 1){
            System.out.println("Number is not prime");
            return;
        }

        if(number < 1){
            System.out.println("Number is invalid");
            return;
        }
        for(int i=2;i<number/2;i++){
            if(number % i == 0){
                counter = 1;
                break;
            }
        }
        if(counter == 1)
            System.out.println("Number is not prime");
        else
            System.out.println("Number is prime");
    }
}
