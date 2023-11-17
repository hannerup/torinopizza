package Data;

public class RecipeData<Recipe> implements CRUD<Recipe>
{
    private SQLDataAccess db;

    public RecipeData(SQLDataAccess db)
    {
        this.db = db;
    }
    public boolean insert(Recipe recipe)
    {
        db.insertData("string med user members og kommando til sql");
        return true;
    }
    public boolean delete(Recipe recipe)
    {
        db.updateData("string med user members og kommando til sql");
        return true;
    }
    public Recipe get(String id)
    {
        return db.<User>loadData("string med user members og kommando til sql")[0];
    }
    public Recipe[] getAll()
    {
        return db.loadData("string med user members og kommando til sql");
    }
    public boolean Update(Recipe recipe)
    {
        db.updateData("string med user members og kommando til sql");
        return true;
    }
}
