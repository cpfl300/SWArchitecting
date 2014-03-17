package sorting;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class SortMain {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		int[] inputArray = {1,7,3,4,5,6,2,10,3,8,9};
		
		Serializer seri = new Persister();
		File source = new File("chooseSort.xml");

		ChooseSort choose = null;

		try {
			choose = seri.read(ChooseSort.class, source);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Sort sort = (Sort)Class.forName("sorting."+choose.getSortName()).newInstance();
		int[] result = sort.doSorting(inputArray);
		
		for(int i =0; i < inputArray.length ; i++){
			System.out.print(result[i]+" ");
		}
	}
}
