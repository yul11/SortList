package sortList_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Start {
	
	  public static void main(String[] args) {
	 
		  List<Auto> autos = new ArrayList<Auto>();
		 
		  autos.add(new Auto("Mercedes", 2007, 300));
		  autos.add(new Auto("Audi A8", 2010, 500));
		  autos.add(new Auto("Fiat", 1999, 70));
		  autos.add(new Auto("Ferrari", 2018, 850));


		  
		  
		  
		  Collections.sort(autos, new SortMarke());
		  
		  System.out.println("Sortierung nach Fahrzeugmarke:");
		  for (Auto a : autos) {
			  System.out.println(a);
		  }

		  
		  
		  
		  Collections.sort(autos, new SortZulassung());
		  
		  System.out.println("\nSortierung nach Jahr der Zulassung:");
		  for (Auto a : autos) {
			  System.out.println(a);
		  }

	  
		  Collections.sort(autos, Collections.reverseOrder(new SortLeistung()));
		  //Collections.sort(autos, new SortLeistung());
		  
		  System.out.println("\numgekehrte Sortierung nach Leistung des Motors:");
		  for (Auto a : autos) {
			  System.out.println(a);
		  }
	  
	  }
}