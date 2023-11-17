package Data;

public class OrderData<Order> implements CRUD<Order>
{
    private SQLDataAccess db;

    public OrderData(SQLDataAccess db)
    {
        this.db = db;
    }
    public boolean insert(Order order)
    {
        db.insertData("string med user members og kommando til sql");
        return true;
    }
    public boolean delete(Order order)
    {
        db.updateData("string med user members og kommando til sql");
        return true;
    }
    public Order get(String id)
    {
        return db.<Order>loadData("string med user members og kommando til sql")[0];
    }
    public Order[] getAll()
    {
        return db.loadData("string med user members og kommando til sql");
    }
    public boolean Update(Order order)
    {
        db.updateData("string med user members og kommando til sql");
        return true;
    }
}
