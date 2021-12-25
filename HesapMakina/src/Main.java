import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner say1=new Scanner(System.in);
        System.out.println("işlem yapmak için bir sayı giriniz:");
        int a=say1.nextInt();

        Scanner say2=new Scanner(System.in);
        System.out.println("işlem yapmak için ikinci bir sayı giriniz:");
        int b=say2.nextInt();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("TOPLAMA için 1");
        System.out.println("ÇIKARMA için 2");
        System.out.println("ÇARPMA için 3");
        System.out.println("BÖLME için 4'ü seçiniz");
        System.out.print("Secimininizi giriniz: ");
int aa=1;
int islem=0;
        Scanner input=new Scanner(System.in);
        while(aa==1) {
        islem = input.nextInt();
             if(islem<1||islem>4)
             {
                 System.out.println("lütfen 1-4 arası seçim yapınız");
             }
         else   aa=0;
        }
        switch(islem) {
            case 1:
                System.out.println("Toplama isleminin sonucu = " + (a+b));
                break;
            case 2:
                System.out.println("Çıkarma isleminin sonucu = " + (a-b));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu = " + (a*b));
                break;
            case 4:
                System.out.println("Bölme isleminin sonucu = " + (a/b));
        }







    }
}
