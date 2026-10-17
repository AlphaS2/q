package Animals;

public class Chat extends Felin {
    public Chat(){
        super();
    }

    public Chat(String couleur, int poids){
        super(couleur, poids);
    }

    public void crier(){
        System.out.println("Je miaule sur les toits !");
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
