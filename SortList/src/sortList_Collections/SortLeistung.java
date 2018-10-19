package sortList_Collections;

import java.util.Comparator;



public class SortLeistung implements Comparator<Auto>{
	
	public int compare(Auto a1, Auto a2) {
		return a1.getLeistung() - a2.getLeistung();
    }
}