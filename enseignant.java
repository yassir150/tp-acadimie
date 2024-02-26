import java.util.*;
public class enseignant extends personne {
	private int dpf;
	private int indice ;
	private String  mat ;
	private matiere  ma ;
 
	public enseignant () {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le  date-prix-fonction ");
		dpf=sc.nextInt();
		System.out.println("Donner l'indice ");
		indice=sc.nextInt();
		System.out.println("Donner la matiere");
		mat = sc.next();		
	}
	public String get_matieres() {
		return mat;
	}
	public void  aff() {
		super.affiche();
		System.out.println("le prenom est "+dpf);
		System.out.println("le prenom est "+indice);
		
	}

	
	public void ajout_notes(departement depa){
		depa.ajout_notes(this.mat);
	}
}