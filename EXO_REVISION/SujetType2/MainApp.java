public class MainApp{
    public static void main(String[] args){
        Voiture toyota = new Voiture("Toyota","Supra",217);
        toyota.afficher();
        toyota.accelerer(20);
        toyota.afficher();
        VoitureSport nissan = new VoitureSport("Nissan","GTR",224,false);
        nissan.afficher();
        nissan.afficherTurbo();
        nissan.activerTurbo();
        nissan.afficherTurbo();
    }
}