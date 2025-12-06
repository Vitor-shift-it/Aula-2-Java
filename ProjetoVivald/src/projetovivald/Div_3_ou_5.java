/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_if_else;

/**
 *
 * @author Geane
 */
public class Div_3_ou_5 {
      public static void main(String[] args) {
        int numero = 30;

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Divisível por 3 e 5");
        } else {
            System.out.println("Não é divisível por 3 e 5");
        }
    }
}

