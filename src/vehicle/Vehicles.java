/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Scanner;

/**
 *
 * @author Nguyen Phuc
 */
public class Vehicles implements IVehicle, Comparable<Vehicles> {
    protected String maker, model;
    protected double price;
    Scanner sc = new Scanner(System.in);

    public Vehicles() {
    }

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        System.out.print("Nhap maker: ");
        this.maker = sc.nextLine();
        System.out.print("Nhap model: ");
        this.model = sc.nextLine();
        System.out.print("Nhap price: ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.println("---Vehicle Info---");
        System.out.println("Maker: " + this.maker);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }

    @Override
    public int compareTo(Vehicles o) {
        return (int) (o.getPrice() - price);
    }
}
