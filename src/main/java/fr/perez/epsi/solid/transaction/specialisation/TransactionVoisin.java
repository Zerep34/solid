package fr.perez.epsi.solid.transaction.specialisation;

import fr.perez.epsi.solid.echange.Echange;
import fr.perez.epsi.solid.transaction.Transaction;

import java.util.List;
import java.util.Random;

public class TransactionVoisin extends Transaction {

    public TransactionVoisin() {}

    @Override
    public void transaction(List<Double> pop, Echange classEchange){
        Random random = new Random();
        int index1 = random.nextInt(pop.size());
        int index2;
        if(index1 == pop.size()-1){
            index2 = 0;
        }
        else{
            index2 = index1 + 1;
        }
        classEchange.echange(pop, index1, index2);
    }
}
