public class Concatenation extends TexteOperation{
    // Redefinition des methodes
    @Override
    public String valeurInitiale(){
        return "";
    }

    @Override
    public String operation(String a, String b){
        return a + b;
    }
}