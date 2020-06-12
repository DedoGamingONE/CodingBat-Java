import java.util.Map;

public class pairs {
  public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap();  
    for(int i = 0; i < strings.length; i++) {
      if (!map.containsKey(strings[i].charAt(0))) {
        map.put( strings[i].substring(0, 1),
          strings[i].substring( strings[i].length()-1) );
      }
    }
    return map;
  }
}
