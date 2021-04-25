import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NotContains {
    HashSet<Integer> set = new HashSet<>();
    int max = 0;
    int notContains(int[] array){

        //პირველ რიგში ერეი გადაგვყვავს set ში რათა ყველა მონაცემი იყოს უნიკალური
        for (int i : array) {
            max = Math.max(max, array[i]);
            set.add(i);
        }

        //შემდგომ ათვლას ვიწყებთ 1 იდან და როცა set ში არ იქნება i,ფუქნცია დააბრუნებს i ს, ანუ მინიმალურ მნიშვნელობას
        //რომელიც არის 0 ზე მეტი და არარის სეტში.
        //თუ სეტში ყველა აითემი არის და for მორჩა იტერაციებს დაბრუნდება სეტში მყოფ მაქსიმალურ რიცხვზე ერთით მეტი.
        for(int i  = 1; i < max; i++ ){
            if(!set.contains(i)){
                return i;
            }
        }
        return max + 1;
    }
}
