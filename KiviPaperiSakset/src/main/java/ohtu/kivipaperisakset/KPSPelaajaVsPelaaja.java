package ohtu.kivipaperisakset;


public class KPSPelaajaVsPelaaja extends KPS {
    
    public KPSPelaajaVsPelaaja () {
        tuomari = new Tuomari();        
            } 

    @Override
    protected void teeSiirrot() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = scanner.nextLine();
    }

}