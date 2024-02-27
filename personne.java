	import java.util.*;
	public class personne {
	private String nom ,prenom;
	private String tel;
	private String mail;

	
	
	public personne(int n) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom de l'enseignement: ");
		nom=sc.next();
		System.out.println("Donner le prenom de l'enseignement: ");
		prenom=sc.next();
		System.out.println("Doneer le numero de telephone de l'enseignement: ");
		tel=sc.next();
		System.out.println("Donner le mail de l'enseignement: ");
		mail=sc.next();
	}
	public personne(){
			Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom d'etudiant : ");
		nom=sc.next();
		System.out.println("Donner le prenom d'etudiant : ");
		prenom=sc.next();
		System.out.println("Doneer le numero de telephone d'etudiant : ");
		tel=sc.next();
		System.out.println("Donner le mail d'etudiant : ");
		mail=sc.next();
	}
	public void affiche(int n) {
		
		System.out.println("le nom de l'enseignement: est "+nom);
		System.out.println("le prenom de l'enseignement: est "+prenom);
		System.out.println("le numero telephone de l'enseignement: est "+tel);
		System.out.println("le mail de l'enseignement: est "+mail);
	}
	public void affiche(){
		System.out.println("le nom de d'etudiant : est "+nom);
		System.out.println("le prenom d'etudiant : est "+prenom);
		System.out.println("le numero telephone d'etudiant : est "+tel);
		System.out.println("le mail d'etudiant : est "+mail);
	}
}
	