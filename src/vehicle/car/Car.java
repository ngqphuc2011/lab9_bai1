/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.car;

import java.util.Scanner;

/**
 *
 * @author Nguyen Phuc
 */
public class Car extends vehicle.Vehicles {
    private String color;
    Scanner sc = new Scanner(System.in);

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.print("Nhap color: ");
        this.color = sc.nextLine();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Color: " + this.color);
    }
}
