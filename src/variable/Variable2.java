package variable;

public class Variable2 {
    public  static void main(String[] args) {
        // 정수 int
        int a = 10;
        byte a1 = 100; // ~127
        byte a2 = 100;
        byte a3 = (byte) (a1 + a2); // 연산 진행시 int가 default
        System.out.println(a3);
        //int a4 = 2150000000;
        long a5 = 2150000000L; // 오른쪽은 무조건 기본이 int임, 마지막에 L을 붙이면 long영역으로 들어감
        //long a6 = 1000000000 + 1000000L; // 큰 숫자의 범위대로 64bit가 말들어짐
        long a6 = 1150000000 + 1150000000L; // int영역으로 억지로 넣어서 앞에 숫자가 잘려 -값이 나옴
        System.out.println(a6);

        char ch = '가'; // character
        System.out.println((int)ch); //97

        char ch2  = '\u0042'; //unicode
        System.out.println(ch2);

        char ch3  = 0xac00; //unicode 16진수로도 표현가능
        System.out.println(ch3);

        // 실수 double
        double d = 10.0;
        float f = 10.0F;

        float f2  = (float) (10.1 + 10);

        // Boolean
        boolean b = true;
    }
}
