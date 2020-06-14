import java.util.Map;

public class wordAppend {
  /*
  Loop over the given array of strings to build a result string like this: when
  a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
  to the result. Return the empty string if no string appears a 2nd time.
  */
  public String wordAppend(String[] strings) {
    StringBuilder builder = new StringBuilder();
    Map<String, Integer> map = new HashMap();
    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(strings[i])) {
        int currValue = (int) map.get(strings[i]);
        if ((currValue + 1) % 2 == 0) {
          builder.append(strings[i]);
        }
         map.put(strings[i], currValue + 1);
      } else {
        map.put(strings[i], 1);
      }
    }
    return builder.toString();
  }

}
