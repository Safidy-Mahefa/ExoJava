// PARTIE B : Creer la classe compte courant:
public class CompteCourant extends CompteBancaire{
    private boolean decouvertAutorise;

    public CompteCourant(String numero, double solde, boolean decouvertAutorise){
        super(numero,solde);
        this.decouvertAutorise = decouvertAutorise;
    }
    public CompteCourant(){
        super("0000",0);
        this.decouvertAutorise = false;
    }

    public void peutRetirer(){
        if(this.decouvertAutorise){
            System.out.println("Ce compte peut retirer");
        }else{
            System.out.println("Ce compte ne peut pas retirer");
        }
    }
}