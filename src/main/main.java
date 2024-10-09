
package main;

import ajtok.AjtokGUI;
import modell.AjtoModell;
import vezerlo.Guivezerlo;

public class main {


    public static void main(String[] args) {
        AjtoModell modell = new AjtoModell();
        AjtokGUI nezet = new AjtokGUI();
        new Guivezerlo(modell, nezet);
    }
    
}
