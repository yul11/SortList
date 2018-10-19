package sortList_Collections;

import java.util.Comparator;



public class SortZulassung implements Comparator<Auto>{
	
	public int compare(Auto a1, Auto a2) {
		return a1.getZulassung() - a2.getZulassung();
    }
}