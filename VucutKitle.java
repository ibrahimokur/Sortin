import java.util.Scanner;

public class VucutKitle {

    public static void main(String[] args){

        double kg,boy,endeks;
        Scanner include = new Scanner(System.in);
        System.out.print("Lutfen Kilonuzu Giriniz :");
        kg = include.nextDouble();
        System.out.print("Lutfen Boyunuzu Metre Cinsinden Giriniz :");
        boy = include.nextDouble();
        endeks = kg / (boy * boy);
        System.out.println("Vucut Kitle Endeksiniz :" +endeks);


    }
}
