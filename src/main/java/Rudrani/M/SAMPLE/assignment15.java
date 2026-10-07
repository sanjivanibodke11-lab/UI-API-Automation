package Rudrani.M.SAMPLE;

public class assignment15 {

    public void countvowels() {
        String s = "rudranim";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            } else if (s.charAt(i) == 'e') {
                count++;
            } else if (s.charAt(i) == 'i') {
                count++;
            } else if (s.charAt(i) == 'o') {
                count++;
            } else if (s.charAt(i) == 'u') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("There is no vowel in your name");
        }
    }

    public static void main(String[] args) {
        assignment15 obj = new assignment15();
        obj.countvowels();
    }
}