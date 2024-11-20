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
        
        
        ListaV A=new ListaV();
        A.adicion("aaa111", "Fiat", "Blanco", 2020);
        A.adicion("bbb222", "toyota", "negro", 2010);
        A.adicion("ccc333", "nissan", "verde", 2022);
        A.adicion("ddd444", "chevrolet", "azul", 2015);
        A.adicion("eee555", "nissan", "Blanco", 2021);
        mostrar(A.getP());
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
    
    public static void mostrar(NodoV r){
        if(r!=null){
            System.out.println(r.getPlaca()+" - "+r.getMarca()+" - "+r.getModelo()+" - "+r.getColor());
            mostrar(r.getSig());
        }else{
            return;
        }
    }
}
