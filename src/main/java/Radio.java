public class Radio {

    private int station;
    private int volume;
    private int maxstation;

    public Radio() {

        this.maxstation = 9;
    }

    public Radio(int countStation) {
        this.maxstation = countStation - 1;

    }

    public void next() {
        if (station != maxstation) {
            station++;
            return;
        }
        station = 0;


    }

    public void prev() {
        if (station != 0) {
            station = station - 1;
        } else {
            station = maxstation;
        }
    }

    public void increase() {
        if (volume != 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void decrease() {
        if (volume != 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }


    public int getStation() {

        return station;
    }

    public void setStation(int station) {

        if (station > maxstation) {
            return;
        }
        if (station < 0) {
            return;
        }
        //   if (station < 9) {
        //     station = station + 1;
        // }

        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }

        this.volume = volume;
    }
}
