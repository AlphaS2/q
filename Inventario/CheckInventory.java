package Inventario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CheckInventory {
    public static void main(String[] args) {
        String line, name;
        int units, count = 0;
        float price;
        

        InventoryItem[] items = new InventoryItem[100];
        try{
            FileReader fr = new FileReader("Inventario/inventory.dat");
            BufferedReader inFile = new BufferedReader(fr);
            line = inFile.readLine();
            
            while (line!=null) {
                StringTokenizer tok = new StringTokenizer(line);
                try {
                    name = tok.nextToken();
                    units = Integer.parseInt(tok.nextToken());
                    price = Float.parseFloat(tok.nextToken());
                    items[count] = new InventoryItem(name, units, price);
                    count++;
                } catch (NumberFormatException ex) {
                    System.out.println("Error in input line"+line);
                }
                line = inFile.readLine();
            }
            inFile.close();
            for(int scan = 0; scan < count; scan++)
                System.out.println(items[scan]);
        }
        catch(FileNotFoundException e){
            System.out.println("File inventory.dat");
        }
        catch(IOException e){
            System.out.println("Eccezione di I/O");
        }
    }
}
