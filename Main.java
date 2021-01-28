package com.tts;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // This is the ArrayList Section
/*
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        System.out.print("enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            inputs.add(in.nextInt());
        }

        int sum = 0;
        int prod = 1;
        int min = 1;
        int max = 1;

        for (int num : inputs) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        for (int i = 0; i < 5; i++) {

            prod *= inputs.get(i);
        }

        System.out.println(inputs);
        System.out.println("The sum of elements is: " + sum);
        System.out.println("The product of elements is: " + prod);
        System.out.println("The Max Value in the ArrayList is: " + max);
        System.out.println("The Min Value in the ArrayList is: " + min);
*/

        // This is the Vehicles section

        HashMap <String,String> vehicles = new HashMap<String,String>();
        vehicles.put("Accord", "Honda");
        vehicles.put("Civic", "Honda");
        vehicles.put("Insight", "Honda");
        vehicles.put("Altima", "Nissan");
        vehicles.put("360Z", "Nissan");
        vehicles.put("F250", "Ford");
        vehicles.put("Ram2500", "Ram");
        vehicles.put("Ram1500", "Ram");
        vehicles.put("Charger", "Dodge");
        vehicles.put("Camaro", "Chevrolet");
        vehicles.put("Malibu","Chevrolet");
        vehicles.put("Tocoma","Toyota");

        System.out.println("Best used Cars -Inventory System");
        System.out.println("");
        System.out.println("");
        System.out.println("            I N  V E N T O RY  M E N U  ");
        System.out.println("");
        System.out.println("");
        System.out.println("              1.  Search by Model");
        System.out.println("");
        System.out.println("              2.  Search by Vehicle Make");
        System.out.println("");
        System.out.println("              3.  Search All Inventory");
        System.out.println("");
        System.out.println("              4.  Exit Inventory System");
        System.out.println("");
        System.out.println("");

boolean exit =false;
while(exit ==false){
        int menuItem=0;
        //System.out.println(vehicles.get("Accord"));
        //System.out.println(vehicles.containsKey("Accord"));
        System.out.print("Please Make a Selection:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        menuItem = input;
        switch (menuItem) {
            case 1:
                System.out.print("Please enter Vehicle momdel:");
                Scanner selectOne = new Scanner(System.in);
                String isOne = selectOne.nextLine();
                System.out.println(vehicles.get(isOne));
                break;
            case 2:
                System.out.print("Please enter Vehicle Make:");
                Scanner selectTwo = new Scanner(System.in);
                String isTwo = selectTwo.nextLine();
                System.out.println(vehicles.containsValue(isTwo));
                break;
            case 3:
                System.out.println(vehicles);
                break;
            case 4:
                exit =true;
                break;
            default:
                System.out.println("Invalid Selecton, Please try again");
                break;
        }
      }
    }
}


