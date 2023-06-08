package day02;

import java.util.Arrays;
import java.util.Scanner;

public class BakkalDefteri {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.                      */

        Scanner input = new Scanner(System.in);

        double gunlukKazanc [] = new double[7];
        String gunler [] = {"Pazar", "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi"};

        int i = 0;

        while (i< gunlukKazanc.length){                         // Array uzunlugu kadar devem etsin

            System.out.println((i+1)+". gunu giriniz.");
            gunlukKazanc [i] = input.nextDouble();              //her seferinde degisecek
            i++;
        }//while
        System.out.println(Arrays.toString(gunlukKazanc));



        getOrtalamaKazanc(gunlukKazanc);
        System.out.println(getOrtalamaKazanc(gunlukKazanc));
        double ort = getOrtalamaKazanc(gunlukKazanc);

        getOrtalamaninUstundeKazancGunleri(ort, gunlukKazanc, gunler);
        getOrtalamaninAltindaKazancGunleri(ort, gunlukKazanc, gunler);

    }//main
    public static double getOrtalamaKazanc(double[] gunlukKazanc) {
        double sum =0;
        for (double w : gunlukKazanc) {
            sum +=w;
        }

        double ortalama = sum/gunlukKazanc.length;

        return ortalama;


    }//getOrtalamaKazanc


    public static void getOrtalamaninUstundeKazancGunleri(double ort, double[] gunlukKazanc, String[] gunler) {

        String ortGunUst ="";
        System.out.println("\nOrtalama ustunde olan gunler:");
        for (int i = 0; i <gunlukKazanc.length ; i++) {
            if (gunlukKazanc[i]>ort){
                ortGunUst = gunler [i];
                System.out.print(" "+ortGunUst);
            }
        }

    }//getOrtalamaninUstundeKazancGunleri



    private static void getOrtalamaninAltindaKazancGunleri(double ort, double[] gunlukKazanclar, String[] gunler) {
        System.out.println("\nOrtalamanin  altinda kalan gunler:");
        String ortGunAlt="";

        for (int i = 0; i < gunler.length; i++) {

            if (gunlukKazanclar[i] < ort) {
                ortGunAlt = gunler[i];
                System.out.print(" "+ortGunAlt);
            }

        }

    }//getOrtalamaninAltindaKazancGunleri

}//class
