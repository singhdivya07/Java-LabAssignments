package com.capgemini.training.lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exercise1 {
public static HashMap<String,Integer> getValues(HashMap<String,Integer> obj)
{
	List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String, Integer> >(obj.entrySet()); 
	  
	Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
        public int compare(Map.Entry<String, Integer> o1,  
                           Map.Entry<String, Integer> o2) 
        { 
            return (o1.getValue()).compareTo(o2.getValue()); 
        } 
    }); 
	HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
    for (Map.Entry<String, Integer> aa : list) { 
        temp.put(aa.getKey(), aa.getValue()); 
    } 
    return temp;
	}
	public static void main(String[] args) {
HashMap<String, Integer> obj = new HashMap<String,Integer>();
obj.put("Math", 98); 
obj.put("Data Structure", 85); 
obj.put("Database", 91); 
obj.put("Java", 95); 
obj.put("Operating System", 79); 
obj.put("Networking", 80); 
Map<String, Integer> hm1 = getValues(obj); 
System.out.println("The values of HashMap in sorted order is :");
for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
    System.out.println(" Value = " + en.getValue()); 
} 
	}

}
