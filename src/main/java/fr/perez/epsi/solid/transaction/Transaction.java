package fr.perez.epsi.solid.transaction;

import fr.perez.epsi.solid.echange.Echange;

import java.util.List;

/**
 * Classe abstraire d'une transaction
 */
abstract public class Transaction {

    /**
     * Transaction de richesse entre deux individus
     * @param pop Liste de richesse
     * @param classEchange Type d'échange à effectuer
     */
    abstract public void transaction(List<Double> pop, Echange classEchange);


}
