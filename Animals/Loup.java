package Animals;

public class Loup extends Canin {

    public Loup(){
        super();
    }

    public Loup(String couleur, int poids){
        super(couleur, poids);
    }

    public void crier(){
        System.out.println("Je hurle à la Lune en faisant ouhouh !");
    }

    /*public int getPoids(){
        return this.poids;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public void setPoids(int poids){
        this.poids = poids;
    }

    public void setCouleur(String couleur){
        this.couleur = couleur;
    };*/
}
