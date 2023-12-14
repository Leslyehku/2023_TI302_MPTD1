/*
 * 2023 IESS-TICS MPTD
 * Unidad 2. Métodos de transporte y método de asignación
 * Método de transporte
 * By LHJ
 * Fecha: 13/octubre/2023
 */
package transport;

/**
 *
 * @author LESLYE
 */
public class MTransport {
    private int originPoints;
    private int destinyPoints;
    private float origin[];
    private float destiny[];
    private float costs[][];
    private float tableu[][];
    
    public MTransport(int originPoints, int destinyPoints){
        this.originPoints = originPoints;
        this.destinyPoints = destinyPoints;
        
        this.tableu = new float [originPoints][destinyPoints];
    }
    
    public void setOrigin(float origin[]){
        this.origin = origin;
    }
    public void setDestiny(float destiny[]){
        this.destiny = destiny;
    }

    public void setCosts(float[][] costs) {
        this.costs = costs;
    }
    
    public void solve(){
        //TODO
    }
    
    private void sfbNE(){
        //TODO
    }
    
    private void sfbCM(){
        //TODO
    }
    
    private void sfbVogel(){
        //TODO
    }
    
    private boolean optimality(){
        //TODO
        return false;
    }
    
    private void solveVB(){
        //TODO
    }
    
    private boolean solveVNB(){
        //TODO
        return false;
    }
    
    private void pivote(){
        //TODO
    }
    
    private void bucle(){
        //TODO
    }
    
    private void adjust(){
        //TODO
    }
    
    public void print(){
        //TODO
        
        System.out.println("TABLEU");
        
        for (int i = 0; i < originPoints; i++) {
            for (int j = 0; j < destinyPoints; j++) {
                System.out.print(tableu[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("COSTS");
        
        for (int i = 0; i < originPoints; i++) {
            for (int j = 0; j < destinyPoints; j++) {
                System.out.print(costs[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("ORIGIN");
        
        for (int i = 0; i < originPoints; i++) {
            System.out.print(origin[i] + "\t");
        }
        System.out.println("");
        
        System.out.println("DESTINY");
        
        for (int i = 0; i < destinyPoints; i++) {
            System.out.print(destiny[i] + "\t");
        }
        System.out.println("");
    }
    
}
