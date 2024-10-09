
package vezerlo;

import ajtok.AjtokGUI;
import modell.AjtoModell;


public class Guivezerlo {
    private AjtoModell modell;
    private AjtokGUI nezet;
    
    public Guivezerlo(AjtoModell modell, AjtokGUI nezet) {
        this.modell = modell;
        this.nezet = nezet;
        guibeallitas();
        start(); 
    }

    private void start() {
        nezet.megjelenit(modell.kezdes());
    }  

    private void guibeallitas() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });
}
}
