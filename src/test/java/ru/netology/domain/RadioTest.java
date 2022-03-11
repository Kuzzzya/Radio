package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation3() {
        Radio rad = new Radio();
        rad.setCurrentStation(-5);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.nextStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testPreviouslyStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.previouslyCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testPreviouslyStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.previouslyCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume4() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testPreviouslyVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testPreviouslyVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testPreviouslyVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.reduceVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
