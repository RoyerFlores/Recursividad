


import java.util.Scanner;

/**
 *
 * @author Royer
 */

public class SumaRecursiva {

    public static int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }

    public static long factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        } 
    }

    /**
     * se pide determinar el factorial de un número mediante un método
     * recursivo, donde el valor de entrada debe ser mayor o igual a cero.
     */
