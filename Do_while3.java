/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage3;
import java.util.Scanner;
/**
 *
 * @author Geane
 */
public class Do_while3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            if (numero != 0) {
                contador++;
            }

        } while (numero != 0);

        System.out.println("Quantidade de números inseridos: " + contador);

        sc.close();
    }
}
