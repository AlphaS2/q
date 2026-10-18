import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Veuillez saisir un nombre: ");
         * int str = sc.nextInt();
         * System.out.println("Vous avez saisi : " + str);
         * 
         * int x=10, y=20;
         * int max = (x < y) ? y*2 : x*2;
         * System.out.println(max);
         * 
         * 
         * String prenom;
         * char reponse = 'O';
         * Scanner sc = new Scanner(System.in);
         * while (reponse == 'O') {
         * System.out.println("Donnez un prenom : ");
         * prenom = sc.nextLine();
         * System.out.println("Bonjour " + prenom + " comment vas-tu ?");
         * // Sans ça nous n'entrerions pas dans la deuxieme boucle
         * reponse = ' ';
         * // Tant que la reponse n'est pas O ou N
         * while (reponse != 'O' && reponse != 'N') {
         * System.out.println("Voulez-vous reessayer ? (O/N)");
         * reponse = sc.nextLine().charAt(0);
         * }
         * 
         * }
         * 
         * System.out.println("Au revoir !");
         * 
         * 
         * int mode ;
         * double temp;
         * char reponse = ' ';
         * Scanner sc = new Scanner(System.in);
         * System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FEHRENHEIT");
         * System.out.println("-------------------------------------------------");
         * 
         * do {
         * System.out.println("Choisissez le mode de conversion : ");
         * System.out.println("1 - Convertisseur Celsius - Fahrenheit ");
         * System.out.println("2 - Conevrtisseur Fahrenheit - Celsius ");
         * mode = sc.nextInt();
         * if (mode == 1) {
         * System.out.println("Température a convertir : ");
         * temp = sc.nextDouble();
         * System.out.println(temp + " °C correspond à : " + (((9.0/5.0)*temp)+32.0) +
         * " °F");
         * }
         * else if (mode == 2) {
         * System.out.println("Température a convertir : ");
         * temp = sc.nextDouble();
         * System.out.println(temp + " °F correspond à : " + (((temp-32.0)*5.0)/9.0) +
         * " °C");
         * }
         * 
         * reponse = ' ';
         * sc.nextLine(); // Vider la derniere ligne lue, vu que c'etait une Double et
         * que ces type ne se vide pas automatiquement, sinon on a une erreur
         * do {
         * 
         * System.out.println("Souhaitez-vous convertir une autre temperature ? (O/N)");
         * reponse = sc.nextLine().charAt(0);
         * } while (reponse != 'O' && reponse != 'N');
         * } while (reponse == 'O');
         * 
         * System.out.println("Au revoir...");
         */

        // Parcourir un tableau pour retrouver un caractere precis
        // ................................................

        /*
         * char[] tableau = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
         * char reponse = ' ', caractere = ' ';
         * Scanner sc = new Scanner(System.in);
         * int i = 0;
         * do { // Boucle principale
         * do { // On repete la boucle tant que l'utilisateur n'a pas entrer une lettre
         * figurant
         * // dans le tableau. l'arriver a i = tableau.length signifie qu'il a parcouru
         * // tout le tableau sans trouver le caracrtere
         * i = 0;
         * System.out.println("Entrez une lettre en minuscule, SVP ");
         * caractere = sc.nextLine().charAt(0);
         * 
         * // Boucle de recherche dans le tableau
         * while (i < tableau.length && caractere != tableau[i])
         * i++;
         * // si i < 7 c'est que la boucle n'a pas depasse le nombre de case
         * if (i < tableau.length) {
         * System.out.println("La lettre " + caractere +
         * " se trouve bien dans le tableau !");
         * } else // sinon
         * {
         * System.out.println("La lettre " + caractere +
         * " ne se trouve pas dans le tableau !");
         * }
         * 
         * } while (i >= tableau.length);
         * 
         * // Tant que la lettre de l'utilisateur ne se trouve pas dans le tableau
         * do {
         * System.out.println("Voulez essayer a nouveau ? (O/N)");
         * reponse = sc.nextLine().charAt(0);
         * } while (reponse != 'O' && reponse != 'N');
         * } while (reponse == 'O');
         */

        /*
         * // LES METHODES
         * String[] tab = { "toto", "titi", "tata", "tete" };
         * ParcourirTab(tab);
         * System.out.println(toString(tab));
         * 
         * }
         * 
         * static void ParcourirTab(String[] tab) {
         * for (String string : tab) {
         * System.out.println(string);
         * }
         * }
         * 
         * static String toString(String[] tab) {
         * System.out.println("Méthode toString() !\n------------");
         * String retour = "";
         * for (String string : tab)
         * retour += string + "\n";
         * 
         * return retour;
         */

        /*
         * Ville v = new Ville();
         * Ville v1 = new Ville("Marseille", 1236, "France");
         * Ville v2 = new Ville("Rio", 321654, "Bresil");
         * 
         * System.out.println("\n\n" + v1.decrisToi());
         * System.out.println(v.decrisToi());
         * System.out.println(v2.decrisToi() + "\n\n");
         * System.out.println(v1.comparer(v2));
         * 
         * Capitale cap = new Capitale("Paris", 654987, "France", "La tour eiffel");
         * System.out.println("\n"+cap.decrisToi());
         */

        /*
         * // Definition d'un tableau de ville null
         * Ville[] tableau = new Ville[6];
         * 
         * // un tableau de nom de ville et un autre de nombre d'habitants
         * String[] tab = { "Marseille", "lille", "caen", "Nante", "lyon", "paris" };
         * int[] tab2 = { 123456, 78546, 654987, 758365, 1594, 213 };
         * 
         * // les trois premier element du tableau seront des villes et le reste des
         * // capitales
         * for (int i = 0; i < 6; i++) {
         * if (i < 3) {
         * Ville v = new Ville(tab[i], tab2[i], "France");
         * tableau[i] = v;
         * } else {
         * Capitale c = new Capitale(tab[i], tab2[i], "France", "la Tour eiffel");
         * tableau[i] = c;
         * }
         * 
         * }
         * // il ne nous reste plus qu'a decrire tous notre tableau
         * for (Object obj : tableau) {
         * System.out.println(obj);
         * }
         */

        Ville v = null;
        try {
             v = new Ville("Re", -12000, "France");
        } 
        //Gestion de l'exception sur le nombre d'habitants
        catch (NombreHabitantException e) { 
            e.printStackTrace();
        }
        //Gestion de l'exception sur le nom de la ville
        catch(NomVilleException e2){
            System.out.println(e2.getMessage());
        }
        finally{
            if (v == null) {
                v = new Ville();
            }
        }

         System.out.println(v.toString());
    }
}