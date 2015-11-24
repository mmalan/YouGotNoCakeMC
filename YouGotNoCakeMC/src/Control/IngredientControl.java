/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Clayton
 */
public class IngredientControl {

    public enum Ingredients {

        eggs("0.22",  "0.55"),
        sugar("0.44",  "0.56"),
        flour("0.27",  "0.57"),
        butta("0.25",  "0.58");

        public final String weight;
        public final String cost;

        private Ingredients(String weight, String cost) {
            this.weight = weight;
            this.cost = cost;
        }

        public String getWeight() {
            return weight;
        }

        public String getCost() {
            return cost;
        }


    }
}
