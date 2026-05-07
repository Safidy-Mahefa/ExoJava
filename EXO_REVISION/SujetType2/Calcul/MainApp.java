public class MainApp{
    public static void main(String[] args){
        int[] tab = {1,2,3,4,5};
        Multiplication multiply = new Multiplication();
        System.out.println("Le minimum du tableau vaut : "+ multiply.minimum(tab));
        System.out.println("Le maximum du tableau vaut : "+ multiply.maximum(tab));
        System.out.println("La multiplication des elements du tableau vaut : "+ multiply.executer(tab));
    }
}