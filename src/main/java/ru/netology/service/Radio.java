package ru.netology.service;

public class Radio {
    // завести поля номер текущей радиостанции numberCurrentRadio
    // громкость звука soundVolumeCurrent
    // soundVolumeMin = 0
    // soundVolumeMax = 100
    // nextRadio PreviousRadio
    // если текущая радиостанция 9 и клиент нажал кнопку Next то текущей должна стать 0 я, если 0 то предыдущая 9
    //Должен иметь возможность выставлять номер радиостанции через прямое указание номера
    // numberMinRadio = 0
    // numberMaxRadio = 10
    // если достиг максимума (минимума), то дальнейшее нажатие ни к чему не приводит
//Задача 2:
    //можно задавать количество радиостанций при создании объекта (по умолчанию - 10)
    //номер текущей радиостанции изменяется от 0 до 10
    //остальное по каналам также
    private int soundVolumeCurrent;
    private int soundVolumeMin;
    private int soundVolumeMax;
    private int numberCurrentRadio;
    private int numberMinRadio;
    private int amountOffRadio = 10;

    public Radio() {
    }

    public Radio(int amountOffRadio) {
        this.amountOffRadio = amountOffRadio;
    }

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

    public void setNumberCurrentRadio(int numberCurrentRadio) {
        // создать тест
        if (numberCurrentRadio > amountOffRadio - 1) {
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

    public int nextRadio() {
        numberCurrentRadio = numberCurrentRadio + 1;
        if (numberCurrentRadio > amountOffRadio - 1) {
            numberCurrentRadio = numberMinRadio;
        }
        return numberCurrentRadio;
    }

    public int previousRadio() {
        numberCurrentRadio = numberCurrentRadio - 1;
        if (numberCurrentRadio < numberMinRadio) {
            numberCurrentRadio = amountOffRadio - 1;
        }
        return numberCurrentRadio;
    }
}
