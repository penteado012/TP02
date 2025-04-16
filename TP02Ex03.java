/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex03;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP02Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        double maior = 0;
        double menor = 0;
        double soma = 0;
        System.out.println("Digite a quantidade de numero menor que 20");
        n = scanner.nextInt();
        
        
        
        int num;
        
        if(n < 20){
            for (int i = 0; i < n; i++) {
                do{
                    System.out.println("Digite um numero menor que 20");
                    num = scanner.nextInt();
                }while(num>20);
                
                if(maior < num)
                    maior = num;
                
                menor = num;
                
                if(menor > maior)
                    menor = maior;
                
                soma+=num;
            }   
        }

        System.out.println("Maior valor: " + maior + " - Menor valor: " + menor + " - Soma dos valores: " + soma + " - Media: " + soma/n + " - % de valores (+): " + maior/100.0 + " - % de valores (-): " + menor/100.0);
    }
    
}
