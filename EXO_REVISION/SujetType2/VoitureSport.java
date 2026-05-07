// PARTIE B : Classe VoitureSport heritant de la classe Voiture.
public class VoitureSport extends Voiture{
    private boolean mTurbo;

    public VoitureSport(String marque, String modele, int vitesse, boolean turbo){
        super(marque,modele,vitesse);
        this.mTurbo = turbo;
    }
    public void activerTurbo(){
        this.mTurbo = true;
    }

    public void afficherTurbo(){
        if(this.mTurbo){
            System.out.println("Le turbo est active !");
        }
        else{
             System.out.println("Le turbo est desactive !");
        }
    }
}