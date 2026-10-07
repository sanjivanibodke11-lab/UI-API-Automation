package anitha;

public class CountIng {
    public static void CountIng (String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("ing")) {
                count++;
            }
        }
        System.out.println("Number of time 'ing' occurs: " +count);
    }
    public static void main(String[] args){
        String s ="A powerful flash flood tore through Arizona’s Grand Canyon, sending torrents of muddy water, boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) said at least 20 people may be missing or unaccounted for, prompting a public appeal for information";
        CountIng(s);
    }
    }

//