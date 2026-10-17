package Animals;

public class Lion extends Felin{
    public Lion(){
        super();
    }

    public Lion(String couleur, int poids){
        super(couleur, poids);
    }

    public void crier(){
        System.out.println("Je rugis dans la savane !");
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
