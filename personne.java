import java.util.*;
public class personne {
 private String nom ,prenom;
 private String tel;
 private String mail;

 
 
 public personne() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Donner le nom  ");
	 nom=sc.next();
	 System.out.println("Donner le prenom  ");
	 prenom=sc.next();
	 System.out.println("Doneer le numero de telephone");
	 tel=sc.next();
	 System.out.println("Donner le mail ");
	 mail=sc.next();
 }
 public void affiche() {
	 System.out.println("le nom est "+nom);
	 System.out.println("le prenom est "+prenom);
	 System.out.println("le numero de telephone est "+tel);
	 System.out.println("le mail est "+mail);
}
}