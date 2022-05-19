import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args){

        double kg,armut =2.14,elma = 3.67,domates = 1.11,muz=0.95,patlıcan=5.00,toplamtutar = 0.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen kac Kg Armut Aldiginizi Giriniz :");
        kg = input.nextDouble();
        toplamtutar += armut * kg;
        System.out.print("Lutfen kac Kg Elma Aldiginizi Giriniz :");
        kg = input.nextDouble();
        toplamtutar += elma * kg;
        System.out.print("Lutfen kac Kg Domates Aldiginizi Giriniz :");
        kg = input.nextDouble();
        toplamtutar += domates * kg;
        System.out.print("Lutfen kac Kg Muz Aldiginizi Giriniz :");
        kg = input.nextDouble();
        toplamtutar += muz * kg;
        System.out.print("Lutfen kac Kg Patlican Aldiginizi Giriniz :");
        kg = input.nextDouble();
        toplamtutar += patlıcan *kg;

        System.out.println("Toplam Tutar :"+ toplamtutar + "TL");
    }

}
