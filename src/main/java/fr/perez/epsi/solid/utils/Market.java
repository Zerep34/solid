package fr.perez.epsi.solid.utils;

import fr.perez.epsi.solid.config.ParamConfig;
import fr.perez.epsi.solid.echange.Echange;
import fr.perez.epsi.solid.factory.IIndividuFactory;
import fr.perez.epsi.solid.richesse.Richesse;
import fr.perez.epsi.solid.transaction.Transaction;

import java.util.List;


public class Market {

    ParamConfig paramConfig;

    Transaction classTransaction;

    Echange classEchange;

    Richesse classRichesse;

    public List<Double> population;

    public Market(ParamConfig paramConfig, Echange classEchange, Richesse classRichesse,
                  Transaction classTransaction, IIndividuFactory factoryIndividu) {
        this.paramConfig = paramConfig;
        this.classTransaction = classTransaction;
        this.classEchange = classEchange;
        this.classRichesse = classRichesse;
        this.population = factoryIndividu.factoryIndividu(paramConfig, classRichesse);
    }

    public void marketExchange(){
        for (int i = 0; i < paramConfig.getIteration(); i++) {
            classTransaction.transaction(this.population, classEchange);
        }
    }


}
