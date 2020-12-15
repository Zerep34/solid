package fr.perez.epsi.solid.richesse.specialisation;

import fr.perez.epsi.solid.richesse.Richesse;

import java.util.Random;

public class RichesseLoiNormale extends Richesse {

    public double calculRichesseIndividu(int sigma, int mu) {
        Random generator = new Random();
        // The nextGaussian() function returns a normal distribution of random numbers with the following parameters: a mean of zero and a standard deviation of one
        double num = generator.nextGaussian();
        return sigma * num + mu;
    }
}
