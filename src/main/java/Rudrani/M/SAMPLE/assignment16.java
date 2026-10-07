package Rudrani.M.SAMPLE;
public class assignment16 {
    public void checking(){
        String s = "A powerful flash flood tore through Arizona’s Grand Canyon, sending torrents of muddy water,boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) said at least 20 people may be missing or unaccounted for, prompting a public appeal for information.";
        int count=0;

        for (int i =0; i<s.length()-2; i++)
            if (s.charAt(i) == 'i')
                if (s.charAt(i+1) == 'n')
                    if (s.charAt(i+2) == 'g'){
                        count++;
                    }

        System.out.println(count);
    }

    public static void main(String[] args){
        assignment16 ing=new assignment16();
        ing.checking();
    }
}