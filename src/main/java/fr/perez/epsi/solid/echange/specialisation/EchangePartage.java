package fr.perez.epsi.solid.echange.specialisation;

import fr.perez.epsi.solid.echange.Echange;

import java.util.List;
/**
 * Class EchangePartage, richesse distribué aléatoirement entre les deux individus
 */
public class EchangePartage extends Echange {

    /**
     * Implémentation de la méthode de la classe mère
     * @param pop Liste d'individu
     * @param i   index de l'individu 1 dans la liste
     * @param j   index de l'individu 2 dans la liste
     */
    @Override
    public void echange(List<Double> pop, int i, int j) {
        double potCommun = this.calculPotCommun(pop.get(i), pop.get(j));
        double firtsPart = Math.random() * (potCommun - 0);
        double secondPart = potCommun - firtsPart;
        int choosenOne = this.choice();
        if (choosenOne == 1) {
            pop.set(i, firtsPart);
            pop.set(j, secondPart);
        } else {
            pop.set(j, firtsPart);
            pop.set(i, secondPart);
        }
    }
}
