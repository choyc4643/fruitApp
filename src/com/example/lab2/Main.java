package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Main{
	public static void main(String args[]) {
		List<Fruit> al = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit f1 = new Fruit(101,"apple",1000);
		al.add(f1);
		Fruit f2 = new Fruit(102,"kiwi", 2000);
		al.add(f2);
		Fruit f3 = new Fruit(103,"fineapple", 3000);
		al.add(f3);
		
		al.add(new Fruit(104,"pear", 4500));
		al.add(new Fruit(105,"peach", 3000));
		al.add(new Fruit(106,"banana", 1900));
		al.add(new Fruit(107,"strawberry", 4000));
		al.add(new Fruit(108,"melon", 8000));
		al.add(new Fruit(109,"watermelon", 15000));
		al.add(new Fruit(110,"mango", 7000));
		

		
		Collections.sort(al, new FruitComparator());
		
		System.out.println("Fruit List (ordered by name)");
		
		for(Fruit f : al) {
			System.out.println(f.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(al, new FruitComparatorDesc());
		
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
		
		
	}

}
