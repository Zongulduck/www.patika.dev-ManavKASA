import java.util.Scanner;
public class ManavKASA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,e,d,m,p,toplam;
        System.out.print("Kaç kg armut satın alındı ? :");
        a= input.nextDouble();
        a=a*2.14;
        System.out.print("Kaç kg elma satın alındı ? :");
        e= input.nextDouble();
        e=e*3.67;
        System.out.print("Kaç kg domates satın alındı ? :");
        d= input.nextDouble();
        d=d*1.11;
        System.out.print("Kaç kg muz satın alındı ? :");
        m= input.nextDouble();
        m=m*0.95;
        System.out.print("Kaç kg patlıcan satın alındı ? :");
        p= input.nextDouble();
        p=p*5.00;
        System.out.print("Toplam tutar :");
        toplam=a+e+d+m+p;
        System.out.print(toplam +" TL");
    }
}
