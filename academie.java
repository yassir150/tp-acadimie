import java.util.Scanner;
import java.util.Vector;

public class academie {
    public String name;
    private Vector<college> colleges;
    
    public academie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("donne le nome de academeie :");
        name = sc.next();
        this.colleges = new Vector<college>();
    }
    public void ajout_college(college col){
        colleges.add(col);
    }
}
