import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class List  {
        String s =
                "ioxxoj[asdfgh]zxcvbn\n" +
                "aaaa[qwer]tyui\n" +
                "abcd[bddb]xyyx\n" +
                "abba[mnop]qrst supports";

        String [] test = s.split("\n");

        public String[] getList()  {

                ArrayList<String> list = new ArrayList<>();

                try(BufferedReader reader = new BufferedReader(new 
								
					FileReader("myExample.txt"))){

					while(reader.ready())
                        list.add(reader.readLine());

                } catch (IOException e) {
                        e.printStackTrace();
                }

                return list.toArray(new String[list.size()]);
        }

}