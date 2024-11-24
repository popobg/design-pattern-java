package fr.digi.cda2024;

import fr.digi.cda2024.factory1.Unite;
import fr.digi.cda2024.factory1.Usine;
import fr.digi.cda2024.factory1.model.TypeUnit;

public class Main {
    public static void main(String[] args) {
        // Factory design pattern
        Usine usine = new Usine();
        Unite commandant = usine.formerUnite(TypeUnit.COMMANDANT);
        Unite soldat = usine.formerUnite(TypeUnit.SOLDAT);
        System.out.println(commandant.getClass());
        commandant.equiper();
        soldat.equiper();
    }
}