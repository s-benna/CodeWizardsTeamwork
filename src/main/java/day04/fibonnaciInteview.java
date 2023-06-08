package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonnaciInteview {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birden buyuk tamsayi giriniz..");

        int sayi = input.nextInt();

        ArrayList <Integer> fibonacciList = new ArrayList<>(); // 0 ve 1 olmasi gerekiyor
        fibonacciList.add(0);
        fibonacciList.add(1);

        int i=0;

        while (fibonacciList.get(i)+fibonacciList.get(i+1) <= sayi ){   //Her dongude onceki iki sayinin toplamini alir.
           fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i+1)); //Sirayla ekleme yaptigi icin index gitmedik.
           i++;
        }
        System.out.println(fibonacciList);


    }//main
}//class
