package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int klasse = 2;

        switch (klasse) {
            case 1:
                System.out.println("Eins!");
                break;
            case 2:
                System.out.println("Zwei!");
                break;
            case 3:
                System.out.println("Drei!");
                break;
            default:
                System.out.println("Keines!");
                break;
        }


        int preis = 200;
        double steuerklasse1 = 0.2;
        double steuerklasse2 = 0.16;
        double steuerklasse3 = 0.08;
        int klasse1 = 2;



        switch (klasse1) {
            case 1:
                System.out.println("Preis in StKl1: " + (preis + preis * steuerklasse1));
                break;
            case 2:
                System.out.println("Preis in StKl2: " + (preis + preis * steuerklasse2));
                break;
            case 3:
                System.out.println("Preis in StKl3: " + (preis + preis * steuerklasse3));
                break;
            default:
                System.out.println("Keins");
                break;
        }
    }
}
