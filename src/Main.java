import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(mult1(x, y));
        System.out.println(mult2(x, y));
    }
    public static int mult1(int x, int y){
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        int res = 0;
        for (int i = 0; i < absY; i++)
            res = absX+res;
        if (((x > 0)&&(y > 0)) | ((y < 0) && (x < 0))){
            return res;
        }
        else {
            return -res;
        }

    }

    public static int mult2(int x, int y){
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        int res = 0;
        List<Integer> listOfX = new ArrayList<>();
        for (int i = 0; i < absY; i++)
            listOfX.add(absX);
        for (Integer i : listOfX)
            res += i;
        if (((x > 0)&&(y > 0)) | ((y < 0) && (x < 0))){
            return res;
        }
        else {
            return -res;
        }

    }

}