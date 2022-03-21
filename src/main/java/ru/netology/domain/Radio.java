package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int numberOfStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > numberOfStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void setCurrentStationRemoteControl(int newCurrentStation) {
        if (newCurrentStation > numberOfStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }

            currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        {
            if (currentStation >= numberOfStation) {
                currentStation = 0;
            }
        }
    }

    public void previouslyCurrentStation() {
        currentStation = currentStation - 1;
        {
            if (currentStation < 0) {
                currentStation = 9;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            return;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
