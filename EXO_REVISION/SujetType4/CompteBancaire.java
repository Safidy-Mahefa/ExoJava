// PARTIE A : Creer la classe CompteBancaire
public class CompteBancaire{
    private String numero;
    private double solde;

    public CompteBancaire(String numero, double solde){
        this.numero = numero;
        this.solde = solde;
    }

    public void deposer(double montant){
        if(montant <= 0){
            System.out.println("Erreur de depot, veuillez entrer un montant valide");
            return;
        }
        this.solde += montant;
        System.out.println("Vous avez depose un montant de : "+ montant);
    }

    public void retirer(double montant){
        if(this.solde<montant || montant<= 0){
            System.out.println("Erreur de retrait : Veuillez retirer un montant valide !");
            return;
        }
        this.solde -= montant;
        System.out.println("Vous avez retire un montant de : "+ montant);
    }

    public void afficherSolde(){
        System.out.println("Votre solde est de : "+ this.solde + "Ar");
    }

    // Accesserus
    public String getNumero(){
        return this.numero;
    }
    public double getSolde(){
        return this.solde;
    }
}