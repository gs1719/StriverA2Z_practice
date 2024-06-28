package com;

import java.util.*;

public class testingCollect {
    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        hashset.add(null);
        hashset.add(null);

        for(Integer value:hashset){
            System.out.println(value);
        }
        System.out.println("Now linked Hashset");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(1);
        linkedHashSet.add(2);

        for(Integer value:linkedHashSet){
            System.out.println(value);
        }

        System.out.println("Now Tree set");
        Set<Integer> treeSet = new TreeSet<>();
        try {
            treeSet.add(null);
        } catch (Exception e) {
            System.out.println("Throws NPE");
        }

        for(Integer value:linkedHashSet){
            System.out.println(value);
        }

        System.out.println("Now Map======================");
        System.out.println("Now HashMap======================");

        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(null,null);
        integerStringMap.put(null,null);
        integerStringMap.put(1,null);


        for(Integer key: integerStringMap.keySet()){
            System.out.println(key+"======="+integerStringMap.get(key));
        }


        System.out.println("Now HashTable ======================");

        Map<Integer,String> integerStringHashtable = new Hashtable<>();
        try {
            integerStringHashtable.put(1,null);
            integerStringHashtable.put(null,null);
            integerStringHashtable.put(null,null);
        } catch (Exception e) {
            System.out.println("NPE");
        }


        for(Integer key: integerStringMap.keySet()){
            System.out.println(key+"======="+integerStringMap.get(key));
        }

        System.out.println("Now Tree Map ======================");

        Map<Integer,String> integerStringTreeMap = new TreeMap<>();

        integerStringTreeMap.put(null,"hell");
        integerStringTreeMap.put(1,null);
            integerStringTreeMap.put(null,null);


        for(Integer key: integerStringMap.keySet()){
            System.out.println(key+"======="+integerStringMap.get(key));
        }
    }
}
