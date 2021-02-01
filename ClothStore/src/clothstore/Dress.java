package clothstore;

public class Dress extends Cloth {
    
    static int noOfDresses = 0;
    
    {
        noOfDresses += 1;
    }

    public Dress(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
    }

    @Override
    public void printInfomation() {
        if (this.getOnSale() == true) {
            System.out.println("The " + this.getColor() + " dress size " + this.getSize() + " is on sale. The original price was " + this.getPrice() + " SEK, now it is 70% off. " + (this.getPrice() - (this.getPrice() * 0.7)) + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " dress size " + this.getSize() + " is not on sale. The price is " + this.getPrice());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
