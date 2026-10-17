package Animals;

public abstract class Animals {
    protected int poids;
    protected String couleur;

    public Animals() {
        this.poids = 0;
        this.couleur = null;
    }

    public Animals(String couleur, int poids) {
        this.poids = poids;
        this.couleur = couleur;
    }

    public abstract void deplacement();

    public abstract void crier();

    public void manger() {
        System.out.println("Je mange de la viande.");
    }

    public void boire() {
        System.out.println("Je bois de l'eau !");
    }

    public String toString(){
        String str = "Je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids;
        return str;
    }
}
