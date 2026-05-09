// PARTIE A : La classe etudiant
public class Etudiant{
    // Les attributs
    private String mNom;
    private String mMatricule;
    private double mMoyenne;

    // Constructeur
    public Etudiant(String nom, String matricule, double moyenne){
        this.mNom = nom;
        this.mMatricule = matricule;
        this.mMoyenne = moyenne;
    }
    // accesseurs
    public String getNom(){
        return this.mNom;
    }
    public String getMatricule(){
        return this.mMatricule;
    }
    public double getMoyenne(){
        return this.mMoyenne;
    }

    // Autres methodes
    public boolean admis(){
        if(this.mMoyenne >= 10){
            return true;
        }
        return false;
    }

    public void afficherInfos(){
        System.out.println("----------------------");
        System.out.println("Nom :" + this.mNom);
        System.out.println("Matricule :" + this.mMatricule);
        System.out.println("Moyenne :" + this.mMoyenne);
        if(this.admis()){
            System.out.println("Eleve admis !");
        }
        else{
            System.out.println("Eleve non admis !");
        }
        System.out.println("----------------------");
    }
}