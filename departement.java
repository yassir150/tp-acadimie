import java.util.*;


public class departement {
    private String name;
    private String responsable;
    private Vector<etudiant> etu;
    private Vector<enseignant> ens;
    private HashMap<String, matiere>  ma;
    private Map<String, Vector<etudiant>> etu_de_ma;


    public departement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nom du departement ");
        name=sc.next();
        System.out.println("Donner le nom du responsable ");
        responsable = sc.next();
        this.etu=new Vector<etudiant>();
        this.ens=new Vector<enseignant>();
        this.ma = new HashMap<String,matiere>();
        etu_de_ma = new HashMap<String, Vector<etudiant>>();
    }

    public void ajout_matiere() {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Donner le nombre de matiere :");
        int nombre_matiere = scanner.nextInt();
		for(int i=0 ; i < nombre_matiere ;  i++){ 
            System.out.println("Donner le nom de la matiere:");
			name = scanner.next();
            matiere mat = new matiere(name);
            ma.put(name, mat);
            Vector<etudiant> vect = new Vector<etudiant>();
            etu_de_ma.put(name, vect);
		}
        
    }
    
    public void ajout_etudiant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de etudiant :");
        int nombre_etudiant = sc.nextInt();
        for(int i=0 ; i < nombre_etudiant ;  i++){
            etudiant etudiant = new etudiant();
            etu.add(etudiant);

            System.out.println("Donner le nombre de matiere :(max "+ma.size()+")");
            // for(int j=0 ; j < ma.size() ;  i++){ 
            //     String NAME = ma.get(i).getName();
            //     System.out.println(NAME +"\n");
                
            // }
            int j=1;
            for (Map.Entry<String, matiere> entry : ma.entrySet()) {
                String key = entry.getKey();
                System.out.println((j)+key +"-");
                j = j+1;
            }

            int nombre_matiere = sc.nextInt();
            for (int n = 0; n < nombre_matiere; n++) {
                System.out.println("donne le nom de matiere de l'etudiant : ");
                String nomMATIRE = sc.next();
                etu_de_ma.get(nomMATIRE).add(etudiant);
                etudiant.set_matieres(ma.get(nomMATIRE));
                
            }
            
            
        }
    }
    
    public void ajout_notes(String matiere){
        for (int i = 0; i < etu_de_ma.get(matiere).size(); i++) {
            etu_de_ma.get(matiere).get(0).set_note();
        }
    }

    public void calcul_moyenne(){
        double moy =0;
        for (int i = 0; i < etu.size(); i++) {
            moy = moy+etu.get(i).get_moyenne();
        }
        System.out.println("la moyenne de departement est : " +moy/etu.size());
    }
    public void affiche_etu(){
        for (int i = 0; i < etu.size(); i++) {
            etu.get(i).Affiche();
        }
    }

}