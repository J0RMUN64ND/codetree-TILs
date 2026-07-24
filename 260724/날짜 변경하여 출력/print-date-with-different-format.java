import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("\\."); //.은 "아무 문자 하나"를 의미하는 특수 문자이기에 특수처리가 필요하다
        System.out.println(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
    }
}
