/*
 * 2023 IESS-TICS-302 MPTD
 * Periodo Agosto-Diciembre 2023
 * Unidad 1. Programación Lineal
 * Descripcion: implementación del metodo simplex ( z max, r <= b )
 * By LHJ
 * email: Hernandezleslye45@gmail.com
 * 29/09/2023
 */
package tools;

/**
 *
 * @author LESLYE
 */
public class SimplexMethod {
    private float pl[][];
    private int n;
    private int r;

    public SimplexMethod(int n, int r) {
        this.n = n;
        this.r = r;
        
        this.pl = new float[r+1][n+r+3];
    }
    
    public void add(int i, float row[]){
        for(int k = 0; k < row.length; k++){
            pl[i][k] = row[k];
        }
    }
    
    public int optimality(){
        int index = -1;
        float val = 0.0f;
        
        // encontrar un valor negativo
        for(int i = 1; i < pl[0].length - 2; i++){
            if(pl[0][i] < 0){
                index = i;
                val = pl[0][i];
                break;
            }
        }        
            if(index == -1) return index;
            
            // encontrar un valor negativo mas pequeño
            for(int i = index+1; i < pl[0].length - 2; i++){
                
                if(pl[0][i] < val){
                    index = i;
                    val = pl[0][i];
                }
            }
            return index;
        }
}
