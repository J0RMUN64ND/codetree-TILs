import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 sc로 정의,스캐너를 동적으로 생성 콘솔(키보드)로 입력받음
        int a;
        a = sc.nextInt(); // 스캐너값을 인트로 받음
        System.out.println(a+2);
    }
}