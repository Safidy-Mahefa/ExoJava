public class Main{
    public static void main(String[] args){
        String[] mots = {"h","e","l","l","o"};
        Concatenation concatener = new Concatenation();
        PhraseInverse inverseur = new PhraseInverse();
        System.out.println("La phrase concatenee :"+ concatener.traiter(mots));
        System.out.println("La phrase inversee :"+ inverseur.traiter(mots));
    }
}