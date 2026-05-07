public class Multiplication extends Calcul{

    @Override
    public int operation(int a, int b){
        return a * b;
    }

    @Override
    public int valeurInitiale(){
        return 1;
    }
}