package fr.perez.epsi.solid.utils;

import fr.perez.epsi.solid.config.ParamConfig;
import fr.perez.epsi.solid.echange.Echange;
import fr.perez.epsi.solid.factory.IIndividuFactory;
import fr.perez.epsi.solid.richesse.Richesse;
import fr.perez.epsi.solid.transaction.Transaction;

import java.util.List;


/**
 * Class marché
 */
public class Market {

    public List<Double> population;
    ParamConfig paramConfig;
    Transaction classTransaction;
    Echange classEchange;
    Richesse classRichesse;

    /**
     *
     * Initialisation de l'objet Market
     * @param paramConfig configuration
     * @param classEchange class Echange
     * @param classRichesse class Richesse
     * @param classTransaction class Transaction
     * @param factoryIndividu interface factory Individu
     */
    public Market(ParamConfig paramConfig, Echange classEchange, Richesse classRichesse,
                  Transaction classTransaction, IIndividuFactory factoryIndividu) {
        this.paramConfig = paramConfig;
        this.classTransaction = classTransaction;
        this.classEchange = classEchange;
        this.classRichesse = classRichesse;
        this.population = factoryIndividu.factoryIndividu(paramConfig, classRichesse);
    }

    /**
     * Méthode s'occupant de faire les transactions
     */
    public void marketExchange() {
        for (int i = 0; i < paramConfig.getIteration(); i++) {
            classTransaction.transaction(this.population, classEchange);
        }
    }


}
