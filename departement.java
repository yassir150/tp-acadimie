import java.util.*;


public class departement {
    private String name;
    private String responsable;
    private Vector<etudiant> etu;
    private Vector<etudiant> phy;
    private Vector<etudiant> chi;
    private Vector<etudiant> svt;
    private Vector<etudiant> math;
    private Vector<enseignant> ens;
    private Vector<matiere> ma;
    // private Map<matiere, Vector<etudiant>> etu_de_ma;
    
    public departement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nom du departement ");
        name=sc.next();
        System.out.println("Donner le nom du responsable ");
        responsable = sc.next();
        this.etu=new Vector<etudiant>();
        this.ens=new Vector<enseignant>();
        this.ma=new Vector<matiere>();
        this.math = new Vector<etudiant>();
        this.phy = new Vector<etudiant>();
        this.chi = new Vector<etudiant>();
        this.svt = new Vector<etudiant>();

        // etu_de_ma = new HashMap<matiere, Vector<etudiant>>();
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
            this.ajout_etu_matiere(etudiant);
        }
    }
    public void ajout_etu_matiere(etudiant etudiant) {
        for (int i = 0; i < etudiant.get_matieres().size(); i++) {
            switch (etudiant.get_matieres().get(i)) {
                case "math":
                    math.add(etudiant);
                    break;
                case "physique":
                    phy.add(etudiant);
                    break;
                case "chimie":
                    chi.add(etudiant);
                    break;
                case "svt":
                    svt.add(etudiant);
                    break;
            
            }
        }

    }
    public void ajout_notes(String matiere){
        switch (matiere) {
            case "math":
                    for (int i = 0; i < math.size(); i++) {
                        math.get(i).set_note();
                        
                    }
                    break;
                case "physique":
                    for (int i = 0; i < phy.size(); i++) {
                        phy.get(i).set_note();
                        
                    }
                    break;
                case "chimie":
                    for (int i = 0; i < chi.size(); i++) {
                        chi.get(i).set_note();
                        
                    }
                    break;
                case "svt":
                    for (int i = 0; i < svt.size(); i++) {
                        svt.get(i).set_note();
                        
                    }
                    break;
        }
    }
    public Vector<etudiant> get_Etudiants(){
        return etu;
    }
}