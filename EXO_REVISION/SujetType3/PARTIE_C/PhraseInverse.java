// La calsse PhraseInverse qui herite de texte operation
public class PhraseInverse extends TexteOperation{
    @Override
    public String operation(String a, String b){
        return b + a;
    }

    @Override
    public String valeurInitiale(){
        return "";
    }
}