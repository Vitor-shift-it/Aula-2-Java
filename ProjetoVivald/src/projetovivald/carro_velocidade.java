/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_if_else;

/**
 *
 * @author Geane
 */
public class carro_velocidade {
    public static void main(String[] args) {
        int velocidade = 140;

        if (velocidade > 120) {
            int excesso = velocidade - 120;
            int multa = excesso * 10;
            System.out.println("Velocidade acima do limite");
            System.out.println("Multa: R$ " + multa);
        } else {
            System.out.println("Velocidade dentro do limite");
        }
    }
}
