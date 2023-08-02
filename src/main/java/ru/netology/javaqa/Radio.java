package ru.netology.javaqa;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStationNumber = minRadioStation;

    public Radio(int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
    }


    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            newCurrentRadioStationNumber = maxRadioStation;

        }
        if (newCurrentRadioStationNumber > maxRadioStation) {
            newCurrentRadioStationNumber = 0;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStationNumber() {
        int next = currentRadioStationNumber + 1;
        setCurrentRadioStationNumber(next);

    }

    public void prevRadioStationNumber() {
        int prev = currentRadioStationNumber - 1;
        setCurrentRadioStationNumber(prev);
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume >= 100) {
            currentVolume = currentVolume - 1;
        }
    }

    public void maximumVolumeValue() {
        int plus = currentVolume + 1;
        setCurrentVolume(plus);

    }

    public void minimumVolumeValue() {
        int minus = currentVolume - 1;
        setCurrentVolume(minus);
        if (currentVolume <= 0) {
            return;
        }
    }

}
