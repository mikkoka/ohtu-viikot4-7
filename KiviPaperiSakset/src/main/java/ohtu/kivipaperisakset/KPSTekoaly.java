package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPS {
Tekoaly tekoaly;    

public KPSTekoaly () {
        tuomari = new Tuomari();
        tekoaly = new Tekoaly();
    }
       
@Override
    public void teeSiirrot () {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
    }

}