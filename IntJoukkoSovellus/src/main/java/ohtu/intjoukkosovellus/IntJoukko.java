package ohtu.intjoukkosovellus;

import java.util.HashSet;

public class IntJoukko {

  private HashSet<Integer> luvut; 

    public IntJoukko() {
        luvut = new HashSet<>();
    }

    public IntJoukko(int kapasiteetti) {
        luvut = new HashSet<>();
    }

    public IntJoukko(int kapasiteetti, int kasvatuskoko) {
        luvut = new HashSet<>();

    }

    public boolean lisaa(int luku) {
        return luvut.add(luku);
    }

    public boolean kuuluu(int luku) {
        return luvut.contains(luku);
    }

    public boolean poista(int luku) {
        return luvut.remove(luku);
    }

    public int mahtavuus() {
        return luvut.size();
    }

    @Override
    public String toString() {
        if (luvut.isEmpty()) 
            return "{}";
        String tuotos = "{";
        for (int luku : luvut) 
            tuotos += luku + ", ";
        return tuotos.substring(0, tuotos.length() - 2) + "}";
    }

    public int[] toIntArray() {
        int[] taulu = new int[luvut.size()];
        int i = 0;
        for (int luku : luvut) {
            taulu[i++] = luku;
        }
        return taulu;
    }
    
    public HashSet<Integer> luvut() {
        return luvut;
    }

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        for (int l : a.luvut())
            x.lisaa(l);
        for (int l : b.luvut())
            x.lisaa(l);
        return x;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        HashSet<Integer> bluvut = b.luvut();
        for (int al : a.luvut())
            if (bluvut.contains(al))
                    x.lisaa(al);
         return x;
    }

    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        HashSet<Integer> bluvut = b.luvut();
        for (int al : a.luvut())
            if (!bluvut.contains(al))
                    x.lisaa(al);
         return x;
    }

}
