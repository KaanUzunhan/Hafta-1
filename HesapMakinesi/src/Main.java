import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double n1,n2,n3;
        Scanner input=new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz: ");
        n1= input.nextDouble();
        System.out.print("ikinci sayıyı giriniz: ");
        n2=input.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        n3= input.nextDouble();

        switch ((int) n3) {
            case 1 : System.out.print("Toplam : " + (n1+n2));
            break;
            case 2:System.out.print("Çıkarma : " + (n1-n2));
            break;
            case 3:
                System.out.println("Bölme :" + (n1/ 0<n2) );
                   System.out.println("Bir sayı 0`a bölünmez !! ");
            break;
            case 4:System.out.print("Çarpma : "  + (n1*n2) );
            break;
            default:System.out.println("Hatalı Giriş Yaptınız !!" );



        }
    }
}