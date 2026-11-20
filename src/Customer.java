public interface Customer {

    // array to contain all the subscribers
    Customer Subscribe[] subscribers;
    // should be a CustomerImplementation type since Im going to store customer implementation objects

    // interface method for observer pattern.

    void recieveNotification();

}
