
import java.util.Deque;
import java.util.ArrayDeque;
public class Deque_e {
    public static void main(String[] args){
        Deque<String>  deque=new ArrayDeque<>();
        deque.addLast("element1");
        deque.addFirst("elemnt2");
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst()); //null
        System.out.println(deque.removeFirst());  //exception
        System.out.println(deque);
    }
}
