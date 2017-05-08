package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {
    
    protected static final Scanner scanner = new Scanner(System.in);
    Tuomari tuomari;
    String ekanSiirto, tokanSiirto;

    protected static boolean siirtoOk(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
        
    protected void kirjaa () {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
    }
    
    protected abstract void teeSiirrot();
    
    protected void lopeta() {        
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
     
   public void pelaa() {
       System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
       teeSiirrot();      
        while (siirtoOk(ekanSiirto) && siirtoOk(tokanSiirto)) {
            kirjaa();
            teeSiirrot();           
        }
        
    lopeta();
    }
    
}
