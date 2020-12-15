package fr.perez.epsi.solid.factory;

import fr.perez.epsi.solid.config.ParamConfig;
import fr.perez.epsi.solid.richesse.Richesse;

import java.util.List;

public interface IIndividuFactory {

    List<Double> factoryIndividu(ParamConfig paramConfig, Richesse classRichesse);
}
