import java.util.Map;

public class mapShare {
	/*Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that 
	 * same value. In all cases remove the key "c", leaving the rest of the map unchanged.*/
	public Map<String, String> mapShare(Map<String, String> map) {
		  while(map.containsKey("c")) {
		    map.remove("c");
		  }
		  if(map.containsKey("a")) {
		    map.put("b", map.get("a"));
		  }
		  return map;
	}

}
