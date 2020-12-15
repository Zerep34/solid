package fr.perez.epsi.solid.config;

public class ParamConfig {

    private int mu;

    private int sigma;

    private int iteration;

    private int n;

    public ParamConfig(int mu, int sigma, int iteration, int n) {
        this.mu = mu;
        this.sigma = sigma;
        this.iteration = iteration;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getMu() {
        return mu;
    }

    public void setMu(int mu) {
        this.mu = mu;
    }

    public int getSigma() {
        return sigma;
    }

    public void setSigma(int sigma) {
        this.sigma = sigma;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    @Override
    public String toString() {
        return "ParamConfig{" +
                "mu=" + mu +
                ", sigma=" + sigma +
                ", iteration=" + iteration +
                ", n=" + n +
                '}';
    }
}
