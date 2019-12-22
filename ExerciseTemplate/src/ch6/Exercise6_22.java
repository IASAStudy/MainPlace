package ch6;

public class Exercise6_22 {

    static boolean isNumber(String str) {
        int i=0;
        boolean isnumber = false;
        if(str==null) return isnumber; // null error 처리

        while(i < str.length()) {
            if((int)str.charAt(i)>=47 && (int)str.charAt(i)<=56) {
                isnumber=true;
            } else {
                isnumber=false;
                break;
            }
            i++;
        } // 각 자리 확인
        return isnumber;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
