package ru.netology.service;

public class Radio {
    // завести поля номер текущей радиостанции numberCurrentRadio
    // громкость звука soundVolumeCurrent
    // soundVolumeMin = 0
    // soundVolumeMax = 9
    // nextRadio PreviousRadio
    // если текущая радиостанция 9 и клиент нажал кнопку Next то текущей должна стать 0 я, если 0 то предыдущая 9
    //Должен иметь возможность выставлять номер радиостанции через прямое указание номера
    // numberMinRadio = 0
    // numberMaxRadio = 10
    // если достиг максимума (минимума), то дальнейшее нажатие ни к чему не приводит

    private int soundVolumeCurrent;
    private int soundVolumeMin;
    private int soundVolumeMax;
    private int numberCurrentRadio;
    private int numberMinRadio;
    private int numberMaxRadio;


    public int getSoundVolumeCurrent() {
        return soundVolumeCurrent;
    }

    public void setSoundVolumeCurrent(int soundVolumeCurrent) {
        this.soundVolumeCurrent = soundVolumeCurrent;
    }


    public void setSoundVolumeMin(int soundVolumeMin) {
        this.soundVolumeMin = soundVolumeMin;
    }

    public void increaseSoundVolume() {
        if (soundVolumeCurrent < soundVolumeMax) {
            soundVolumeCurrent = soundVolumeCurrent + 1;
        }
    }

    public void turnDownSoundVolume() {
        if (soundVolumeCurrent > soundVolumeMin) {
            soundVolumeCurrent = soundVolumeCurrent - 1;
        }
    }


    public void setSoundVolumeMax(int soundVolumeMax) {
        this.soundVolumeMax = soundVolumeMax;
    }

    public int getNumberCurrentRadio() {
        return numberCurrentRadio;
    }

    public void setNumberCurrentRadio(int numberCurrentRadio) { // создать тест
        if (numberCurrentRadio > numberMaxRadio) {
            return;
        }
        if (numberCurrentRadio < numberMinRadio) {
            return;
        }
        this.numberCurrentRadio = numberCurrentRadio;
    }

    public void setNumberMinRadio(int numberMinRadio) {
        this.numberMinRadio = numberMinRadio;
    }

    public void setNumberMaxRadio(int numberMaxRadio) {
        this.numberMaxRadio = numberMaxRadio;
    }

    public int nextRadio() {
        if (numberCurrentRadio == numberMaxRadio){
            return numberCurrentRadio = numberMinRadio;
        }

        if (numberCurrentRadio < numberMaxRadio) {
            numberCurrentRadio = numberCurrentRadio + 1;

        }
        if (numberCurrentRadio > numberMaxRadio) {
            numberCurrentRadio = numberMinRadio;
        }
        return numberCurrentRadio;
    }

    public int previousRadio() {
        if (numberCurrentRadio == numberMinRadio){
            return numberCurrentRadio = numberMaxRadio;
        }
        if (numberCurrentRadio > numberMinRadio) {
            numberCurrentRadio = numberCurrentRadio - 1;
        }

        if (numberCurrentRadio < numberMinRadio) {
            numberCurrentRadio = numberMaxRadio;
        }



        return numberCurrentRadio;
    }
}
