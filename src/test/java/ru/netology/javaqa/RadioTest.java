package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldCurrentRadioStationNumber() {
        Radio radio = new Radio(9, 9);

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentRadioStationNumberMin() {
        Radio radio = new Radio(-1, 9);

        radio.setCurrentRadioStationNumber(-1);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetCurrentRadioStationNumberAboveMax() {
        Radio radio = new Radio(10, 0);

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio(8, 9);
        radio.setCurrentRadioStationNumber(8);

        radio.nextRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        Radio radio = new Radio(9, 0);
        radio.setCurrentRadioStationNumber(9);

        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio(8, 7);
        radio.setCurrentRadioStationNumber(8);

        radio.prevRadioStationNumber();

        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMaxVolume() {
        Radio radio = new Radio(105, 100);
        radio.setCurrentVolume(105);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentMinVolume() {
        Radio radio = new Radio(100, 100);
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(10, 11);
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio(101, 100);
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {
        Radio radio = new Radio(0, 0);
        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeMax() {
        Radio radio = new Radio(100, 99);
        radio.setCurrentVolume(100);

        radio.volumeDown();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaximumVolumeVaule() {
        Radio radio = new Radio(-1, 0);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeValue() {
        Radio radio = new Radio(95, 96);
        radio.setCurrentVolume(95);

        radio.maximumVolumeValue();

        int expected = 96;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlusVolumeAboveValue() {
        Radio radio = new Radio(150, 100);
        radio.setCurrentVolume(150);

        radio.maximumVolumeValue();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusVolumeAboveValue() {
        Radio radio = new Radio(50, 49);
        radio.setCurrentVolume(50);

        radio.minimumVolumeValue();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusVolumeValue() {
        Radio radio = new Radio(-10, 0);
        radio.setCurrentVolume(-10);

        radio.minimumVolumeValue();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxRadioStation() {
        Radio radio = new Radio(10, 9);
        radio.setCurrentRadioStationNumber(9);

        radio.getMaxRadioStation();

        int expected = 9;
        int actual = radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinRadioStation() {
        Radio radio = new Radio(-5, 0);
        radio.setCurrentRadioStationNumber(0);

        radio.getMinRadioStation();

        int expected = 0;
        int actual = radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);

    }


}
