/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author mikko
 */
public class Nollaa implements Komento{
    Sovelluslogiikka logiikka;
    JTextField tuloskentta, syotekentta;
    
    public Nollaa (Sovelluslogiikka s, JTextField tuloskentta, JTextField syotekentta) {
        this.logiikka = s;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;        
    }

    @Override
    public void suorita() {
        logiikka.nollaa();
        tuloskentta.setText("0");
        syotekentta.setText("0");
    }

    @Override
    public boolean peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
