package Animals;

public class Chien extends Canin implements Rintintin {
    public Chien() {
        super();
    }

    public Chien(String couleur, int poids) {
        super(couleur, poids);
    }

    public void crier() {
        System.out.println("J'aboie sans raison !");
    }

    public void faireCalin() {
        System.out.println("Je te fais un GROS CÂLIN");
    }

    public void faireLeBeau() {
        System.out.println("Je fais le beau !");
    }

    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles...");
    }

    /*
     * public int getPoids(){
     * return this.poids;
     * }
     * 
     * public String getCouleur(){
     * return this.couleur;
     * }
     * 
     * public void setPoids(int poids){
     * this.poids = poids;
     * }
     * 
     * public void setCouleur(String couleur){
     * this.couleur = couleur;
     * };
     */
}
