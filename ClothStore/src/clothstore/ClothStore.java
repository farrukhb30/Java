
package clothstore;

import java.util.ArrayList;


public class ClothStore {

    static ArrayList<Cloth> shop = new ArrayList<>();
    
    public static void main(String[] args) {

        populatingCloths();
      
        printAllCloths();
        
        printNumberOfCloths();
        
    }

    private static void printNumberOfCloths() {
        System.out.println("Number of Cloths created : " + Cloth.noOfCloths);
        System.out.println("\nNumber of Pants created : " + Pants.noOfPants);
        System.out.println("Number of Dresses created : " + Dress.noOfDresses);
        System.out.println("Number of TShirts created : " + TShirt.noOfTShirts);
    }

    private static void printAllCloths() {
        for (Cloth cloth: shop) {
            cloth.printInfomation();
        }
    }

    private static void populatingCloths() {
        Dress d = new Dress("Red", 36, 500, true);
        Dress d1 = new Dress("White", 36, 400, true);
        Dress d2 = new Dress("Pink", 38, 250, false);
        Dress d3 = new Dress("Purple", 38, 250, true);
        
        TShirt t = new TShirt("Red", 38, 150, false);
        TShirt t1 = new TShirt("Blue", 38, 150, false);
        TShirt t2 = new TShirt("Yellow", 38, 150, false);
        TShirt t3 = new TShirt("Brown", 38, 150, true);
        TShirt t4 = new TShirt("Purple", 38, 150, true);
        
        Pants p = new Pants("Blue", 36, 350, true);
        Pants p1 = new Pants("Blue", 38, 350, false);
        Pants p2 = new Pants("Black", 36, 400, true);
        Pants p3 = new Pants("Black", 38, 400, false);
        
        shop.add(d);
        shop.add(d1);
        shop.add(d2);
        shop.add(d3);
        shop.add(t);
        shop.add(t1);
        shop.add(t2);
        shop.add(t3);
        shop.add(t4);
        shop.add(p);
        shop.add(p1);
        shop.add(p2);
        shop.add(p3);
    }
    
}
