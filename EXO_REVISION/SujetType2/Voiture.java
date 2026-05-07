// Partie A : Creer la classe voiture
public class Voiture{
    // Les attributs
    private String mMarque;
    private String mModele;
    private int mVitesse;

    // Le constructeur
    public Voiture(String marque, String modele, int vitesse){
        this.mMarque = marque;
        this.mModele = modele;
        this.mVitesse = vitesse;
    }

    // Les methodes
    public String getMarque(){
        return this.mMarque;
    }
    public String getModele(){
        return this.mModele;
    }
    public int getVitesse(){
        return this.mVitesse;
    }

    public void accelerer(int valeur){
        this.mVitesse += valeur;
        System.out.println("Vous avez accelere de : " +valeur+ "km.");
    }

    public void afficher(){
        System.out.println("Marque : "+this.mMarque+ ", Modele : "+this.mModele+ ", Vitesse : "+this.mVitesse);
    }
}