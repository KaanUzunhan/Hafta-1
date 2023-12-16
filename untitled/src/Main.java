import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r=input.nextInt();

        double Alan = pi * r * r;
        double Cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + Alan);
        System.out.println("Dairenin Cevresi: "+Cevre);

 }
    }
