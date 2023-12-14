/*
 * 2023 IESS-TICS-302 MPTD
 * Periodo Agosto-Diciembre 2023
 * Unidad 1. Programación Lineal
 * Descripcion: TEST implementación del metodo simplex ( z max, r <= b )
 * By LHJ
 * email: Hernandezleslye45@gmail.com
 * 29/09/2023
 */
package tools;

/**
 *
 * @author LESLYE
 */
public class SimplexMethodTest {
    public static void main(String... args) {
        SimplexMethod sm= new SimplexMethod(3, 4);
        
        float r0[] = {0, 1 , -3, -6, 9, 0, 1, -2, 0, 0};
        sm.add(0, r0);
        System.out.println(sm.optimality());
        
        SimplexMethod sm2= new SimplexMethod(2, 2);
        float r02[] = {0, 1, 2, 3, 4, 0, 0};
        sm2.add(0, r02);
        System.out.println(sm2.optimality());
    }
}
