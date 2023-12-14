/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transport;

/**
 *
 * @author LESLYE
 */
public class MTransportTest {
    public static void main(String[] args) {
        MTransport mt = new MTransport(2, 3);
        
        float []origin = {4, 5};
        float []destiny = {1, 2, 6};
        float [][]costs = {{1, 2, 3},{4, 5, 6}};
        
        mt.setDestiny(destiny);
        mt.setOrigin(origin);
        mt.setCosts(costs);
        
        mt.print();
    }
}
