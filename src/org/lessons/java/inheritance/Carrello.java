package org.lessons.java.inheritance;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Inserisci il prodotto che stai inserendo nel carrello. Scrivi 'televisore', 'cuffie' oppure 'smartphone'");
        String prodottoNelCarrello = scanner.nextLine();
        switch (prodottoNelCarrello) {
            case "televisore":
                System.out.println("Compila i campi del televisore");

                int tCodice = (int) (Math.random() * 1000);
                System.out.println("Inserisci la marca del televisore:");
                String tBrand = scanner.nextLine();
                System.out.println("Inserisci il nome del televisore:");
                String tName = scanner.nextLine();
                System.out.println("Inserisci le dimensioni del televisore:");
                String tSize = scanner.nextLine();
                System.out.println("il televisore e' smart? Scrivi 'true' se e' smart, 'false' se non lo e'");
                boolean tSmart = scanner.nextBoolean();
                System.out.println("Inserisci il prezzo del televisore in formato $$.$$ esempio: 55.99 oppure 333.00");
                double tPrice = scanner.nextDouble();
                int tIva = 20;
                Televisori t = new Televisori(tSize, tSmart, tCodice, tName, tBrand, tPrice, tIva);
                System.out.println("Dettagli del televisore scelto: " + t);

                break;
            case "cuffie":
                System.out.println("Compila i campi delle cuffie");

                int cCodice = (int) (Math.random() * 1000);
                System.out.println("Inserisci la marca delle cuffie:");
                String cBrand = scanner.nextLine();
                System.out.println("Inserisci il nome delle cuffie:");
                String cName = scanner.nextLine();

                System.out.println("Inserisci il colore delle cuffie:");
                String cColor = scanner.nextLine();
                System.out.println("Le cuffie sono wireless? Scrivi 'true' se sono wireless, 'false' se non lo sono");
                boolean cWireless = scanner.nextBoolean();

                System.out.println("Inserisci il prezzo delle cuffie in formato $$.$$ esempio: 55.99 oppure 333.00");
                double cPrice = scanner.nextDouble();
                int cIva = 20;
                Cuffie c = new Cuffie(cWireless, cColor, cCodice, cName, cBrand, cPrice, cIva);
                System.out.println("Dettagli delle cuffie scelte: " + c);

                break;
            case "smartphone":
                System.out.println("Compila i campi dello smartphone");

                int sCodice = (int) (Math.random() * 1000);
                System.out.println("Inserisci la marca dello smartphone:");
                String sBrand = scanner.nextLine();
                System.out.println("Inserisci il nome dello smartphone:");
                String sName = scanner.nextLine();

                System.out.println("Inserisci il codice IMEI dello smartphone. Contiene 4 lettere per comodita'");
                int sIMEI = scanner.nextInt();
                System.out.println("Quanta memoria ha lo smartphone?");
                int sWireless = scanner.nextInt();

                System.out.println("Inserisci il prezzo dello smartphone in formato $$.$$ esempio: 55.99 oppure 333.00");
                double sPrice = scanner.nextDouble();
                int sIva = 20;
                Smartphone s = new Smartphone(sIMEI, sWireless, sCodice, sBrand, sName, sPrice, sIva);
                System.out.println("Dettagli dello smartphone scelte: " + s);

                break;
            default:
                System.out
                        .println("Non hai inserito alcun prodotto.");

        }
    }
}
