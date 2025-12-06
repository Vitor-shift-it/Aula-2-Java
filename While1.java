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
public class While1 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print ("Quantos alunos há na sala? ");
        int total = sc.nextInt();

        int contador = 1;
        double soma = 0;

        while (contador <= total) {
            System.out.print("Digite a nota do aluno " + contador + ": ");
            double nota = sc.nextDouble();

            soma += nota;
            contador++;
        }

        double media = soma / total;

        System.out.println("A média da turma é: " + media);

        sc.close();
}
}