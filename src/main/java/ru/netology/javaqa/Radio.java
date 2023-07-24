package ru.netology.javaqa;

public class Radio {
    public int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        int next = currentRadioStationNumber + 1;
        setCurrentRadioStationNumber(next);
    }

    public void prevRadioStationNumber() {
        int prev = currentRadioStationNumber - 1;
        setCurrentRadioStationNumber(prev);
    }


    public int currentVolume;


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
        if (currentVolume >= 100) {
            return;

        }
    }

    public void minimumVolumeValue() {
        int minus = currentVolume - 1;
        setCurrentVolume(minus);
        if (currentVolume <= 0) {
            return;
        }
    }

}
