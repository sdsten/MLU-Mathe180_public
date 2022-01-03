// Uebungsblatt 9, Aufgabe 1, finished

import java.lang.Math;

public class Schrittzaehler {
    
    // constructor
    public Schrittzaehler (int ziel) {
        this.schritteZiel = ziel;
    }
    // attributes
    int schritteZiel = 0;
    int schritteGelaufen = 0;
    
    // laufen
    public void laufen (int schritte) {
        
        schritteGelaufen += schritte;
    }
    // schwimmen
    public void schwimmen (int Minuten) {
        
         schritteGelaufen += (Minuten * 50);
    }
    // tagesziel-check
    public boolean tageszielErreicht () {
        
        boolean zielErreicht = false;
        if (schritteGelaufen >= schritteZiel) {
            zielErreicht = true;
        }
        
        return zielErreicht;
    }
    // steps left
    public int schritteBisZumTagesziel () {
        
        int schritteBisZumTagesziel = schritteZiel - schritteGelaufen;
        if (schritteBisZumTagesziel < 0) {
            schritteBisZumTagesziel = 0;
        }
        
        return schritteBisZumTagesziel;
    }
    // progress-info
    public String toString () {
        String info = "";
        
        if (schritteGelaufen == 0) {
            info = "0 Schritte??? Da ist aber noch einiges zu tun bis zum Ziel von " 
                   +  schritteZiel + " Schritten...";
        }
        else if ((schritteGelaufen != 0) && (schritteGelaufen < schritteZiel)) {
            info = schritteGelaufen + " Schritte geschafft! " 
                   + schritteBisZumTagesziel() + " Schritte uebrig von " + schritteZiel + " Schritten.";
        }
        else {
            info = "Ziel erreicht! " + Math.abs(schritteZiel - schritteGelaufen) + " Schritte ueber dem Ziel von " + schritteZiel + " Schritten.";
        }

        return info;
    }
}