import java.util.Map;

public class allSwap {
  public String[] allSwap(String[] strings) {
    Map<String, Integer> map = new HashMap();

    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(String.valueOf(strings[i].charAt(0)))) {
        int indexOfFirstInstance = map.get(String.valueOf(strings[i].charAt(0)));
        String currentValue = strings[i];
        strings[i] = strings[indexOfFirstInstance];
        strings[indexOfFirstInstance] = currentValue;
        map.remove(String.valueOf(strings[i].charAt(0)));
      } else {
        map.put(String.valueOf(strings[i].charAt(0)), i);
      }
    }
    return strings;
  }

}
