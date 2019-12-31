
package ch6;

public class Exercise6_20 {
    static int [] shuffle(int [] a){
        for(int i=0;i<a.length;i++){
            int temp;
            int j=(int)(Math.random()*a.length);
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

