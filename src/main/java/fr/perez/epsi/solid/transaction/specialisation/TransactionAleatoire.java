package fr.perez.epsi.solid.transaction.specialisation;

import fr.perez.epsi.solid.echange.Echange;
import fr.perez.epsi.solid.transaction.Transaction;

import java.util.List;
import java.util.Random;

/**
 * Transaction entre deux individus aléatoire
 */
public class TransactionAleatoire extends Transaction {

    public TransactionAleatoire() {
    }

    /**
     * @param pop          Liste de richesse
     * @param classEchange Type d'échange à effectuer
     */
    @Override
    public void transaction(List<Double> pop, Echange classEchange) {
        Random random = new Random();
        int index1 = random.nextInt(pop.size());
        int index2 = random.nextInt(pop.size());
        while (index2 == index1) {
            index2 = random.nextInt(pop.size());
        }
        classEchange.echange(pop, index1, index2);
    }
}
