package by.anton.homework;

import java.util.Arrays;

public class Recipe
{
    private String recipeName;
    private Food[] recipeIn;
    private double kkal;
    private double recipeGramm;

    public Recipe(String recipeName, Food[] recipeIn) {
        this.recipeName = recipeName;
        this.recipeIn = recipeIn;
        this.kkal = summKkal(recipeIn);
        this.recipeGramm=summGramm(recipeIn);
    }
    private double summGramm(Food[] food){
        double gramm=0;
        for (Food mixFood:food
        ) {
            gramm +=mixFood.getGramm();
        }

        return gramm;
    }
    private double summKkal(Food[] food){
        double kkal=0;
        for (Food mixFood:food
             ) {
            kkal +=mixFood.getGramm()*mixFood.getKkal()/100;
        }

        return kkal;
    }
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Food[] getRecipeIn() {
        return recipeIn;
    }

    public void setRecipeIn(Food[] recipeIn) {
        this.recipeIn = recipeIn;
    }

    public double getKkal() {
        return kkal;
    }

    public void setKkal(double kkal) {
        this.kkal = kkal;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", recipeIn=" + Arrays.toString(recipeIn) +
                ", kkal=" + kkal +" in Gramm="+ recipeGramm+
                '}';
    }
}
