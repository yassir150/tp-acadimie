import java.util.*;

public class matiere {
    private String name;
    
    public matiere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le nom de la matiere:");
        name = scanner.next();
    }
    public matiere(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}