// PARTIE B : La classe Boursier héritant de la classe Etudiant
public class Boursier extends Etudiant{
    private double mMontantBourse;

    public Boursier(String nom, String matricule, double moyenne, double MontantBourse){
        super(nom,matricule,moyenne);
        this.mMontantBourse = MontantBourse;
    }

    public void afficherBourse(){
        this.afficherInfos();
        System.out.println("==> Montant bourse: "+ this.mMontantBourse+ "Ar");
    }

    public void augmenterBourse(double montant){
        this.mMontantBourse += montant;
        System.out.println("La bourse de: "+this.getNom()+" Augmente de: "+ montant);
    }
}