package fr.perez.epsi.solid.utils;

import java.util.List;

public class Gini {

    public static double calculGini(List<Double> values) {
        double sumOfDifference = values.stream()
                .flatMapToDouble(v1 -> values.stream().mapToDouble(v2 -> Math.abs(v1 - v2))).sum();
        double mean = values.stream().mapToDouble(v -> v).average().getAsDouble();
        return sumOfDifference / (2 * values.size() * values.size() * mean);
    }
}
