package yasmin;

public class count {

        public  static  void main(String[] args)
        {
            int i,count=0;
            for(i=0;i<=100;i++)
            {
                if(i%2!=0)
                {
                    System.out.println(i);
                    count++;
                }
                System.out.println("count:"+count);
            }
        }
    }


