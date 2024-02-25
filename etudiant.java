import java.util.*;


public class etudiant extends personne {
private int ae;
private double moyenne;
private  Vector<matiere> mat;

public etudiant() {
	 super();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Donner l'annee-entree :");
	 ae=sc.nextInt();
	 
}
	public void ajout_matiere(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donner le nombre de matiere :");
		int nombre_matiere = scanner.nextInt();
		for(int i=0 ; i < nombre_matiere ;  i++){
			matiere matiere = new matiere(); 
            mat.add(matiere);
		}
	}
	public Vector<matiere> get_matieres(){
		return mat;
	}

	public void Affiche() {
		super.affiche();
		System.out.println("  l annee-entree est "+ae);
		System.out.println("la moyenne est  "+moyenne);
	}

}