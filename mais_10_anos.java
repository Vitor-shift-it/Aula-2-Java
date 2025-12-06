/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scan_joption;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Geane
 */
public class mais_10_anos {
     public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Usando Scanner ===");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        int idadeFutura = idade + 10;

        System.out.println(nome + ", daqui a 10 anos você terá " + idadeFutura + " anos.");

        //  JOptionPane 
        String nome2 = JOptionPane.showInputDialog("Digite seu nome:");
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");

        int idade2 = Integer.parseInt(idadeStr);
        int idadeFutura2 = idade2 + 10;

        JOptionPane.showMessageDialog(
            null,
            nome2 + ", daqui a 10 anos você terá " + idadeFutura2 + " anos."
        );

        sc.close();
    }
}
