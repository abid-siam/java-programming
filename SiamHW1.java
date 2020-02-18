class Ingredient {
    double measurement;
    String item;
    Ingredient(double measurement, String item) {
        this.measurement = measurement;
        this.item = item;
    }

    @Override
    public String toString() {
        return item + " - " + measurement;
    }
}

class Recipe {
    Ingredient[] ingredients;
    String[] steps;
    int maxSize = 50;
    private int totalIngredients = 0;
    private int totalSteps = 0;

    Recipe() {
        ingredients = new Ingredient[maxSize];
        setupIngredients(); // this will not be called with an add function that is implemented 'elsewhere'
        steps = new String[maxSize];
        setupSteps();
    }

    private void setupIngredients() {
        ingredients[0] = new Ingredient(1, "salted butter");
        ingredients[1]= new Ingredient(1, "white sugar");
        ingredients[2] = new Ingredient(1, "light brown sugar");
        ingredients[3] = new Ingredient(2, "pure vanilla extract");
        ingredients[4]= new Ingredient(2, "large eggs");
        ingredients[5] = new Ingredient(3, "all-purpose flour");
        ingredients[6] = new Ingredient(1, "baking soda");
        ingredients[7]= new Ingredient(0.5, "baking powder");
        ingredients[8] = new Ingredient(1, "sea salt");
        ingredients[9] = new Ingredient(2, "chocolate chips");
    }

    private void setupSteps() {
        steps[0] = ("Preheat oven to 375 degrees F. Line a baking pan with parchment paper and set aside.");
        steps[1] = ("In a separate bowl mix flour, baking soda, salt, baking powder. Set aside.");
        steps[2] = ("Cream together butter and sugars until combined.");
        steps[3] = ("Beat in eggs and vanilla until fluffy.");
        steps[4] = ("Mix in the dry ingredients until combined.");
        steps[5] = ("Add 12 oz package of chocolate chips and mix well.");
        steps[6] = ("Roll 2-3 TBS (depending on how large you like your cookies) of dough at a time into balls and place them evenly spaced on your prepared cookie sheets. (alternately, use a small cookie scoop to make your cookies)!");
        steps[7] = ("Bake in preheated oven for approximately 8-10 minutes. Take them out when they are just BARELY starting to turn brown.");
        steps[8] = ("Let them sit on the baking pan for 2 minutes before removing to cooling rack.");
    }

    @Override
    public String toString() {
        String output = "";
        output += "---Ingredients---\n";
        int i = 0;
        while (ingredients[i] != null) {
            output += ingredients[i].toString() + "\n";
            i++;
        }
        output += "\r\n\r\n";
        output += "---Steps---\n";

        i = 0;
        while (steps[i] != null) {
            output += steps[i] += "\n";
            i++;
        }
        return output;
    }
}


public class SiamHW1 { // change this bitch
    public static void main(String[] args) {
        Recipe myRecipe = new Recipe();
        System.out.println(myRecipe);
    }
}
