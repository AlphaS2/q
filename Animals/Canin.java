package Animals;

public abstract class Canin extends Animals {
    public Canin(){
        super();
    }

    public Canin(String couleur, int poids){
        super(couleur, poids);
    }

    public void deplacement(){
        System.out.println("Je me déplace en meute !");
    };
}
