/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_if_else;

/**
 *
 * @author Geane
 */
public class Desconto {
    public static void main(String[] args) {
        double valor = 150;

        double valorFinal;

        if (valor > 100) {
            valorFinal = valor * 0.90; // 10% de desconto
        } else {
            valorFinal = valor * 0.95; // 5% de desconto
        }

        System.out.println("Valor final: R$ " + valorFinal);
    }
}
