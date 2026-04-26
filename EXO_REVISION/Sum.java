// EXO3: Plymorphisme (la classe fille)
public class Sum extends ArrayOperation{
    public double singleOperation(double acc, double number){
        return acc + number;
    }

    public double getNeutral(){
        return 0;
    }
}