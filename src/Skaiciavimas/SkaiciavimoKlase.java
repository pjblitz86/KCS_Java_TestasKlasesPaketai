package Skaiciavimas;


import Nuskaitymas.NuskaitymoKlase;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class SkaiciavimoKlase {
    private double vidurkis;

    // apskaiciuojame vidurki is NuskaitymoKlase duomenu Nuskaitymas pakete
    public double skaiciavimas(double sanaudos, double atstumas){

        vidurkis = sanaudos*100/atstumas;
        return vidurkis;
    }


}
