package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNotIncreaseSoundVolumeMoreThanMax() {
        Radio radio = new Radio();
        radio.setSoundVolumeMax(10);
        radio.setSoundVolumeMin(0);
        radio.setSoundVolumeCurrent(10);
        radio.increaseSoundVolume();
        assertEquals(10, radio.getSoundVolumeCurrent());
    }

    @Test
    void shouldNotTurnDownSoundVolumeLassThanMin() {
        Radio radio = new Radio();
        radio.setSoundVolumeMax(10);
        radio.setSoundVolumeMin(0);
        radio.setSoundVolumeCurrent(0);
        radio.turnDownSoundVolume();
        assertEquals(0, radio.getSoundVolumeCurrent());
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolumeMax(10);
        radio.setSoundVolumeMin(0);
        radio.setSoundVolumeCurrent(9);
        radio.increaseSoundVolume();
        assertEquals(10, radio.getSoundVolumeCurrent());
    }

    @Test
    void shouldTurnDownSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolumeMax(10);
        radio.setSoundVolumeMin(0);
        radio.setSoundVolumeCurrent(1);
        radio.turnDownSoundVolume();
        assertEquals(0, radio.getSoundVolumeCurrent());
    }


    @Test
    void shouldSetNumberCurrentRadioEqualMax() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(9);
        assertEquals(9, radio.getNumberCurrentRadio());
    }

    @Test
    void shouldSetNumberCurrentRadioEqualMin() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(0);
        assertEquals(0, radio.getNumberCurrentRadio());
    }

    @Test
    void shouldSetNumberCurrentRadioAboveMax() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(10);
        assertEquals(0, radio.getNumberCurrentRadio());
    }

    @Test
    void shouldSetNumberCurrentRadioBelowMin() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(-1);
        assertEquals(0, radio.getNumberCurrentRadio());
    }


    @Test
    void shouldSwitchNextRadio() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(8);
        radio.nextRadio();
        assertEquals(9, radio.getNumberCurrentRadio());

    }

    @Test
    void shouldNotSwitchAboveMaxRadio() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(9);
        radio.nextRadio();
        assertEquals(0, radio.getNumberCurrentRadio());

    }

    @Test
    void shouldNotSwitchBelowMinRadio() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(0);
        radio.previousRadio();
        assertEquals(9, radio.getNumberCurrentRadio());

    }

    @Test
    void shouldSwitchBelowRadio() {
        Radio radio = new Radio();
        radio.setNumberMaxRadio(9);
        radio.setNumberMinRadio(0);
        radio.setNumberCurrentRadio(1);
        radio.previousRadio();
        assertEquals(0, radio.getNumberCurrentRadio());

    }
}