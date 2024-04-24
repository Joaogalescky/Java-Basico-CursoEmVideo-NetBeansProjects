/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author Skyfall_jack
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 4, y = 7, z = 12;
        boolean r;
        
        r = (x < y && y < z);
        System.out.println("teste 1 && verdadeiro: " + r);
        
        r = (x < y && y == z);
        System.out.println("teste 2 && falso: " + r);
        
        r = (x < y || y == z);
        System.out.println("teste 3 || verdaddeiro: " + r);
        
        r = (x < y ^ y == z);
        System.out.println("teste 4 ^ verdadeiro: " + r);
        
        r = (x != y);
        System.out.println("teste 5 ! verdadeiro: " + r);
        
    }
}
