package wednesday3105;

import java.util.Scanner;

public class TeamWork01 {
    public static void main(String[] args) {
        /* Task1
            Bir top belirli yükseklikten atılmaktadır.
            Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
            Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
            Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.*/

            double atilanYukseklik = 10; //Baslangic metersi
            double sekenTop    = atilanYukseklik*3/4;//sektiginde ciktigi yukseklik
            double toplamyol   = atilanYukseklik;
            int vurmaSayisi = 0;

            do {
                atilanYukseklik = sekenTop;
                toplamyol += atilanYukseklik;
                vurmaSayisi++;
                sekenTop = atilanYukseklik*3/4;     //yeni ziplama yuksekligi

               }while (sekenTop >=1);

            System.out.println("Toplam yol: "+ toplamyol+" metre");
            System.out.println("Top "+vurmaSayisi+" kere yere vurdu.");

        /* Task2 :
            Verilen bir sayının faktöriyelini özyineli (recursive) olarak
            hespalayan fonksiyonu yazınız.
                        Örnek Ekran Çıktıları
                        Bir sayi giriniz: 6*5*4*3*2*1=720
                        Faktöriyeli: 720
                        Bir sayı giriniz: 3*2*1
                        Faktöriyeli 6                       */

            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir sayi giriniz..");
            int sayi = input.nextInt();

            int faktoriyel =1;
            String faktoriyeFormul = "";

            for (int i = sayi;  i>=1;   i--){
                faktoriyel *=i;
                faktoriyeFormul += i;
                if (i !=1){
                    faktoriyeFormul += "*";
                }
            }
            System.out.println("Faktoriyel Formulu: " +faktoriyeFormul);
            System.out.println("Faktoriyeli: "+ faktoriyel);






     /*  task3:
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    /* task4 :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */

    }
}
