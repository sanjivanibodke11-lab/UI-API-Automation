package Prangya;

public class IsPresent {
    public int check(String s)
    {

        int count=0;
        String strArray [] = s.split(" ");
        for (String str: strArray) {
            if (str.contains("ing")) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="A powerful flash flood tore through Arizona’s Grand Canyon, sending torrents of muddy water, boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) said at least 20 people may be missing or unaccounted for, prompting a public appeal for information.";
        IsPresent p=new IsPresent();
        int x=p.check(s);
        System.out.println(x);

        }

    }

