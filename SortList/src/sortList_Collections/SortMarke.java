package sortList_Collections;

import java.util.Comparator;



public class SortMarke implements Comparator<Auto>{
	
	public int compare(Auto a1, Auto a2) {
		return a1.getMarke().compareTo(a2.getMarke());
    }
}