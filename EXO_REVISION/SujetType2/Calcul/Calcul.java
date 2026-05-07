//  PARTIE C : Polymorphisme
abstract class Calcul{
    public int executer(int[] tab){
        int acc = valeurInitiale();
        for(int i = 0; i<tab.length; i++){
            acc = operation(acc,tab[i]);
        }
        return acc;
    }

    public int maximum(int[] tab){
        int max = tab[0];
        for(int i = 1; i<tab.length; i++){
            if(tab[i]>max){
                max = tab[i];
            }
        }
        return max;
    }

    public int minimum(int[] tab){
        int min = tab[0];
        for(int i = 1; i<tab.length; i++){
            if(tab[i]<min){
                min = tab[i];
            }
        }
        return min;
    }
    // Les methodes abstraites
    abstract int operation(int acc, int val);
    abstract int valeurInitiale();
}