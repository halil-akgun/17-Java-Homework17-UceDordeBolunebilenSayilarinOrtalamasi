package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Ödev
//        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        System.out.println("\n0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplama");

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin: ");
        int a = input.nextInt(), sumNumbers = 0, lengthNumbers = 0;
        double average = 0;

        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sumNumbers += i;
                lengthNumbers++;
            }
        }
        System.out.println("ortalama: " + (sumNumbers / lengthNumbers));


    }
}