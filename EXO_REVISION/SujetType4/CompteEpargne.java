// PARTIE B : Creer la classe compte epargne:
public class CompteEpargne extends CompteBancaire{
    private int tauxInteret;

    public CompteEpargne(String numero, double solde, int tauxInteret){
        super(numero,solde);
        this.tauxInteret= tauxInteret;
    }

    public void calculerInteret(){
        double interet = (this.tauxInteret * this.getSolde())/100;
        System.out.println("L'interet de "+this.getSolde()+" pour "+this.tauxInteret+"% d'interet est de: "+interet);
    }
}