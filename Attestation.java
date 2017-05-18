/**
 * Attestation
 */
public class Attestation {

    private State etat;

    public void valider(){
        etat=new Validee();
        etat.valider();
    }
    public void enregistrer(){
        etat=new Enregistree();
        etat.enregistrer();
    }
    public void demander(){
        etat= new Enregistree();
        etat.enregistrer();
    }
    public void verifier(){
        etat=new Verifiee();
        etat.verifier();
    }
    public void modifier(){
        etat=new Verifiee();
        etat.modifier();

    }
    public void imprimer(){
        etat=new Livree();
        etat.imprimer();
    }
}