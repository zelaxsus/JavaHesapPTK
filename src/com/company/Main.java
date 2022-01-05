package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("@ZELAXSUS");
	 byte fizik,kimya,matematik,turkce,muzik,tarih;
     Scanner input= new Scanner(System.in);
        System.out.print("Matematik Notunuz; ");
         matematik = input.nextByte();
        System.out.print("Türkçe Notunuz; ");
         turkce=input.nextByte();
        System.out.print("Fizik Notunuz; ");
         fizik=input.nextByte();
        System.out.print("Müzik Notunuz; ");
         muzik=input.nextByte();
        System.out.print("Tarih Notunuz ");
         tarih= input.nextByte();
        System.out.print("Kimya Notunuz; ");
         kimya=input.nextByte();

          int toplam = fizik+kimya+ matematik+ turkce+muzik+ tarih;
         double sonuc= toplam /6.0;
        boolean durum = (int) Math.round(sonuc) < 60;
         switch ( String.valueOf(durum)) {
             case "true":
                 System.out.println("Sınıfta Kaldınız");
             break;
             default:
                 System.out.println("Sınıfı Geçtiniz.");
                 break;
         }
        System.out.println("Ortalamanız\n" +sonuc);


    }
}
