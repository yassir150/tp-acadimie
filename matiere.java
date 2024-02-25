import java.util.*;

public class matiere {
    private String name;
    
    
    public matiere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le nom de la matiere:");
        name = scanner.next();
    }
    public String getName() {
        return name;
    }
    
}