/*A milk vendor buys milk at the rate of 3.25/- then adds a litre of water for every four litres of milk and sells the water milk at the rate of 4.15/-. 
Calculate the gain for the milk vendor*/

import java.util.*;

class MilkVendorProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity of milk purchased (in litres): ");
        double milkLitres = sc.nextDouble();

        double costPricePerLitre = 3.25;
        double sellingPricePerLitre = 4.15;

        // For every 4 litres milk, vendor adds 1 litre water
        double waterLitres = (milkLitres / 4);

        // Total quantity sold = milk + water
        double totalQuantitySold = milkLitres + waterLitres;

        // Total cost (only milk has cost, water is free)
        double totalCost = milkLitres * costPricePerLitre;

        // Total selling price
        double totalSellingPrice = totalQuantitySold * sellingPricePerLitre;

        // Profit
        double profit = totalSellingPrice - totalCost;

        System.out.println("Water added (litres): " + waterLitres);
        System.out.println("Total quantity sold (litres): " + totalQuantitySold);
        System.out.println("Profit: Rs " + profit);
    }
}

/*
Sample Input and Output:

Example 1:
Enter quantity of milk purchased (in litres): 8
Water added (litres): 2.0
Total quantity sold (litres): 10.0
Profit: Rs 9.0

Example 2:
Enter quantity of milk purchased (in litres): 4
Water added (litres): 1.0
Total quantity sold (litres): 5.0
Profit: Rs 4.5
*/
