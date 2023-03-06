package Receiver;

public class Stereo {
    public void on(){
        System.out.println("Receiver.Stereo has been turned on");
    }

    public void off(){
        System.out.println("Receiver.Stereo has been turned off");
    }

    public void setCD(){
        System.out.println("Receiver.Stereo is set for CD input");
    }

    public void setDVD(){
        System.out.println("Receiver.Stereo is set for DVD input");
    }

    public void setVolume(int volume){
        System.out.println("Volume set at"+ volume);
    }
}
