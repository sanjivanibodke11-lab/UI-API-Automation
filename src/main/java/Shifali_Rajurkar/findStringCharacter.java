package Shifali_Rajurkar;

public class findStringCharacter {
    public void findPattern(String str){
        int count =0;
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {

            if (words[i].contains("ing")) {
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Count : "+count);
    }
    public static void main(String args[]){
        findStringCharacter obj = new findStringCharacter();

        String Paragraph ="A powerful flash flood tore through Arizona’s Grand Canyon, sending torrents of muddy water, boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) said at least 20 people may be missing or unaccounted for, prompting a public appeal for information.";
        obj.findPattern(Paragraph);
    }
}
