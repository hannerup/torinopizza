import java.util.ArrayList;
import java.util.Date;

public class Cart {
    private ArrayList<Order> Orders = new ArrayList<Order>();
    private String Buyer;
    private boolean PayedFor;
    private boolean TakeOut;
    private Date Delivery;
    private int id;
    private int UserId;

    public void addOrder(Order Order)
    {
        Orders.add(Order);
    }
    public void removeOrder(Order Order)
    {
        Orders.remove(Order);
    }
    public void delete()
    {

    }
    private boolean updateOrder()
    {
        return true;
    }
    private boolean deleteOrder()
    {
        return true;
    }
    private boolean insertOrder()
    {
        return true;
    }
}
