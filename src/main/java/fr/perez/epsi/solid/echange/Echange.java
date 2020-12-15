package fr.perez.epsi.solid.echange;

import java.util.List;
import java.util.Random;

abstract public class Echange {

    public int choice() {
        Random random = new Random();
        return random.nextInt(2 - 1) + 1;
    }

    public double calculPotCommun(double richesse1, double richesse2) {
        return richesse1 + richesse2;
    }

    public abstract void echange(List<Double> pop, int i, int j);
}
