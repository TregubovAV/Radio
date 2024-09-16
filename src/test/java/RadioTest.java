import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testStationNextMin() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStationNext1() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNext8 () {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void testStationNextMax () {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStationPrevMax () {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStationPrevMin () {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
   @Test
      public void testIncreaseVolume99() {
       Radio radio = new Radio();
       radio.setVolume(99);
       radio.increase();
       int expected = 100;
       int actual = radio.getVolume();
       Assertions.assertEquals(expected, actual);
   }
    @Test
    public void testIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increase();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increase();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.increase();
        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.decrease();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decrease();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decrease();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume99() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.decrease();
        int expected = 98;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}