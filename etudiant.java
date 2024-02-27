import java.util.*;

public class etudiant extends personne {
private int ae;
private double moyenne;
private Vector<matiere> mat;
private Vector<String> mat_name;
private Vector<Double> note;

public etudiant( ) {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner l'annee-entree :");
		ae=sc.nextInt();	 
		this.mat = new Vector<matiere>();
		this.mat_name = new Vector<String>();
		this.note = new Vector<Double>();
		
		}

	public void set_matieres( matiere ma ){
		this.mat.add(ma);
	}

	public void Affiche() {
		super.affiche();
		moyenne = 0;
		System.out.println("l annee-entree est "+ae);
		for (int i = 0; i < note.size(); i++) {
			System.out.println("note "+(i+1)+" est : "+note.get(i));
			moyenne = note.get(i)+moyenne;
		}
		System.out.println("la moyenne est  "+moyenne);
	}
	public void set_note() {
		Scanner scanner = new Scanner(System.in);
		System.err.println("donne la note /20:");
		Double note = scanner.nextDouble();
		this.note.add(note);
	}
	public double get_moyenne(){
		return moyenne;
	}
}