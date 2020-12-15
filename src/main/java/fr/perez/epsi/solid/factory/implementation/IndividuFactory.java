package fr.perez.epsi.solid.factory.implementation;

import fr.perez.epsi.solid.config.ParamConfig;
import fr.perez.epsi.solid.factory.IIndividuFactory;
import fr.perez.epsi.solid.richesse.Richesse;

import java.util.ArrayList;
import java.util.List;

public class IndividuFactory implements IIndividuFactory {

    public IndividuFactory(){}

    @Override
    public List<Double> factoryIndividu(ParamConfig paramConfig, Richesse classRichesse){
        List<Double> pop = new ArrayList<>();
        for (int i = 0; i < paramConfig.getN(); i++) {
            pop.add(classRichesse.calculRichesseIndividu(paramConfig.getSigma(), paramConfig.getMu()));
        }
        return pop;
    }
}
