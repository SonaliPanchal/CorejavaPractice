package com.infotech.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ClinetTeat {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(9);
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(20);
		System.out.println("ghgh"+arrayList.size());

		ArrayList<Integer> arrayList1 = new ArrayList<>(10);
		arrayList1.add(100);
		arrayList1.add(100);
		arrayList1.add(100);
		
		System.out.println("size"+arrayList1.size());
		arrayList.addAll(arrayList1);

		Iterator<Integer> itr = arrayList.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		arrayList.forEach(a ->
		{
			System.out.println(a);
		});

	}
}
