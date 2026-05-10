public class Moyenne extends OperationTableau{
    @Override
    public double calculer(double[] tab){
        double resultat = initialisation();

        for( double x : tab){
            resultat = operation(resultat,x);
        }

        return resultat/tab.length;
    }

    @Override
    public double initialisation(){
        return 0;
    }

    @Override
    public double operation(double a, double b){
        return a + b;
    }
}