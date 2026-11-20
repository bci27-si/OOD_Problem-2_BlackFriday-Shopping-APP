public class Product extends ProductComponent{

    private String name;
    private double price;
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }

    public void display(){
        System.out.println("Name: " + name + " - Price: " + price);
    }

}
