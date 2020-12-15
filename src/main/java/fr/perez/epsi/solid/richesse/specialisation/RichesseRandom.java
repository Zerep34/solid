package fr.perez.epsi.solid.richesse.specialisation;

import fr.perez.epsi.solid.richesse.Richesse;

import java.util.Random;

public class RichesseRandom extends Richesse {

    public double calculRichesseIndividu(int sigma, int mu) {
        Random generator = new Random();
        return generator.nextInt((mu + sigma) - (mu - sigma)) + (mu - sigma);
    }
}
