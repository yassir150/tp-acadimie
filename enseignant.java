import java.util.*;
public class enseignant extends personne {
	private int dpf;
	private int indice ;
	private String  mat ;
	private matiere  ma ;
	private static int check = 1;
	public enseignant () {
		super(check);
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le  date-prix-fonction :");
		dpf=sc.nextInt();
		System.out.println("Donner l'indice :");
		indice=sc.nextInt();
		System.out.println("Donner la matiere etudie par l'enseignant :");
		mat = sc.next();		
	}
	public void ajout_notes(departement depa){
		depa.ajout_notes(this.mat);
	}
	public void  aff() {
		super.affiche(check);
		System.out.println("le prenom est "+dpf);
		System.out.println("le prenom est "+indice);
		
	}
}