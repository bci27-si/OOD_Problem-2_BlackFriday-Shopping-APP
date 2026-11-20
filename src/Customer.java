import java.util.ArrayList;
import java.util.List;

public interface Customer {

    // array to contain all the subscribers
    List<Customer> subscribers = new ArrayList<>();
    // list of all the observers ^^^

    // should be a CustomerImplementation type since Im going to store customer implementation objects

    void recieveNotification(String Deal);

}
