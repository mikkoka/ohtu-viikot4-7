package ohtu.kivipaperisakset;

/**
 *
 * @author mikko
 */
public class KpsFactory {
    public static KPS annaPeli(String kirjain) {
        switch (kirjain) {
            case "a" :
               return new KPSPelaajaVsPelaaja();
            case "b" :
                return new KPSTekoaly();
            case "c" :
                return new KPSParempiTekoaly();
            default :
                return null;
        }
    }    
}
