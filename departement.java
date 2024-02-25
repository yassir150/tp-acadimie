import java.util.*;


public class departement {
    private String name;
    private enseignant responsable;
    private Vector<etudiant> etu;
    private Vector<enseignant> ens;
    private Vector<matiere> ma;
    private Map<matiere, Vector<etudiant>> etu_de_ma;
    
    public departement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nom du departement ");
        name=sc.next();
        System.out.println("Donner le nom du responsable ");
        responsable=new enseignant();
        etu=new Vector<etudiant>();
        ens=new Vector<enseignant>();
        ma=new Vector<matiere>();
        etu_de_ma = new HashMap<matiere, Vector<etudiant>>();
    }
    public void ajout_matiere() {
        matiere matiere = new matiere();
        ma.add(matiere);
    }
    public void ajout_etudiant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de etudiant :");
        int nombre_etudiant = sc.nextInt();
        for(int i=0 ; i < nombre_etudiant ;  i++){
            etudiant etudiant = new etudiant(); 
            etu.add(etudiant);
            
            etu_de_ma.put(etudiant.get_matieres().get(i) , );
        }
    }
    public void ajout_note_etu(matiere matiere) {
        String note = matiere.getName();

    }

}