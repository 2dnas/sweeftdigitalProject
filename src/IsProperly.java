import java.util.ArrayDeque;
import java.util.Deque;

public class IsProperly {

    Boolean isProperly(String sequence){
        Deque<Character> deque = new ArrayDeque<Character>();

        //ყოველ შემხვედრ '(' ზე stack ში ამატებს ერთ (
        //თუ შეხვდა ')' შედის else ში და ამოწმებს თუ არის ცარიელი თუ არარის ცარიელი შლის ერთ ფრჩხილის
        //თუ stack ცარიელია ანუ უფრო მეტი ) შეხვდა ვიდრე ( და აბრუნებს false
        for (int i = 0; i < sequence.length(); i++){
            char parenthesis = sequence.charAt(i);
            if(parenthesis == '('){
                deque.push(parenthesis);

            }else {
                if (deque.isEmpty())
                    return false;
                deque.pop();
            }


        }
        return (deque.isEmpty());
    }
}

