package conversione;

public class Conversione extends Exception{
    public Conversione(String[] args) throws NumberFormatException, IllegalArgumentException
    {
        int num = Integer.parseInt(args[0]);
        if (num < -10 || num > 10) {
            throw new IllegalArgumentException("Il numero fuori dall'intervallo [-10, 10]");
        }
        else {
            System.out.println("Numero : "+num);
        }
    }
}
