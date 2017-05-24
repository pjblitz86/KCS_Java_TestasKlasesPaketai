package Nuskaitymas;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class NuskaitymoKlase {

    private double kuroSanaudos;
    private double nuvaziuotiKm;
    // metodas paklausiantis ir nuskaitantis i kintamuosius nuvaziuotus km ir kuro sanaudas
    public void uzklausimas(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus km:");
        nuvaziuotiKm = skeneris.nextDouble();
        System.out.println("Iveskite kuro sanaudas litrais:");
        kuroSanaudos = skeneris.nextDouble();
    }

    public double getKuroSanaudos() {
        return kuroSanaudos;
    }

    public void setKuroSanaudos(double kuroSanaudos) {
        this.kuroSanaudos = kuroSanaudos;
    }

    public double getNuvaziuotiKm() {
        return nuvaziuotiKm;
    }

    public void setNuvaziuotiKm(double nuvaziuotiKm) {
        this.nuvaziuotiKm = nuvaziuotiKm;
    }
}
