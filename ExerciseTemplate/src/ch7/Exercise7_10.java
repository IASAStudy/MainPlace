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
    private int prevchannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // Here 7-10 getter&setter
    int getChannel() {
        return channel;
    }
    int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        prevchannel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Here 7-11 gotoPrevChannel
    void gotoPrevChannel() {
        setChannel(prevchannel);
    }
}
