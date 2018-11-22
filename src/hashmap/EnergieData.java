/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author Nicola Temporal
 */
public class EnergieData {

    int jahr;
    int energieform;
    int betrag;
    int bevCH;
    int bevAus;

    public EnergieData(int jahr, int energieform, int betrag, int bevCH, int bevAus) {
        this.jahr = jahr;
        this.energieform = energieform;
        this.betrag = betrag;
        this.bevCH = bevCH;
        this.bevAus = bevAus;
    }

    public int getBetrag() {
        return betrag;
    }

    public int getBevAus() {
        return bevAus;
    }

    public int getBevCH() {
        return bevCH;
    }

    public int getEnergieform() {
        return energieform;
    }

    public int getJahr() {
        return jahr;
    }
}
