package fr.digi.cda2024.factory1;

import fr.digi.cda2024.factory1.model.TypeUnit;

public class Usine {
    private final SimpleFabrique simpleFabrique;

    public Usine() {
        this.simpleFabrique = new SimpleFabrique();
    }

    public Unite formerUnite(TypeUnit type) {
        return simpleFabrique.creerUnite(type);
    }
}
