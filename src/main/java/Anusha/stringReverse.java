package Anusha;


    public class stringReverse {
        public void reverse(char[] str) {
            for (int i = str.length - 1; i >= 0; i--) {
                System.out.print(str[i]);
            }
            System.out.println();
        }
        public static void main(String[] args) {
            String s = "Naresh IT";
            stringReverse sr = new stringReverse();
            char[] c = s.toCharArray();
            sr.reverse(c);
        }
    }
