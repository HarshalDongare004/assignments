package in.ineuron.control;
public class FindFirstNonRepeatingCharacter {

  public static void main(String[] args) {
    String s = "loveleetcode";

    int index = findFirstNonRepeatingCharacter(s);

    System.out.println(index);
  }

  public static int findFirstNonRepeatingCharacter(String s) {
    int[] count = new int[256];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i)]++;
    }

    for (int i = 0; i < s.length(); i++) {
      if (count[s.charAt(i)] == 1) {
        return i;
      }
    }

    return -1;
  }
}