/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.IngredientControlException;
import java.util.ArrayList;

/**
 *
 * @author Clayton
 */
public class IngredientControl {

    public enum Ingredient {

        eggs("eggs", 1, 0.55f),
        sugar("sugar", 2, 0.56f),
        flour("flour", 3, 0.57f),
        butta("butta", 4, 0.58f);

        public final String name;
        public final int weight;
        public final float cost;

        private Ingredient(String name, int weight, float cost) {
            this.name = name;
            this.weight = weight;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public float getCost() {
            return cost;
        }

    }

    ArrayList<Ingredient> myIngredients;

    public IngredientControl() {
        myIngredients = new ArrayList<Ingredient>();
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Ingredient i : myIngredients) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public float getTotalCost() {
        float totalCost = 0;
        for (Ingredient i : myIngredients) {
            totalCost += i.getCost();
        }
        return totalCost;
    }

    public int getNumOf(String name)
            throws IngredientControlException {

        int num = 0;
        if (name == null) {
            throw new IngredientControlException("Not valid name");
        }
        for (Ingredient i : myIngredients) {
            if (i.getName() == null) {
                throw new IngredientControlException("Not valid ingredient name");
            }
            if (name == i.getName()) {
                num++;
            }
        }
        return num;
    }

    public void addIngredient(Ingredient i) {
        myIngredients.add(i);
    }
}
