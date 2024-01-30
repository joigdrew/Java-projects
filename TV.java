public class TV {
    int channel = 1; // The default channel
    int volumeLevel = 1; // The default level
    boolean on = false; // TV power off
    int inputMode = 0; //Default mode set to this


    public TV() { }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120);
        channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 7);
        volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }
    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1){
            volumeLevel--;
        }
    }

    public void muteTV(){
        volumeLevel = 0;
    }

    public void setInputMode( int newInputMode) {
        if (on && inputMode >=0 && newInputMode <= 2) {
            inputMode = newInputMode;
        }
    }
}
