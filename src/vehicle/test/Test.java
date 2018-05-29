/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.test;

import java.util.Scanner;
import vehicle.car.Car;
import vehicle.truck.Truck;

/**
 *
 * @author Nguyen Phuc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Car[] c = new Car[3];
        Truck[] t = new Truck[3];
        
        for (int i = 0; i < 3; i++){
            c[i] = new Car();
            t[i] = new Truck();
        }
        
        do {
            System.out.println("---Menu---");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort by price");
            System.out.println("4. Search by model");
            System.out.println("5. Exit");
            System.out.print("Nhap lua chon: ");           
            choice = Integer.parseInt(sc.nextLine());
            
            switch(choice){
                case 1:
                    for (int i = 0; i < 3; i++){
                        System.out.println("Nhap thong tin Car thu " + (i + 1) + ": ");
                        c[i].input();
                    }
                    for (int i = 0; i < 3; i++){
                        System.out.println("Nhap thong tin Truck thu " + (i + 1) + ": ");
                        t[i].input();  
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++){
                        c[i].display();
                    }
                    for (int i = 0; i < 3; i++){
                        t[i].display();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (choice != 5);
    }
    
}
