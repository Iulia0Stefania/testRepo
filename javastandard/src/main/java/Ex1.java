import java.util.List;

import static java.lang.Math.abs;

public class Ex1 {

    public static int GetNearest10(int a, int b){
        return ((abs(a) - abs(b)) > 0 ) ? b : a;
    }

    public static void main(String[] args) {
        System.out.println(GetNearest10(-50,-30));
    }
}
