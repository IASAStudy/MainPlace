
package ch7;

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    int pre_channel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int i){
        pre_channel=channel;
        channel=i;
    }
    void setVolume(int i){
        volume=i;
    }
    void setPowerOn(boolean i){
        isPowerOn=i;
    }
    int getChannel(){
        return channel;
    }
    int getVolume(){
        return volume;
    }

    void gotoPrevChannel(){
        int temp=channel;
        channel=pre_channel;
        pre_channel=temp;
    }
}

