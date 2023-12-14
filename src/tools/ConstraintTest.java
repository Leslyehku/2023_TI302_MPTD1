/*
 * 2023 IESS-TICS MPTD
 * Unidad 1. Programación Lineal
 * Restricción lineal 2D
 * By LHJ
 * Fecha: 22/septiembre/2023
 */
package tools;

/**
 *
 * @author LESLYE
 */
public class ConstraintTest {
    public static void main(String ...args) {
        Constraint c1 = new Constraint(-1,3,30);
        System.out.println("P1: "+c1.getP1());
        System.out.println("P1: "+c1.getP2());
    }
}
