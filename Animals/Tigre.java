package Animals;

public class Tigre extends Felin{
    public Tigre(){
        super();
    }

    public Tigre(String couleur, int poids){
        super(couleur, poids);
    }


    public void crier(){
        System.out.println("Je grogne très fort !");
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
