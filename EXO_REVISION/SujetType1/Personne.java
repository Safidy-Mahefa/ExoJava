// Exo2 PARTIE A: Implementation de la classe personne en se référant au diagramme UML
public class Personne{
    String nom;
    String prenom;
    int age;

    public Personne(String nom, String prenom, int age){ //Constructeur
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAge(){
        return this.age;
    }

    public void anniversaire(){
        int anniv = 2026 - this.age;
        System.out.println("Anniversaire : "+ anniv );
    }

    public void direSalut(){
        System.out.println("Salut "+ this.nom + " " + this.prenom);
    }

}