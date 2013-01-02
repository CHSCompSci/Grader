import java.util.Scanner;
public class grade {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What numerical grade did you get? ");
        int x = reader.nextInt();
        
        
        if (x >= 98) {
            System.out.println("A " + x + " is an A+.");
        }
        
        else if (x >= 95) {
            System.out.println("A " + x + " is an A.");
        }
        
        else if (x >= 92) {
            System.out.println("A " + x + " is an A-.");
        }
        
        
        else if (x >= 90) {
            System.out.println("A " + x + " is a B+.");    
        }
        
        else if (x >=87) {
            System.out.println("A " + x + " is a B.");
        }
        
        else if (x >= 83) {
            System.out.println("A " + x + " is a B-.");
        }
        
        else if (x >= 76) {
            System.out.println("A " + x + " is a C+.");
        }
        
        else if (x >= 72) {
            System.out.println("A " + x + " is a C.");
        }
        
        else if (x >= 70) {
            System.out.println("A " + x + " is a C-.");
        }
        
        else if (x >= 66) {
            System.out.println("A " + x + " is a D+.");
        }
        
        else if (x >= 62) {
            System.out.println("A " + x + " is a D.");
        }
        
        else if (x >= 60) {
            System.out.println("A " + x + " is a D.");
    
        }
        
        else {
            System.out.println("A " + x + " is an F.");
        }
    }
}
