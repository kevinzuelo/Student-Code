package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        if(isOn) {
            isOn = false;
        }
    }

    public void turnOn() {
        if(!isOn) {
            isOn = true;
        }
    }

    public void changeChannel(int newChannel) {
        if(isOn && newChannel >= 3 && newChannel <= 18) {
            this.currentChannel = newChannel;
        }
    }

    public void channelUp() {
        if(isOn && currentChannel < 18) {
            this.currentChannel++;
        }
        else if(isOn) {
            this.currentChannel = 3;
        }
    }

    public void channelDown() {
        if(isOn && currentChannel > 3) {
            this.currentChannel--;
        }
        else if(isOn) {
            this.currentChannel = 18;
        }
    }

    public void raiseVolume() {
        if(isOn && currentVolume < 10) {
            this.currentVolume++;
        }
    }

    public void lowerVolume() {
        if(isOn && currentVolume > 0) {
            this.currentVolume--;
        }
    }


}
