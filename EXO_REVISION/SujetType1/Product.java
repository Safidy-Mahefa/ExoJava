// EXO3: Polymorphisme, la classe Product qui fait le produit des elements dans un tableau
public class Product extends ArrayOperation{
    public double singleOperation(double acc, double number){
        return acc * number;
    }

    public double getNeutral(){
        return 1;
    }
}