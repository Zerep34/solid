package fr.perez.epsi.solid.richesse.specialisation;

import fr.perez.epsi.solid.richesse.Richesse;

import java.util.Random;

/**
 * Initialisation d'une richesse avec des valeurs aléatoires entre deux bornes
 */
public class RichesseRandom extends Richesse {

    /**
     * Initialisation des richesses, calcul d'une valeur
     * @param sigma
     * @param mu
     * @return double richesse (nombre aléatoire)
     */
    public double calculRichesseIndividu(int sigma, int mu) {
        Random generator = new Random();
        return generator.nextInt((mu + sigma) - (mu - sigma)) + (mu - sigma);
    }
}
