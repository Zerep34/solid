package fr.perez.epsi.solid.transaction;

import fr.perez.epsi.solid.echange.Echange;

import java.util.List;

abstract public class Transaction {

    abstract public void transaction(List<Double> pop, Echange classEchange);


}
