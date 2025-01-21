package selec;


public class Losa1Coef {
    double coeficiente,alfa, beta, delta, gamma;
    boolean posicion;

    public Losa1Coef(double coeficiente,double alfa, double beta, double delta, double gamma, boolean posicion) {
        this.coeficiente = coeficiente;
        this.alfa = alfa;
        this.beta = beta;
        this.delta = delta;
        this.gamma = gamma;
        this.posicion = posicion;
    }

    public Losa1Coef(double alfa, double beta, double delta, double gamma) {
        this.alfa = alfa;
        this.beta = beta;
        this.delta = delta;
        this.gamma = gamma;
    }

   
}
