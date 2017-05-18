/**
 * Etat
 */
public interface State {
    public void valider();
    public void enregistrer();
    public void demander();
    public void verifier();
    public void modifier();
    public void imprimer();
}