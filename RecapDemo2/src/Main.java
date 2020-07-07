public class Main {

    public static void main(String[] args) {

        //double[] myList = new double[4];
        double[] mylist = {1.2,9.3,4.3,5.6};
        double total=0;
        double enBuyuk = mylist[0];

        //for(int i=0;i<mylist.length;i++){
        //    System.out.println(mylist[i]);
        //}

        for(double number:mylist){
            System.out.println(number);
            total += number;
            if(number > enBuyuk)
                enBuyuk = number;
        }
        System.out.println("Toplam:" + total);
        System.out.println("En Büyük:" + enBuyuk);
    }
}
