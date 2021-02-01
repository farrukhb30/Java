package clothstore;

public class Pants extends Cloth {
    
    static int noOfPants = 0;
    
    {
        noOfPants +=1;
    }

    public Pants(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
    }

    @Override
    public void printInfomation() {
        if (this.getOnSale() == true) {
            System.out.println("The " + this.getColor() + " pants size " + this.getSize() + " is on sale. The original price was " + this.getPrice() + " SEK, now it is 50% off. " + (this.getPrice() - (this.getPrice() * 0.5)) + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " pants size " + this.getSize() + " is not on sale. The price is " + this.getPrice());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
