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

    public void nextRadioStation() {
        int next = currentRadioStationNumber + 1;
        setCurrentRadioStationNumber(next);
    }
    public void prevRadioStationNumber() {
        int prev = currentRadioStationNumber - 1;
        setCurrentRadioStationNumber(prev);
    }

    public void setMaxRadioStationNumber() {
        currentRadioStationNumber = 9;

    }

    public int currentVolume;

    public void maxVolume() {
        currentVolume = 100;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume < 100) {
            currentVolume = currentVolume - 1;
        }
    }

    public void maximumVolumeValue() {
        if (currentVolume >= 100) {
            return;
        }
    }

    public void minimumVolumeValue() {
        if (currentVolume <= 0) {
            return;
        }
    }
}
