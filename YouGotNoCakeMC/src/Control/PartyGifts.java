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

//    String Gifts = "";
//    
//    public ArrayList<PartyGifts> addPartyGifts(){
//    
//    ArrayList<PartyGifts> list = new ArrayList<>();
//    
//    PartyGifts unicorn = new PartyGifts(String "Stuffed_Unicorn");
//    list.add(unicorn);
//        
//    list.add(new Gifts("Stuffed Unicorn"));
//    list.add(new Gifts("Whoopie Cushion"));
//    list.add(new Gifts("Baseball Bat"));
//    list.add(new Gifts("Pokemon Cards"));
//
//    return list;    
//    }
