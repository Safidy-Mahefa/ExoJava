public class MainApp{
    public static void main(String[] args){
        Etudiant Etudiant1 = new Etudiant("Koto","12345",11.25);
        Etudiant Etudiant2 = new Etudiant("Fara","52545",9.95);
        Etudiant Etudiant3 = new Etudiant("Bema","42445",16.55);
        Etudiant1.afficherInfos();
        Etudiant2.afficherInfos();
        Etudiant3.afficherInfos();

        Boursier Boursier1 = new Boursier("Feno","44444",16.50,150000);
        Boursier1.afficherBourse();
        Boursier1.augmenterBourse(20000);
        Boursier1.afficherBourse();
    }
}