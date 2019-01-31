package com.ComparatorInterface;

import java.util.Comparator;

public class SortById implements Comparator<Students> {
	@Override
	public int compare(Students o1, Students o2) {
		return o1.id.compareTo(o2.id);
	}
}
