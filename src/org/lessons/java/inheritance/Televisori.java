package org.lessons.java.inheritance;

public class Televisori extends Prodotto {
    private String size;
    private boolean isSmart;

    public Televisori(String size, boolean isSmart, int codice, String nome, String marca, double prezzo, int iva) {
        super(codice, nome, marca, prezzo, iva);
        this.size = size;
        this.isSmart = isSmart;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getIsSmart() {
        return isSmart;
    }

    public void setIsSmart(Boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString(){
        return super.toString() +
        ", size='" + size + "/'" +
        ", isSmart=" + isSmart;
    }
}
