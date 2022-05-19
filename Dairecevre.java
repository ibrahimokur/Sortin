import java.util.Scanner;

public class Dairecevre {

    public static void main(String[] args){
        double r,a;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dairenin yari capini giriniz :");
        r = input.nextDouble();
        System.out.print("Merkez Acisinin olcusunu derece cinsinden giriniz :");
        a = input.nextDouble();
        double pi = 3.14,alan = pi * r *r,cevre = 2 * pi * r,dilim;
        dilim =  (pi * (r *r) * a) / 360;
        System.out.println("Dairenin Alani :" + alan);
        System.out.println("Darienin Cevresi :" + cevre);
        System.out.println("Darirenin Dilim Alani :" + dilim);




    }
}
