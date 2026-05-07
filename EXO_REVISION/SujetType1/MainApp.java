public class MainApp{
    public static void main(String [] args){
        Personne safidy = new Personne("Safidy","Mahefa",19);
        safidy.direSalut();
        safidy.anniversaire();
        System.out.println("Votre nom est : "+ safidy.getNom());

        Etudiant james = new Etudiant("James","Harden",18,"IGGLIA2B");
        james.sePresenter();
        james.anniversaire();

        //EXO3
        double [] numbers = {1,2,3,4,5};
        ArrayOperation sum = new Sum();
        System.out.println("La somme est : "+ sum.doArrayOperation(numbers)); //Affiche la somme des elements dans le tableau

        //Produit des elements du tableau
        ArrayOperation product = new Product();
        System.out.println("Le produit est : "+ product.doArrayOperation(numbers));
    }
}