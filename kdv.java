import java.util.Scanner;

public class kdv {

 public static void main(String[] args) {

    double tutar,kdvtutari,kdv,kdvlitutari;

    Scanner deger = new Scanner(System.in);
    System.out.print("Lütfen tutarı giriniz:");
    tutar= deger.nextDouble();

    if (tutar>1000){

        kdv=0.08;
        kdvtutari = tutar*kdv;
        kdvlitutari=tutar+kdvtutari;
        
        System.out.println("KDV Oranı: %8");
        System.out.println("Tutar:"+tutar);
        System.out.println("KDV Tutarı:"+kdvtutari);
        System.out.println("KDV Dahil Tutar"+kdvlitutari);

    }
    else {

        kdv=0.18;
        kdvtutari = tutar*kdv;
        kdvlitutari=tutar+kdvtutari;
        
        System.out.println("KDV Oranı: %18");
        System.out.println("Tutar:"+tutar);
        System.out.println("KDV Tutarı:"+kdvtutari);
        System.out.println("KDV Dahil Tutar"+kdvlitutari);

    }

    
}



}