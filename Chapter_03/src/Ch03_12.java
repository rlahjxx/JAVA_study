public class Ch03_12 {
    public static void main(String args[]) {
        int x = 10;
        int y = 8;

        System.out.printf("%d 을 %d 로 나누면, %n", x, y);
        System.out.printf("몫은 %d 이고, 나머지는 %d 입니다.%n", x / y, x % y);

        System.out.println(-10 % 8);
        System.out.println(10 % -8);
        System.out.println(-10 % -8);
    }
}
