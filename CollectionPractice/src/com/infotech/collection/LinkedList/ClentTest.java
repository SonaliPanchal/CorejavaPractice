package com.infotech.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ClentTest {
public static void main(String[] args) {
	LinkedList<String> progLangs  = new LinkedList<>();
	progLangs.add("C");
    progLangs.add("C++");
    progLangs.add("Core Java");
    progLangs.add("Java EE");
    progLangs.add("Spring Framework");
    progLangs.add("Hibernate Framework");
    progLangs.addFirst("DotNet");
    progLangs.addLast("PHp");
    
    System.out.println("iterating by simple for each loop");
    for(String name : progLangs)
    {
    System.out.println(name);	
    }
    
    System.out.println("iterating by java 8 for loop");
    progLangs.forEach(name ->{
    	System.out.println(name);
    });
    System.out.println("iterating element by iterator ");
    Iterator< String> itr = progLangs.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    System.out.println("iterating element by Decending iterator ");
    Iterator < String > descendingIterator = progLangs.descendingIterator();
    while (descendingIterator.hasNext()) {
        String speciesName = descendingIterator.next();
        System.out.println(speciesName);
    }
    ListIterator < String > listIterator = progLangs.listIterator(progLangs.size());
    while (listIterator.hasPrevious()) {
        String speciesName = listIterator.previous();
        System.out.println(speciesName);
    }
}
}
