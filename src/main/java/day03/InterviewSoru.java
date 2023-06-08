package day03;

import java.util.Scanner;

public class InterviewSoru {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = input.next().toLowerCase();
        System.out.println(kelimeKontrol(kelime));
    }

    public static String kelimeKontrol(String kelime) {
        String ilkHarf = "";
        String ikinciHarf = "";

        if (kelime.charAt(0) == 'g'){
            ilkHarf = kelime.substring(0, 1);
        }

        if (kelime.charAt(1) == 'h') {
            ikinciHarf = kelime.substring(1, 2);
        }

        String yeniKelime = ilkHarf + ikinciHarf + kelime.substring(2);
        return yeniKelime;
    }
}
