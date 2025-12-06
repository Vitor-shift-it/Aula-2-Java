/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;
import java.util.Scanner;
/**
 *
 * @author Geane
 */
public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int maior1 = Integer.MIN_VALUE; // maior
        int maior2 = Integer.MIN_VALUE; // segundo maior

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            int n = sc.nextInt();

            if (n > maior1) {
                maior2 = maior1;
                maior1 = n;
            } else if (n > maior2) {
                maior2 = n;
            }

            contador++;
        }

        System.out.println("Maior número: " + maior1);
        System.out.println("Segundo maior: " + maior2);

        sc.close();
    }
}
