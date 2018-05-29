/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.truck;

import java.util.Scanner;

/**
 *
 * @author Nguyen Phuc
 */
public class Truck extends vehicle.Vehicles {
    private int truckload;
    Scanner sc = new Scanner(System.in);

    public Truck() {
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.print("Nhap truckload: ");
        this.truckload = Integer.parseInt(sc.nextLine());
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Truckload: " + this.truckload);
    }
}
