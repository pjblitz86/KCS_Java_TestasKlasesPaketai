package com.company;

import Nuskaitymas.NuskaitymoKlase;
import Skaiciavimas.SkaiciavimoKlase;
import Spausdinimas.SpausdinimoKlase;

        public class Main {

            public static void main(String[] args) {

                NuskaitymoKlase nuskaitymoKlase = new NuskaitymoKlase();
                SkaiciavimoKlase skaiciavimoKlase = new SkaiciavimoKlase();
                SpausdinimoKlase spausdinimoKlase = new SpausdinimoKlase();

                nuskaitymoKlase.uzklausimas();
                double rezultatas = skaiciavimoKlase.skaiciavimas(nuskaitymoKlase.getKuroSanaudos(), nuskaitymoKlase.getNuvaziuotiKm());
                spausdinimoKlase.spausdinimas(rezultatas);
    }
}
