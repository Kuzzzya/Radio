package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

//    public void setCurrentStation(int currentStation) {
//        this.currentStation = currentStation;
//    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation = currentStation + 1;
        if (currentStation > 9) {
        currentStation = 0;
        }
    }

    public void previouslyCurrentStation() {
        currentStation = currentStation - 1;
        if (currentStation < 0) {
        currentStation = 9;
        }
   }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            return;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
//    public int getId() { return id; }
//    public void setId(int id) { this.id = id; }
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//    public int getMaxTemperature() { return maxTemperature; }
//    public void setMaxTemperature(int maxTemperature) { this.maxTemperature = maxTemperature; }
//    public int getMinTemperature() { return minTemperature; }
//    public void setMinTemperature(int minTemperature) { this.minTemperature = minTemperature; }
