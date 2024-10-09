
package modell;

import ajtok.Ajto;


public class AjtoModell {
    private Ajto[] ajtok;
    private int valasztas;
    
    
    public AjtoModell() {
        ajtok = new Ajto[3];
        ajtok[0] = new Ajto("Első", false);
        ajtok[1] = new Ajto("Második", false);
        ajtok[2] = new Ajto("Harmadik", false);
    }
    
    public String kezdes() {
        String s = "";
        int i = 1;
        for (Ajto ajto : ajtok) {
            String n = ajto.getNev();
            s += i++ + ". " + n + "láda: " +  "\n";
        }
        return s;
    }
    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }
    
    public String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        s = ajtok[valasztas].isKincs() ? s : "Sajnos nem talált!";
        return s;
    }        
    
}
