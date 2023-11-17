public class Ingredient {
    protected int Id;
    private String Name;
    private double Amount;
    private ValueType Type;
    public void setName(String Name)
    {
        String FirstValue = this.Name;
        this.Name = Name;
        if(!updateIngredient())
            this.Name = FirstValue;
    }
    public void setType(ValueType Type)
    {
        this.Type = Type;
    }
    public void setAmount(double Amount)
    {
        this.Amount = Amount;
    }
    public void delete()
    {

    }
    private boolean updateIngredient()
    {
        return true;
    }
    private boolean deleteIngredient()
    {
        return true;
    }
    private boolean insertIngredient()
    {
        return true;
    }
}
