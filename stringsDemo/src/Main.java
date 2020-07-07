public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);
        System.out.println("Eleman sayisi:" + mesaj.length()); //string uzunluğu
        System.out.println("5.eleman:" + mesaj.charAt(4));  //4.indisteki eleman
        System.out.println(mesaj.concat("Yaşasın!"));   //string ile concat içerisindeki kelimeyi birleştir
        System.out.println(mesaj.startsWith("B"));  //Cümle B harfi ile başlıyorsa true döndürür yoksa false
        System.out.println(mesaj.endsWith("!"));    //Cümle ünlemle bitmiyor false döner
        char [] karakterler = new char[10];
        mesaj.getChars(0,8,karakterler, 0); //belli bir karakterden itibaren karakterler dizisine yazar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //aramaya soldan başlar 7.index
        System.out.println(mesaj.lastIndexOf('a')); //aramaya sağdan başlar 9.index (index yine soldan sayılır)
        System.out.println(mesaj.replace('ü','u')); //tüm ü harflerini u harfine dönüştürür
        System.out.println(mesaj.substring(5)); //5.indisten itibaren tüm stringi yazar
        System.out.println(mesaj.substring(6,8)); //6.indisten 8.indise kadar yaz

        for(String kelime:mesaj.split(" ")){ //stringi boşluktan ayırır
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());   //başta ve sondaki boşlukları siler
    }
}
