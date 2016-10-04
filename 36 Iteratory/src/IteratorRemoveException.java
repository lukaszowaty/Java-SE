import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveException {

	public static void main(String[] args) {
		 List<String> names = new ArrayList<>();
	        names.add("Kasia");
	        names.add("Basia");
	        names.add("Kajtek");
	        names.add("Wojtek");
	        names.add("Maniek");
	 
	        // pętla ok, bo nie korzystamy z iteratora
	        System.out.println(">>> Pętla 1");
	        for (int i=0; i < names.size(); i++) {
	        	String name = names.get(i);
	        	System.out.println(name);
	        	if (name.equals("Basia")) {
	        		names.remove(name);
	        	}
	        }
	        
	        Iterator<String> namesIterator = names.iterator();
	        while (namesIterator.hasNext()) {
	            String name = namesIterator.next();
	            System.out.println(name);
	            if (name.equals("Kasia")) {
	                namesIterator.remove();
	            }
	        }
	        
	        

	}

}
