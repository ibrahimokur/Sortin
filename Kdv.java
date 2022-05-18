import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        double tutar,Kdvorani = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutari giriniz :");
        tutar = input.nextDouble();
        double Kdvtutar = tutar * Kdvorani;
        System.out.print(Kdvtutar);
        double Kdvlitutar = Kdvtutar + tutar;
        System.out.print("\n");

        System.out.print(Kdvlitutar);
    }
}
