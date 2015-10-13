package cup;
import java.util.ArrayList;
import java.util.TreeMap;

public class Property {
	
	public String name;
	public String name_formatted;
	public ArrayList<Entity> entityList;
	public ArrayList<String> reviews;
	public double[] latlng;
	public String address;
	public String type;
	public String tip;
	public ArrayList<EntityTagged> entitiesTagged;
	public ArrayList<Entity> entitiesUntagged;
	
	//processing only
	//public TreeMap<String,Integer> entityScore;
	//public TreeMap<String,Integer> entityFreq;
	
	public Property(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

}
