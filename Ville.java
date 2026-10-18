public class Ville {

    // Variables publique qui compte les instances
    public static int nbreInstances = 0;
    // Variable privée qui comptera aussi les instances
    protected static int nbreInstancesBis = 0;

    // Stocke le nom de notre ville
    protected String nomVille;
    // Stocke le nom du pays de notre ville
    protected String nomPays;
    // Stocke le nombre d'habitant de notre ville
    protected int nbreHabitants;
    protected char categorie;

    // Constructeur par default
    public Ville() {
        // On incremente nos variable a chaque appel aux constructeurs
        nbreInstances++;
        nbreInstancesBis++;

        nomVille = "inconnu";
        nomPays = "inconnu";
        nbreHabitants = 0;
        this.setCategorie();
    }

    // Constructeur avec parametre
    public Ville(String pNom, int pNbre, String pPays)
            throws NombreHabitantException, NomVilleException {
        if (pNbre < 0)
            throw new NombreHabitantException(pNbre);
        if(pNom.length() < 3)
            throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
        else {
            // On incremente nos variable a chaque appel aux constructeurs
            nbreInstances++;
            nbreInstancesBis++;

            nomVille = pNom;
            nomPays = pPays;
            nbreHabitants = pNbre;
            this.setCategorie();
        }

    }

    // ************* ACCESSEURS(Getters) **********************************

    public static int getNombreInstancesBis() {
        return nbreInstancesBis;
    }

    // Retourne nom de la ville
    public String getNom() {
        return nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public int getNbreHabitants() {
        return nbreHabitants;
    }

    public char getCategorie() {
        return categorie;
    }

    // ************ Mutateurs(Setters) ************************************
    // Definit le nom de la ville
    public void setNom(String pNom) {
        nomVille = pNom;
    }

    public void setNomPays(String pPays) {
        nomPays = pPays;
    }

    public void setNbreHabitants(int nbre) {
        nbreHabitants = nbre;
        this.setCategorie();
    }

    // Defini la categorie de la ville
    private void setCategorie() {
        int[] bornesSuperieures = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
        char[] categories = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

        int i = 0;
        while (i < bornesSuperieures.length && this.nbreHabitants >= bornesSuperieures[i]) {
            i++;
        }
        this.categorie = categories[i];
    }

    // Retourne la description de la ville
    public String decrisToi() {
        return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
                + " habitants => elle est donc de categorie : " + this.categorie;
    }

    // Retourne une chaine de caractere selon le resultat de la comparaison
    public String comparer(Ville v1) {
        String str = new String();

        if (v1.getNbreHabitants() > this.nbreHabitants) {
            str = v1.getNom() + " est une ville plus peuplé que " + this.nomVille;
        } else
            str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();
        return str;
    }

    public String toString() {
        return "\t" + this.nomVille + " est une ville de " + this.nomPays +
                ", elle comporte : " + this.nbreHabitants +
                " => elle est donc de catégorie : " + this.categorie;
    }

}
