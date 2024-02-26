public class main {
    public static void main(String[] args) {
        departement anne1 = new departement();
        anne1.ajout_etudiant();
        enseignant prof = new enseignant();
        prof.ajout_notes(anne1);
        anne1.get_Etudiants().get(0).Affiche();
        
    }
}
