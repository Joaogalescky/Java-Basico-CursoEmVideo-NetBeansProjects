/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Skyfall_jack
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */

// Procedimento em Algoritmo Java
//    static void soma(int a, int b){
//        int s = a + b;
//        System.out.println("A soma é: " + s);
//    }
    
//    public static void main(String[] args) {
//        System.out.println("Programa Iniciado...");
//        soma(3, 2);
//    }
    
    
// Função em Algoritmo Java
    static int soma (int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String [] args){
        System.out.println("Programa Iniciado...");
        int sm = soma(3, 2);
        System.out.println("A soma vale: " + sm);
    }
}
