import java.util.Scanner;
import java.util.Vector;

public class college {
    private String name ;
    private String site_web;
    private Vector<departement> depa;

    public college(){
        Scanner sc = new Scanner(System.in);
        System.out.println("donne le nom de college :");
        name = sc.next();
        System.out.println("donne le site web de college :");
        site_web = sc.next();
        this.depa = new Vector<departement>();
    }
    public void ajout_departement(departement depar){
        depa.add(depar);
    }
}
