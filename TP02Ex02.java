/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex02;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class TP02Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[10];
        int num;
        int maior = 0;
        double soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero");
            num = scanner.nextInt();
            array[i] = num;
            if(maior < num)
                maior = num;
            
            soma+=num;
        }
        
        System.out.println("Maior valor: " + maior + " - Soma: " + soma + " - Media: " + soma/10.0);
    }
    
}
