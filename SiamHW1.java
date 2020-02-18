/*
    author: Abid Siam
    net-id: as10476
    due date: 02.15.20 11:55 PM
    assignment: CS-UY 3913 - HW01
    Professor Katz
    Description: Implement an Ingredient and Recipe class that prints out the Recipe.


************* Please Read ****************
- See main() function below within the SiamHW1 class of this file
- I implemented a toString() for the Ingredient class as well to make code more concise
- Although assignment prompt indicated an add function would not be necessary for the Recipe class,
I implemented it to make the main() function more legible. Of course, this all assumes a predetermined size
of both the ingredients and steps arrays.
************* Please Read *****************
 */


class Ingredient {
    double measurement;
    String item;
    Ingredient(double measurement, String item) {
        this.measurement = measurement;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Item: " + item + ", Quantity: " + measurement;
    }
}

class Recipe {
    Ingredient[] ingredients;
    String[] steps;

    private int totalIngredients = 0;
    private int totalSteps = 0;

    Recipe() {
        ingredients = new Ingredient[10];
        steps = new String[10];
    }

    public void addIngredient(Ingredient ingredient) {
        if (totalIngredients == 10) {
            System.out.println("Too many ingredients");
            return;
        }
        ingredients[totalIngredients] = ingredient;
        totalIngredients++;
    }
    public void addStep(String step) {
        if (totalSteps == steps.length) {
            System.out.println("Too many steps");
            return;
        }
        steps[totalSteps] = step;
        totalSteps++;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ingredients:\n");
        for (int i = 0; i < totalIngredients; ++i) {
            result.append(ingredients[i].toString() + "\n");
        }
        result.append("\r\n\r\n");
        result.append("Steps:\n");
        for (int i = 0; i < totalSteps; ++i) {
            result.append(String.valueOf(i + 1) + ". ");
            result.append(steps[i]);
            result.append("\n");
        }
        return result.toString();
    }
}


public class SiamHW1 {
    public static void main(String[] args) {
        // recipe source: https://joyfoodsunshine.com/the-most-amazing-chocolate-chip-cookies/#wprm-recipe-container-8678
        Recipe myRecipe = new Recipe();
        Ingredient a = new Ingredient(1, "salted butter");
        Ingredient b = new Ingredient(1, "white sugar");
        Ingredient c = new Ingredient(1, "light brown sugar");
        Ingredient d = new Ingredient(2, "pure vanilla extract");
        Ingredient e = new Ingredient(2, "large eggs");
        Ingredient f = new Ingredient(3, "all-purpose flour");
        Ingredient g = new Ingredient(1, "baking soda");
        Ingredient h = new Ingredient(0.5, "baking powder");
        Ingredient i = new Ingredient(1, "sea salt");
        Ingredient j = new Ingredient(2, "chocolate chips");
        myRecipe.addIngredient(a);
        myRecipe.addIngredient(b);
        myRecipe.addIngredient(c);
        myRecipe.addIngredient(d);
        myRecipe.addIngredient(e);
        myRecipe.addIngredient(f);
        myRecipe.addIngredient(g);
        myRecipe.addIngredient(h);
        myRecipe.addIngredient(i);
        myRecipe.addIngredient(j);
        myRecipe.addStep("Preheat oven to 375 degrees F. Line a baking pan with parchment paper and set aside.");
        myRecipe.addStep("In a separate bowl mix flour, baking soda, salt, baking powder. Set aside.");
        myRecipe.addStep("Cream together butter and sugars until combined.");
        myRecipe.addStep("Beat in eggs and vanilla until fluffy.");
        myRecipe.addStep("Mix in the dry ingredients until combined.");
        myRecipe.addStep("Add 12 oz package of chocolate chips and mix well.");
        myRecipe.addStep("Roll 2-3 TBS (depending on how large you like your cookies) of dough at a time into balls and place them evenly spaced on your prepared cookie sheets. (alternately, use a small cookie scoop to make your cookies)!");
        myRecipe.addStep("Bake in preheated oven for approximately 8-10 minutes. Take them out when they are just BARELY starting to turn brown.");
        myRecipe.addStep("Let them sit on the baking pan for 2 minutes before removing to cooling rack.");
        System.out.println(myRecipe);
    }
}
