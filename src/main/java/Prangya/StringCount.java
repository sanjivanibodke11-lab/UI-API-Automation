package Prangya;

public class StringCount {
    void count(String s) {

        String[] a = s.split(" ");
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i].contains("ing")) {
                count++;
            }
        }

        System.out.println( count);
    }

    public static void main(String[] args) {

        StringCount a1 = new StringCount();

        String s = "A powerful flash flood tore through Arizona’s Grand Canyon, sending torrents of muddy water, boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) said at least 20 people may be missing or unaccounted for, prompting a public appeal for information.";

        a1.count(s);
    }
}
