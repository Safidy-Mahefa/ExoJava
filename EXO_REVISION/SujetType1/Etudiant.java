// Exo2 PARTIE B: Implementation d'une classe héritant de la classe Personne
public class Etudiant extends Personne{
    private String salle;

    public Etudiant(String nom, String prenom, int age, String salle){
        super(nom,prenom,age);
        this.salle = salle;
    }

    //Nouvelles méthodes
    public void sePresenter(){
        System.out.println("Bonjour, Je m'appelle " + this.nom + " J'ai " +this.age+ " ans et je suis dans la salle " +this.salle+ " et je suis un Etudiant ! ");
    }

    public String getSalle(){
        return this.salle;
    }
}