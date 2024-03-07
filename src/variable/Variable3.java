package variable;


public class Variable3 {
    public static void main(String[] args) {
        int a = 10;
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");

        if(str2 == str4) { //문자가 아니라 주소 비교
            System.out.println("OK");
        }
        if(str1.equals(str3)){ // 문자 비교
            System.out.println("OK2");
        }
        //str3 = "ab"; //주소에 정해진 값은 변경 불가능..
        str1 = "ab"; // "abc" 는 Grabage
        int result = Integer.parseInt(str3) * 2; // string -> int
        System.out.println(result);

        int num = 100;
        String result2 = String.valueOf(num); // String result2 = num + ""; 도 가능

    }
}


/*
Memory
CODE STACK(주소) HEAP(String pool)
str1: 'abc'가 시작되는 주소가 담겨져있음 => str3은 기존에 String pool에 "abc"가 있기 때문에 같은 주소를 참조
new String ~ 일 경우 heap영역에 새로 만들어짐
 */