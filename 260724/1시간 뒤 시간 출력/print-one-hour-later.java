import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split(":");
        
        int a = Integer.parseInt(strArr[0]); //형변환 String을 int로
        int b = Integer.parseInt(strArr[1]);
        
        System.out.println((a + 1) + ":" + b);
    }
}