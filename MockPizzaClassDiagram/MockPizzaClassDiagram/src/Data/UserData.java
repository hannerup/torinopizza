package Data;
import java.util.Collection;

public class UserData<User> implements CRUD<User>
{
    private SQLDataAccess db;

    public UserData(SQLDataAccess db)
    {
        this.db = db;
    }
    public boolean insert(User user)
    {
        db.insertData("string med user members og kommando til sql");
        return true;
    }
    public boolean delete(User user)
    {
        db.updateData("string med user members og kommando til sql");
        return true;
    }
    public User get(String id)
    {
        return db.<User>loadData("string med user members og kommando til sql")[0];
    }
    public User[] getAll()
    {
        return db.loadData("string med user members og kommando til sql");
    }
    public boolean Update(User user)
    {
        db.updateData("string med user members og kommando til sql");
        return true;
    }
}
