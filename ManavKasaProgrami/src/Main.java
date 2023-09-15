import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // örnek fiyatlandırmayı yapalım
        double nar = 14.99;
        double kivi = 21.80;
        double üzüm = 12.50;
        double muz = 10;

        // kilo değişkenlerini kullanıp kullanıcadan talep edelim.
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Kilo : ");
        double narkilo = inp.nextDouble();
        System.out.print("Kaç Kilo : ");
        double kivikilo = inp.nextDouble();
        System.out.print("Kaç Kilo : ");
        double üzümkilo = inp.nextDouble();
        System.out.print("Kaç Kilo : ");
        double muzkilo = inp.nextDouble();


// formülüze ederek toplam tutarı bulalım.
        double toplam = (nar * narkilo) + (kivi * kivikilo)  + ( üzüm * üzümkilo )  + (muz * muzkilo) ;



        System.out.println(" Toplam Tutar : " + toplam);


    }
}