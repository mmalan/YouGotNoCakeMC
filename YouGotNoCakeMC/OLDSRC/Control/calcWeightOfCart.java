/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.calcItemToPounds;

/**
 *
 * @author Clayton H. & Matt M.
 */
public class calcWeightOfCart {

    public double calcWeightOfCart(double totalItemsLbs, String item) {

        double totalWeight = 0;
        String list[] = {"egg", "sugar", "flour", "butta"};

        if (item != (list[0])) {
            return -1;
        }

        if (totalItemsLbs > 25 || totalItemsLbs < 0) {
            return -1;
        }
        totalWeight += totalItemsLbs;

        return totalWeight;
    }
}
