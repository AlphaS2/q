package conversione;

public class Main {
    public static void main(String[] args) {
        try {
          Conversione  c = new Conversione(args);
        } catch(NumberFormatException e1){
            System.err.println("Format exception 1: "+e1.getMessage()); // messagio predefinito
        }
        catch (IllegalArgumentException e) {
            System.err.println("Format exception 2: "+e.getMessage()); // messagio definito in Conversione
        }
    }
}
