
package ch6;

public class Exercise6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard{
    int a=0;
    boolean b;
    SutdaCard(int a, boolean b){
        this.a=a;
        this.b=b;
    }
    SutdaCard(){
    }
    String info(){
        if(a==0){
            return "1K";
        } else{
            return ""+a;
        }
    }
}
