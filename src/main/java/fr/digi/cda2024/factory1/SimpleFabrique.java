package fr.digi.cda2024.factory1;

import fr.digi.cda2024.factory1.model.CommandantHumain;
import fr.digi.cda2024.factory1.model.SoldatHumain;
import fr.digi.cda2024.factory1.model.TypeUnit;

public class SimpleFabrique {
    public Unite creerUnite(TypeUnit type) {
        return switch (type) {
            case TypeUnit.SOLDAT -> new SoldatHumain();
            case TypeUnit.COMMANDANT -> new CommandantHumain();
            default -> {
                System.out.println("Impossible de trouver le type.");
                yield null;
            }
        };
    }
}
