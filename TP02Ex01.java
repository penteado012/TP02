/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02ex01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP02Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n1;
        int n2;
        

       
        do{
            System.out.println("Digite o 1º valor");
            n1 = scanner.nextInt();
        
            System.out.println("Digite o 2º valor");
            n2 = scanner.nextInt();
        }while(n2<n1);
    }
    
}
