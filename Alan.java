import java.util.Scanner;

public class Alan {

    public static void main(String[] args){

    int a,b,c,cevre,u;
    double alan;


    Scanner input = new Scanner(System.in);
    System.out.print("A Kenarini giriniz :");
    a = input. nextInt();
    System.out.print("B Kenarini Giriniz :");
    b = input. nextInt();
    System.out.print("C Kenarini Giriniz :");
    c = input. nextInt();

    cevre = (a+b+c) / 2;
    alan = Math.sqrt(cevre *(cevre - a) * (cevre - b) * (cevre -c));
    System.out.println("Ucgenin Alani :" + alan);






}
}
