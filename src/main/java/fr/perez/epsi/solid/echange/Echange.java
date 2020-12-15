package fr.perez.epsi.solid.echange;

import java.util.List;
import java.util.Random;

/**
 * Class abstraite Echange
 */
abstract public class Echange {

    /**
     * Choisie qui recoit la part entre deux individus
     * @return int 1 ou 2
     */
    public int choice() {
        Random random = new Random();
        return random.nextInt(2 - 1) + 1;
    }

    /**
     * Calcul du pot commun (valeur richesse 1 + valeur richesse 2)
     * @param richesse1 valeur richesse individu 1
     * @param richesse2 valeur richesse individu 2
     * @return somme des richesse
     */
    public double calculPotCommun(double richesse1, double richesse2) {
        return richesse1 + richesse2;
    }

    /**
     * Echange de richesse entre deux individus
     * @param pop Liste d'individu
     * @param i index de l'individu 1 dans la liste
     * @param j index de l'individu 2 dans la liste
     */
    public abstract void echange(List<Double> pop, int i, int j);
}
