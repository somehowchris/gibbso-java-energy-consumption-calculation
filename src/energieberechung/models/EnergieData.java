/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energieberechung.models;

/**
 *
 * @author chris
 */
public class EnergieData {
        private int jahr;
        private String energieform;
        private int betrag;
        private int bevCH;
        private int bevAus;

    public EnergieData() {
    }

    public EnergieData(int jahr, String energieform, int betrag, int bevCH, int bevAus) {
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

    public int getJahr() {
        return jahr;
    }

    public String getEnergieform() {
        return energieform;
    }

    public void setBetrag(int betrag) {
        this.betrag = betrag;
    }

    public void setBevAus(int bevAus) {
        this.bevAus = bevAus;
    }

    public void setBevCH(int bevCH) {
        this.bevCH = bevCH;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public void setEnergieform(String energieform) {
        this.energieform = energieform;
    }
        
        
}
