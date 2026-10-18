package Exception;

public class Main {
    public static void main(String[] args) {
        int j = 20, i = 0;
        try {
            System.out.println(" =>" + (1/0));
        } 
        catch (ClassCastException e) 
        {
            e.printStackTrace();
        } 
        finally
        {
            System.out.println("Action faite systematiquement");
        }

    }
}
