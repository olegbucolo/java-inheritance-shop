package org.lessons.java.inheritance;

public class Cuffie extends Prodotto {
    private Boolean isWireless;
    private String color;

    public Cuffie(Boolean isWireless, String color, int codice, String nome, String marca, double prezzo, int iva) {
        super(codice, nome, marca, prezzo, iva);
        this.isWireless = isWireless;
        this.color = color;
    }

    public Boolean getIsWireless() {
        return isWireless;
    }

    public void setIsWireless(Boolean isWireless) {
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
