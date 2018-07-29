import java.lang.StringBuilder;

 

public class Numbers {

    public static void main(String[] args) {



        StringBuilder builder = new StringBuilder();
  

        for (int i = 0; i < 5; i++) {

            builder.append(" " + i);

        }

        String result = builder.toString();    // convert to string

 

     

        System.out.println(result);

    }

}
