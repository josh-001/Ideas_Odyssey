import java.util.*;

public class Streamss {
    public static void main(String[] args){
        List<Integer> sl=new ArrayList<>();
        sl.add(3000);
        sl.add(45000);
        sl.add(27000);
        sl.add(670000);
        sl.add(89000);

        long out=sl.stream().filter((Integer sal)->sal>3000).count();

        System.out.println(out);

    }
}
