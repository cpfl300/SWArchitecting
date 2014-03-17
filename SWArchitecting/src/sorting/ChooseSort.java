package sorting;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ChooseSort {

	@Element
	private String sortName;
	
	@Attribute
	private int idx;
	
	public ChooseSort(){
		super();
	}
	
	public String getSortName(){
		return sortName;
	}
}
