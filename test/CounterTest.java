package counter.test;

import java.util.Scanner;
import counter.base.Counter;

public class CounterTest {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Please set your intial count: "); 
        int count = reader.nextInt();

        System.out.print("Please set your max count: "); 
        int max =  reader.nextInt();

        Counter test = new Counter(count, max);
        
        test.increase();
        test.increase(test.getCount());
        System.out.println(test.getCount());

    }
    
}
