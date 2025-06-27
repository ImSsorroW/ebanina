
import huy.Huynya;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zalupka");

        int kakashka = 28;
        double kekeshka = 3.7;
        long kikishka = 283848586;
        float kazashka = 22.2f;
        System.out.println(kakashka + " " + kekeshka + " " + kikishka + " " + kazashka);
        Huynya huy = new Huynya("sosal", "da", "net");
        System.out.println(huy.getL() + " " + huy.getO() + " " + huy.getX());
        huy.setL("Da");
        huy.setO("Net");
        huy.setX("Sosal");
        System.out.println(huy.getL() + " " + huy.getO() + " " + huy.getX());

        char h = 'h';
        String bb = "Biba Boba";
        boolean dd = false;

        //Scanner vaska = new Scanner(System.in);
        //System.out.print("pizdec?");
        //String che = vaska.nextLine();
        //System.out.print("pizdec?" +  che);

        // int chisloebat = scan.nextInt();
        // System.out.println(chisloebat + 22);

        System.out.println("Dodavaniye ebat'");
        System.out.println("Pervuyu cifru syuda:");
        Scanner sc = new Scanner(System.in);
        float adin = sc.nextFloat();
        //short kaka = 10, byaka = 20;
        //int da = kaka + byaka;
        //da += 10;
        //da++;
        System.out.println("Vtoruyu cifru syuda:");
        float dva = sc.nextFloat();
        float tri = adin + dva;
        float chetiri = adin - dva;
        float pyat = adin * dva;
        float shest = adin / dva;
        System.out.println("Otvet +: " + tri);
        System.out.println("Otvet -: " + chetiri);
        System.out.println("Otvet *: " + pyat);
        System.out.println("Otvet /: " + shest);

        if (pyat >= 10 && pyat <= 35) {
            System.out.println("ZAEBIS");
        } else {
            System.out.println("HUYNYA");
        }

        float aga = tri;

        if (aga >= 100) {
            System.out.println("KONEC");
        } else if (aga <= 0) {
            System.out.println("IDI NAHUY");
        } else {
            while (aga < 100) {
                float ugu = aga + 1;
                aga = ugu + 0;
                System.out.println(ugu);
            }

        }
        Scanner sc2 = new Scanner(System.in);
        int pepsi = sc2.nextInt();
        switch (pepsi) {
            case 12:
                System.out.println("ZAEBIS");
                break;
            case 21:
                System.out.println("KONEC");
                break;
            default:
                System.out.println("PIZDEC");
        }

        for (float omg = aga; omg > 1; omg /= 2) {
            System.out.println(omg);
        }

    }
}