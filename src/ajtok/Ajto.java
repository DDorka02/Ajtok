
package ajtok;


public class Ajto {
    private String nev;
    private boolean kincs;
    
    public Ajto(String nev, String felirat) {
        this(nev, false);
    }
    
    public Ajto(String nev, boolean kincs) {
        this.nev = nev;
        this.kincs = kincs;
    }

    public String getNev() {
        return nev;
    }

    public boolean isKincs() {
        return kincs;
    }
    public void kincsetElhelyez(){
        kincs = true;
    }
    
    public void kincsetKivesz(){
        kincs = false;
    }
}
