/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_if_else;

/**
 *
 * @author Geane
 */
public class Qualidade_agua {
     public static void main(String[] args) {
        double ph = 7;

        if (ph < 7) {
            System.out.println("Ácido");
        } else if (ph == 7) {
            System.out.println("Neutro");
        } else {
            System.out.println("Alcalino");
        }
    }
}
