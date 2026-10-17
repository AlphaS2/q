package Animals;

public abstract class Felin extends Animals {
    public Felin(){
        super();
    }

     public Felin(String couleur, int poids){
        super(couleur , poids);
    }

    public void deplacement(){
        System.out.println("Je me déplace seul !");
    };
}
