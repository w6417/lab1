package com.company;
import java.util.Scanner;
import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.in;
public class Main {

    public static void main(String[] args) {
        System.out.println("Mój wiek to: " + zad1());
        System.out.println("Moje imię to: " + zad2());

        Random rand = new Random();
        int a = rand.nextInt(25) - 10;
        int b = rand.nextInt(25) - 10;

        zad3(a,b);
        System.out.println(zad4(a));
        System.out.println(zad5(30));
        System.out.println(zad6(2));
        System.out.println(zad7(9));

        //zad8
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj dolną granicę przedziału: ");
        int p=in.nextInt();
        System.out.println("Podaj górną granicę przedziału: ");
        int o=in.nextInt();
        int c = rand.nextInt(o-p+1)+p;
        int d = rand.nextInt(o-p+1)+p;
        int e = rand.nextInt(o-p+1)+p;

        System.out.println("Bok pierwszy: " + c + " , " + "bok drugi: " + d + " , " + "bok trzeci: " + e);
        System.out.println("Czy z danych boków można zbudować trójkąt? " + zad8(c,d,e));

    }
    public static int zad1(){
        return 25;
    }
    public static String zad2(){
        return "Justyna";
    }
    public static void zad3(int a, int b){
        System.out.println("Suma: " + a + "+" + b + "=" + (a+b));
        System.out.println("Różnica: " + a + "-" + b + "=" + (a-b));
        System.out.println("Iloczyn: " + a + "*" + b + "=" + (a*b));
    }
    public static boolean zad4(int a){
        return a%2==0;
    }
    public static boolean zad5(int a){
       return a%15==0;
    }
    public static int zad6(int a){
       return (int) pow(a,3);
    }
    public static int zad7(int a){
        return (int) sqrt(a);
    }
    public static boolean zad8(int q, int w, int e) {
        if (q > w && q > e && w + e > q)
            return true;
        else if (w > q && w > e && q + e > w)
            return true;
        else if (e > q && e > w && q + w > e)
            return true;

        else
            return false;
    }
}
