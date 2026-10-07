package Anusha;

public class countIng {
    public void findIngWords(String text) {
        int count = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            String cleanWord = word;
            if (cleanWord.toLowerCase().endsWith("ing")) {
                System.out.println("Word found: " + cleanWord);
                count++;
            }
        }
        System.out.println("Total words ending with 'ing': " + count);
    }
    public static void main(String[] args) {
        String s = "A powerful flash flood tore through Arizona's Grand Canyon, sending torrents of muddy water, "
                + "boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) "
                + "said at least 20 people may be missing or unaccounted for, "
                + "prompting a public appeal for information.";
        countIng ci = new countIng();
        ci.findIngWords(s);
    }
}