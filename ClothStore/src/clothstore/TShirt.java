package clothstore;

public class TShirt extends Cloth {
    
    static int noOfTShirts = 0;
    
    {
        noOfTShirts += 1;
    }

    public TShirt(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
    }

    @Override
    public void printInfomation() {
        if (this.getOnSale() == true) {
            System.out.println("The " + this.getColor() + " T-shirt size " + this.getSize() + " is on sale. The original price was " + this.getPrice() + " SEK, now it is 30% off. " + (this.getPrice() - (this.getPrice() * 0.3)) + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " T-Shirt size " + this.getSize() + " is not on sale. The price is " + this.getPrice());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
