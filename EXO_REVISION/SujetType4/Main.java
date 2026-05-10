public class Main{
    public static void main(String[] args){
        System.out.println("Compte 1 : ");
        CompteEpargne compte1 = new CompteEpargne("12345",200,2);
        compte1.afficherSolde();
        compte1.deposer(456);
        compte1.afficherSolde();
        compte1.calculerInteret();
        System.out.println("\nCompte 2 : ");
        CompteCourant compte2 = new CompteCourant("54321",1250,true);
        compte2.afficherSolde();
        compte2.peutRetirer();
    }
}