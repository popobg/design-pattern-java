package fr.digi.cda2024.factory1.model;

import fr.digi.cda2024.factory1.Unite;

public class SoldatHumain extends Unite {

    public SoldatHumain() {
        this.typeUnit = TypeUnit.SOLDAT;
    }

    public void equiper() {
        System.out.println("Equiper soldat");
    }
}
