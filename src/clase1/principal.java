/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

/**
 *
 * @author Royer
 */
public class principal {

    public static void main(String[] args) {
        //VERIFICACION RECURSION EN FUNCIONES
        //FACTORIAL
        System.out.println("Factorial de 5");
        System.out.println(factorial(5));
        //SUMA DE PARES
        System.out.println("Suma de 3 pares");
        System.out.println(sumP(3));
        //SUMA DE N IMPARES
        System.out.println("Suma de 3 impares");
        System.out.println(sumI(3));
        //SUMA DE LOS N MULTIPLOS DE X
        System.out.println("Suma de Múltiplos de 3");
        System.out.println(multiplosX(3, 3));
        //SUMA DE LOS DIGITOS DE UN NUMERO
        System.out.println("Suma de dígitos de 1234");
        System.out.println(digitos(1234));
    }

    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static int sumP(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sumP(n - 1) + n * 2;
        }
    }

    private static int sumI(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sumI(n - 1) + n * 2 - 1;
        }
    }

    public static int multiplosX(int n, int m) {
        if (m > 0) {
            return n * m + multiplosX(n, m - 1);
        } else {
            return 0;
        }
    }

    public static int digitos(int n) {
        if (n > 10) {
            return n % 10 + digitos(n / 10);
        } else {
            return n;
        }
    }
}
