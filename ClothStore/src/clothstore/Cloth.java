
package clothstore;


public class Cloth {
     
    private String color;
    private int size;
    private double price;
    private boolean onSale;
    static int noOfCloths = 0;
    
    {
        noOfCloths +=1;
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
    
    public void printInfomation(){
    }

    public boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
    
    @Override
    public String toString() {
        return "Color=" + color + ", Size=" + size + ", Price=" + price;
    }

       
}
