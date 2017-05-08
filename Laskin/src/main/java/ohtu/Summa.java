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
public class Summa implements Komento {
    Sovelluslogiikka logiikka;
    JTextField tuloskentta, syotekentta;
    
    public Summa (Sovelluslogiikka logiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.logiikka = logiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;        
    }

    @Override
    public void suorita() {
        int syote = 0;
        try {
            syote = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        logiikka.plus(syote);
        tuloskentta.setText(Integer.toString(logiikka.tulos()));
    }

    @Override
    public boolean peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
