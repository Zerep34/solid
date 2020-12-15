package fr.perez.epsi.solid.factory;

import fr.perez.epsi.solid.config.ParamConfig;
import fr.perez.epsi.solid.richesse.Richesse;

import java.util.List;

/**
 * Interface IIndividuFactory
 */
public interface IIndividuFactory {

    /**
     * @param paramConfig Configuration
     * @param classRichesse Objet Richesse
     * @return liste d'individu( richesse)
     */
    List<Double> factoryIndividu(ParamConfig paramConfig, Richesse classRichesse);
}
