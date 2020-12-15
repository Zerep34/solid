package fr.perez.epsi.solid.echange.specialisation;

import fr.perez.epsi.solid.echange.Echange;

import java.util.List;

public class EchangeComplet extends Echange {

    @Override
    public void echange(List<Double> pop, int i, int j) {
        double potCommun = this.calculPotCommun(pop.get(i), pop.get(j));
        int choosenOne = this.choice();
        if (choosenOne == 1) {
            pop.set(i, potCommun);
            pop.set(j, (double) 0);
        } else {
            pop.set(j, potCommun);
            pop.set(i, (double) 0);
        }
    }
}
