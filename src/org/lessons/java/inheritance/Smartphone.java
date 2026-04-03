package org.lessons.java.inheritance;

public class Smartphone extends Prodotto {
    private int codiceIMEI;
    private int availableMemory;

    public Smartphone(int codiceIMEI, int availableMemory, int codice, String nome, String marca, double prezzo,
            int iva) {
        super(codice, nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.availableMemory = availableMemory;
    }

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(int codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }

    public void setAvailableMemory(int availableMemory) {
        this.availableMemory = availableMemory;
    }
    
    @Override
    public String toString(){
        return super.toString() +
        ", codice IMEI='" + codiceIMEI + "/'" +
        ", totale memoria=" + availableMemory;
    }
}
