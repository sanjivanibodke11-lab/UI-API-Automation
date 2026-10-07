package supriya_kottam;

public class Assignment16 {
    String s ="A powerful flash flood tore through Arizona’s Grand Canyon, sending torrents of muddy water, boulders and debris through Bright Angel Canyon and into the Colorado River. The National Park Service (NPS) said at least 20 people may be missing or unaccounted for, prompting a public appeal for information.";
    String[] s1 = s.split(" ");
    int count;
    public void times(){
        for(int i =0;i<s1.length;i++){

            if(s1[i].contains("ing")){
                count++;
                System.out.println(s1[i]);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Assignment16 a= new Assignment16();
        a.times();
    }
}
