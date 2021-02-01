package clothstore;

public class Cloth {

    private String color;
    private int size;
    private double price;
    private boolean onSale;
    static int noOfCloths = 0;

    {
        noOfCloths += 1;
    }

    public Cloth(String color, int size, double price, boolean onSale) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printInfomation() {
    }

    public boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    static void printNumberOfCloths() {
        System.out.println("Number of Cloths created : " + Cloth.noOfCloths);
        System.out.println("\nNumber of Pants created : " + Pants.noOfPants);
        System.out.println("Number of Dresses created : " + Dress.noOfDresses);
        System.out.println("Number of TShirts created : " + TShirt.noOfTShirts);
    }

    static void printTotalSales() {

        double salesCloth = 0;
        double salesPants = 0;
        double salesDress = 0;
        double salesTShirt = 0;

        for (Cloth cloth : ClothStore.shop) {

            //Calculating price for all the pants
            if (cloth instanceof Pants && cloth.getOnSale() == true) {
                salesPants = salesPants + (cloth.getPrice() * 0.5);
            } else if(cloth instanceof Pants && cloth.getOnSale() == false) {
                salesPants = salesPants + cloth.getPrice();
            }

            //Calculating price for all the Dresses
            if (cloth instanceof Dress && cloth.getOnSale() == true) {
                salesDress = salesDress + (cloth.getPrice() * 0.3);
            } else if (cloth instanceof Dress && cloth.getOnSale() == false) {
                salesDress = salesDress + cloth.getPrice();
            }

            //Calculating price for all the T-Shirts
            if (cloth instanceof TShirt && cloth.getOnSale() == true) {
                salesTShirt = salesTShirt + (cloth.getPrice() * 0.7);
            } else if (cloth instanceof TShirt && cloth.getOnSale() == false) {
                salesTShirt = salesTShirt + cloth.getPrice();
            }

        }
        
        salesCloth = salesDress+salesPants+salesTShirt;

        System.out.println("Total sales: " + salesCloth);
        
        System.out.println("\nSales for pants: " + salesPants);
        System.out.println("Sales for dresses: " + salesDress);
        System.out.println("Sales for tShirts: " + salesTShirt);

    }

    @Override
    public String toString() {
        return "Color=" + color + ", Size=" + size + ", Price=" + price;
    }

}
