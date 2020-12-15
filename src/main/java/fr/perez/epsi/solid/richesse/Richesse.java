package fr.perez.epsi.solid.richesse;

/**
 * Classe abstraire initialisation d'une richesse
 */
abstract public class Richesse {

    /**
     * Initialisation des richesses, calcul d'une valeur
     * @param sigma
     * @param mu
     * @return double richesse
     */
    public abstract double calculRichesseIndividu(int sigma, int mu);
}
