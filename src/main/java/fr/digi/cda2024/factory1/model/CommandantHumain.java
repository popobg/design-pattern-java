package fr.digi.cda2024.factory1.model;

import fr.digi.cda2024.factory1.Unite;

public class CommandantHumain extends Unite {

    public CommandantHumain() {
        this.typeUnit = TypeUnit.COMMANDANT;
    }

    public void equiper() {
        System.out.println("Equiper commandant");
    }
}
