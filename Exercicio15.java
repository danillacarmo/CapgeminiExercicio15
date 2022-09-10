/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio15;

import java.util.Scanner;

public class Exercicio15 {
 
    public static void main(String[] args) {
      
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo");
        } else {
            System.out.println("O número não está no intervalo");
        }
                
        
    }
    
}
