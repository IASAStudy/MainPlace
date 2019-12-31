package ch7;

public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i=0;

    void buy(Product P) {
        if(money<P.price){
            return;
        }
        money-=P.price;
        add(P);
    }

    void add(Product P) {
        if(i>=cart.length){
            Product[] cart1=new Product[cart.length*2-1];
            for(int j=0;j<cart.length;j++){
                cart1[j]=cart[j];
            }
            cart=cart1;
        }
        Loop1: for(int j=0;j<cart.length;j++){
            if(cart[j]==null){
                cart[j]=P;
                i++;
                break Loop1;
            }
        }
    }

    void summary() {
        System.out.printf("구입한 물건:");
        for(int j=0;j<cart.length;j++) {
            if (cart[j] != null) {
                System.out.print(cart[j] + ", ");
            }
        }
        System.out.println("\n사용한 금액: "+(1000-money));
        System.out.println("남은 금액: "+money);
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {super(100); }

    public String toString() {return "Tv"; }
}
class Computer extends Product {
    Computer() {super(200); }

    public String toString() {return "Computer"; }
}
class Audio extends Product {
    Audio() {super(50); }

    public String toString() {return "Audio"; }
}
