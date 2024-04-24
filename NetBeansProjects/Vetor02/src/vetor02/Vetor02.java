/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author Skyfall_jack
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variáveis e entrada
        String mes[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dia[] = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        
        //obtem o ano atual
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        //verifica se o ano atual é bissexto
        boolean ehBissexto = (anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 400 ==0);
        
        //ajusta o número de dias em fevereiro se for bissexto
        if (ehBissexto){
            dia[1] = 29;
        }
        
        //processamento
        for(int i = 0; i<mes.length; i++){
            System.out.println("O mes de " + mes[i] + " tem " + dia[i] + " dias ao todo.");
        }
    }
    
}
