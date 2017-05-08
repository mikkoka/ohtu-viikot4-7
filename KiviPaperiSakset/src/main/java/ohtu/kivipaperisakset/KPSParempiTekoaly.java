package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {
    TekoalyParannettu tekoaly;

    public KPSParempiTekoaly() {
        tuomari = new Tuomari();
        tekoaly = new TekoalyParannettu(20);     
    }

    @Override
    protected void teeSiirrot() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
    }
}