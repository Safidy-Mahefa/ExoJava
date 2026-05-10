public class Main{
    public static void main(String[] args){
        double[] notes = {11.5,14,9.75,17,6.26,15};
        Moyenne m = new Moyenne();
        System.out.println("La moyenne des notes est : "+ m.calculer(notes));
    }
}