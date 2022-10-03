import com.sun.org.apache.xerces.internal.impl.dv.util.ByteListImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> movie=new ArrayList<>();
        List<Character> fake=new ArrayList<>();
        List<Character> UserEntered=new ArrayList<>();


        movie.add("the shawshank redemption");

        movie.add("the godfather");
        movie.add("the dark knight");
        movie.add("schindler's list");
        movie.add("pulp fiction");
        movie.add("the lord of the rings");
        movie.add("the good the bad and the ugly");
        movie.add("fight club");
        movie.add("forrest gump");
        movie.add("star wars");
        movie.add("inception");
        movie.add("the matrix");
        movie.add("samurai");
        movie.add("star wars");
        movie.add("city of god");
        movie.add("the silence of the lambs");
        movie.add("batman begins");
        movie.add("chinatown");
        movie.add("room");
        movie.add("die hard");
        movie.add("dunkirk");
        movie.add("fargo");
        movie.add("no country for old men");

        int RANDOM=Random.random();
        //System.out.println(movie.get(RANDOM));
        int count=0;
        String  s=movie.get(RANDOM);
        for(int i=0;i<s.length();i++)
        {
            fake.add('_');
        }


        char arr[]=s.toCharArray();
        int z=0;
        for(char i:arr)
        {
            z++;
            if(i==' ') {
                fake.remove(z - 1);
                fake.add(z-1,' ');
            }

        }
        int COUNT;
        char b;
        while (count<10)
        {

            System.err.println("you Entered the character List is : "+UserEntered);
            System.out.println("Enter the Character ");
            b=sc.next().charAt(0);
            UserEntered.add(b);
            COUNT=0;
            int k=0;
            for(char i:arr)
            {
                k++;
                if(i==b) {
                    fake.remove(k-1);
                    fake.add(k-1,b);
                    COUNT++;
                }

            }
            for(char j:fake)
                System.out.print(j);
            System.out.println("");
            if(COUNT==0)
                System.out.println("Sorry you entered Character is not in the movie name");
                count++;
            if(count==10) {
                System.out.println("Sorry you lost");
                break;
            }
            if(!(fake.contains('_'))) {
                System.out.println("Congratulations You won the match");
                break;
            }

        }
    }
}
class Random
{
    public static int random()
    {
        double a= Math.random();
        a=a*100;
        a=(int) a;
        if(a<17) {
            return (int) a;
        }
        else {
            a=random();
            return (int) a;
        }
    }
}