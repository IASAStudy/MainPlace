
package ch6;

public class Exercise6_23 {
    static int max(int[] arr){
        if(arr==null || arr.length==0){
            return -999999;
        }
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }
}

