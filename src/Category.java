import java.util.ArrayList;
import java.util.List;

public class Category extends ProductComponent {

    String name;
    //String Category;
    //Double price;
    // category list
    private List<ProductComponent> categories = new ArrayList<>();

    public Category(String name) {
        this.name = name;
        //this.Category = Category;
        //this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent category : categories) {
            total+=category.getPrice();
            // works for the products and categories
        }
        return total;
    }

    @Override
    public void add(ProductComponent product) {
        // add category of product ?
        categories.add(product);

    }
    // add remove ?

    @Override
    public void display(){
        //method to show the product’s details (e.g., name and price).
        System.out.println("Category " + this.name + "Total: $ " + this.getPrice());

        //loop over products
        for (ProductComponent category : categories) {
            category.display();
        }
    }


}
