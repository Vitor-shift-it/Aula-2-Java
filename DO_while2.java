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
public class DO_while2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENHA_CORRETA = 1234;
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();

        } while (senha != SENHA_CORRETA);

        System.out.println("Acesso permitido!");

        sc.close();
    }
}
