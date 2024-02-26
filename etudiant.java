import java.util.*;


public class etudiant extends personne {
private int ae;
private double moyenne;
private  Vector<matiere> mat;
private Vector<String> mat_name;
private Vector<Double> note;


public etudiant() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner l'annee-entree :");
		ae=sc.nextInt();	 
		this.mat = new Vector<matiere>();
		this.mat_name = new Vector<String>();
		this.note = new Vector<Double>();
		this.ajout_matiere();
		}
	public void ajout_matiere(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donner le nombre de matiere :");
		int nombre_matiere = scanner.nextInt();
		for(int i=0 ; i < nombre_matiere ;  i++){
			System.out.println("Donner le nom de la matiere:");
			String name = scanner.next();
			matiere matiere = new matiere(name); 
            mat.add(matiere);
			mat_name.add(name);

		}
	}
	public Vector<String> get_matieres(){
		return mat_name;
	}

	public void Affiche() {
		super.affiche();
		System.out.println("  l annee-entree est "+ae);
		System.out.println("la moyenne est  "+moyenne);
		for (int i = 0; i < note.size(); i++) {
			System.out.println("note "+i+1+" est : "+note.get(i));
		}
	}
	public void set_note() {
		Scanner scanner = new Scanner(System.in);
		Double note = scanner.nextDouble();
		this.note.add(note);
	}
	// public void set_matiere(){
	// 	for (int i = 0; i < this.mat.size(); i++) {
	// 		this.mat_name.add(this.mat.get(i).getName());
	// 	}
	// }
}