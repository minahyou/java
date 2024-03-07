package variable;

public class Variable4 {
    public static void main(String[] args) {
        String str = "sfsf@naver.com";

        //id와 domain을 출력하시오
        //id = str.substring(0,4);
        //domain = str.substring(5,10);
        String id = str.substring(0, str.indexOf('@'));
        String domain = str.substring(str.indexOf('@')+1, str.indexOf('.')).toUpperCase();

        System.out.printf("%s, %s", id, domain);
    }
}
