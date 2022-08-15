import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;
        double sonuc = 0;

        Scanner input= new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz(n1): ");
        n1=input.nextInt();

        System.out.print("Ikinci sayiyi giriniz(n2): ");
        n2=input.nextInt();

        System.out.println("1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme ");
        System.out.print("Seciminiz: ");
        select=input.nextInt();


        switch (select){
            case 1:
               sonuc= n1+n2;
               break;

            case 2:
               sonuc= n1-n2;
               break;

            case 3:
               sonuc= n1*n2;
               break;

            case 4:
               sonuc= n1/n2;
               break;
        }
        System.out.println("Islem sonucu: " + sonuc );
    }
}
