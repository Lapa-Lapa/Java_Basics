package HackerRank_30_Days_of_Code;

import java.util.HashMap;
import java.util.Map;

public class Day8_Dictionaries_and_Maps_Tutorial {
    public static void main (String []args){
        //English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        //Print out all keys
        System.out.println(englSpanDictionary.keySet());
        //Print out all values
        System.out.println(englSpanDictionary.values());
        //Print out size
        System.out.println(englSpanDictionary.size());

        //Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String,Boolean>();
        shoppingList.put ("Ham",true);
        shoppingList.put ("Bread",Boolean.TRUE);
        shoppingList.put ("Oreos",Boolean.TRUE);
        shoppingList.put ("Eggs",Boolean.FALSE);
        shoppingList.put ("Sugar",false);
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
        shoppingList.remove("Eggs");
        shoppingList.replace("Bread",Boolean.FALSE);
        System.out.println(shoppingList.toString());
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
    }
}