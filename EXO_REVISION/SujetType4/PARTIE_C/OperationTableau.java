// PARTIE C : Polymorphisme avancé
abstract public class OperationTableau{
    public double calculer(double[] tab){
        double resultat = initialisation();

        for( double x : tab){
            resultat = operation(resultat,x);
        }

        return resultat;
    }
    // Les methodes abstraites
    abstract public double initialisation();
    abstract public double operation(double a, double b);
}