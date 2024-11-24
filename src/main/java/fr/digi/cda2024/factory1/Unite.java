package fr.digi.cda2024.factory1;

import fr.digi.cda2024.factory1.model.TypeUnit;

import java.util.ArrayList;
import java.util.List;

public abstract class Unite {
    protected TypeUnit typeUnit;
    protected String nom;
    protected int coutConstruction;
    protected int precisionAttaque;
    protected int esquiveDefense;
    protected List<String> equipements;

    {
        equipements = new ArrayList<String>();
    }

    public Unite() {
    }

    public void consommerRessource() {
        //
    }

    public abstract void equiper();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Unite{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", coutConstruction=").append(coutConstruction);
        sb.append(", precisionAttaque=").append(precisionAttaque);
        sb.append(", esquiveDefense=").append(esquiveDefense);
        sb.append(", equipements=").append(equipements);
        sb.append('}');
        return sb.toString();
    }
}
