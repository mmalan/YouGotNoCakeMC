/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;

/**
 *
 * @author Clayton
 */
public class PartyGifts {
    
    ArrayList<String> obj;
  
    public PartyGifts() {
        
        obj = new ArrayList();
        
        obj.add("Stuffed Unicorn");
	obj.add("Whoopie Cushion");
	obj.add("Baseball Bat");
	obj.add("Pokemon Cards");
        
        //String getList = obj.get(0);
        
        //System.out.println("Current array list is:"+obj);
    }
    
    public ArrayList<String> getObj() {
        return obj;
    }
    
}