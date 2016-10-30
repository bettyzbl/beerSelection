package com.sogou.imeda.betty.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")) {
			brands.add("amber-1");
			brands.add("amber-2");
		} else {
			brands.add("not-amber-1");
			brands.add("not amber-2");
		}

		return brands;

	}
}
