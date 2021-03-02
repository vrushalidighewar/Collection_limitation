package com.app;

import java.util.ArrayList;

public class CollectionLimitation {

	public static void main(String[] args) {

		ArrayList pune = new ArrayList();
		pune.add("karvenagar");

		ArrayList mh = new ArrayList();
		mh.add(pune);

		ArrayList india = new ArrayList();
		india.add(mh);

		for (Object ob1 : india) {
			ArrayList states = (ArrayList) ob1;

			for (Object ob2 : states) {
				ArrayList cities = (ArrayList) ob2;

				for (Object ob3 : cities) {
					String locations = (String) ob3;
					System.out.println(locations);
				}

			}
		}
	}
}