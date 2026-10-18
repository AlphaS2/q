public class NombreHabitantException extends Exception {
    public NombreHabitantException() {
        System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
    }

    public NombreHabitantException(int pNbre) {
        System.out.println("Instanciation avec un nombre d'habitants négatif.");
        System.out.println("\t => " + pNbre);
    };

}
