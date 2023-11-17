import Data.RecipeData;

import java.util.ArrayList;

public class Recipe {
    private RecipeData<Recipe> Data;
    private ArrayList<UsedIngredient> IngredientsUsed = new ArrayList<UsedIngredient>();
    private String Name;
    private double Price;
    public void setName(String Name)
    {
        String FirstValue = this.Name;
        this.Name = Name;
        if(!updateRecipe())
            this.Name = FirstValue;
    }
    public void addIngredient(UsedIngredient ingredient)
    {
        IngredientsUsed.add(ingredient);
    }
    public void removeIngredient(UsedIngredient ingredient)
    {
        IngredientsUsed.remove(ingredient);
    }
    public void delete()
    {

    }
    public void setPrice(double Price)
    {
        this.Price = Price;
    }
    private boolean updateRecipe()
    {
        return true;
    }
    private boolean deleteRecipe()
    {
        return true;
    }
    private boolean insertRecipe()
    {
        return true;
    }
}
