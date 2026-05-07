// EXO3: Plymorphisme
abstract public class ArrayOperation{
    public double doArrayOperation(double [] numbres){
        double acc = getNeutral();
        for(int i = 0; i < numbres.length; i++){
            acc = singleOperation(acc, numbres[i]);
        }
        return acc; //retourne la somme des nombres dans un tableau
    }

    //Méthodes abstraites
    abstract public double singleOperation(double acc, double number);
    abstract public double getNeutral();
}