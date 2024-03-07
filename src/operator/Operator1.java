package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        //int c = a/b; long타입과 long타입 연산이기 때문에 불가
        long c = a/b;

        int i1 = 10;
        int i2 = 10;
        double i3 = i1*1.0 / i2;
        System.out.println(i3);

        int result = i1++ + ++i2;
        System.out.printf("%d %d %d", result, i1, i2);

        int aa = 0;
        if(3 > 5) {
            aa = 6;
        } else{
            aa = 9;
        }


        int bb = (3>5)? 6:9;
        System.out.println(bb);

        int num1 = 5;
        int num2 = 2;
        int num3 = 3;

        // 3수의 최대 값을 구하시오
        int num4 = 0;
        int num6 = (num1>num2)? ((num1>num3)?num1:num3): ((num2>num3)?num2:num3);

        if(num1>num2){
            if(num1>num3){
                num4 = num1;
            } else {
                num4 = num3;
            }
        }
        else {
            if(num2>num3){
                num4 = num2;
            }
            else{
                num4 = num3;
            }
        }
        System.out.println(num4);
        System.out.println(num6);
    }
}


/*
1. 스크립트 언어와 컴파일 언어 차이
2. OOAD, OOP
3. JVM 구조
 */