/* PARTIE C : Creer une classe abstraite Texte operation
                -Creer concatenation
                -Creer phraseInverse
 */

public abstract class TexteOperation{
    public String traiter(String[] mots){
        String resultat = valeurInitiale();
        for(int i = 0; i<mots.length; i++){
            resultat = operation(resultat,mots[i]);
        }
        return resultat;
    }

    public abstract String valeurInitiale();
    public abstract String operation(String a, String b);
}