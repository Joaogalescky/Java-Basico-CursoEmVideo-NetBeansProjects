/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Skyfall_jack
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Explicação de como funciona
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE
        
        int n;
        int soma = 0;
        int contador = 0;
        int pares = 0;
        int impares = 0;
        int maior = 0;
        int media;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "<html>Informe un número: <em><br>(valor 0 interrompe)</em></html>"));
            soma += n;
            contador++;
            if(n % 2 == 0){
                pares ++;
            } else{
                impares ++;
            }
            if(n > 100){
                maior ++;
            }
            media = soma/contador;
        } while(n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr> " +
                "<br>Total de Valores: " + contador  + 
                "<br>Total de Pares: " + pares + 
                "<br>Total de Ímpares: " + impares + 
                "<br>Acima de 100: " + maior + 
                "<br>Média dos valores: " + media + "</html>");
        //Exemplo
        //JOptionPane.showMessageDialog(null, "Você digitou o valor" + N);
    }
    
}
