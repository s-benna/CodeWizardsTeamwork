package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class muhtesemSayi {
    /*  Perfect Number (Mukemmel sayi)
        Kullanici tarafindan bir sayiya kadar olan sayilarin,
        mukemmel olup olmadigini bulan method yaziniz.
        Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
        kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
        ORNEK: (6, 28, 496, 8128)
        INPUT      :  6
        OUTPUT     :  1,2,3             */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int number = input.nextInt();

        bolenBul(number);

    }
    public static void bolenBul (int number){

        List<Integer> bolenList = new ArrayList<>();

        int bolenToplam = 0;

        for (int i = 1; i<number ; i++) {
            if (number % i ==0){ // bolumunden kalan 0 olursa calisacak
                bolenList.add(i);
                bolenToplam += i;  //bolenToplam = i+bolenToplam;
            }
        }


        if (bolenToplam == number){
            System.out.println(number+" Sayisi Mukemmel'dir\n" +
                    "Bolenler Listesi: "+bolenList);
        }else {
            System.out.println("Mukemmel sayi yazmadiniz.");
        }

    }

}
