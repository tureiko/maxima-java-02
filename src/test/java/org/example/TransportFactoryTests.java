package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportFactoryTests {
    private TransportFactory transportFactory;
    private City Spb;
    private City cityHasAirport;
    private City cityIsOnWater;

    private Truck trailerTruck;

    @Before
    public void createFactory() {
        transportFactory = new TransportFactory();
        trailerTruck = new Truck("Грузовик с полуприцепом", 24000, 120, 150.41);
        Spb = new City("Санкт-Петербург", 120, true, true);
        cityIsOnWater = new City("Город1", 250, false, true);
        cityHasAirport = new City("Город2", 850, true, false);
    }


    @Test
    public void givenTransportWhenTheCityIsOnTheWater() {
        Transport vehicle = transportFactory.getTransport(cityIsOnWater, 2000, 8);
        assertEquals(vehicle.getClass(), Ship.class);
        //assertEquals("Корабль", vehicle.getName());
    }

    @Test
    public void givenTransportWhenTheCityHasAirport() {
        Transport vehicle = transportFactory.getTransport(cityHasAirport, 2000, 5);
        assertEquals("Самолёт", vehicle.getName());
    }

    @Test
    public void getTransport() {
        Transport transport = transportFactory.getTransport(Spb, 190700, 4);
        assertEquals("Корабль", transport.getName());
    }

    @Test
    public void roundSpeed() {
        int result = transportFactory.roundSpeed(61);
        assertEquals(70, result);
    }

    @Test
    public void roundSpeedWhenNotRequired() {
        int result = transportFactory.roundSpeed(70);
        assertEquals(70, result);
    }

    @Test
    public void roundWeight() {
        int result = transportFactory.roundWeight(1501);
        assertEquals(2000, result);
    }

    @Test
    public void roundWeightWhenNotRequired() {
        int result = transportFactory.roundWeight(1500);
        assertEquals(1500, result);
    }

    @Test
    public void shouldNameBeTrailerTruck() {
        assertEquals("Грузовик с полуприцепом", trailerTruck.getName());
    }

    @Test
    public void shouldCapacity24000() {
        assertEquals(24000, trailerTruck.getCapacity());
    }

    @Test
    public void shouldSpeed120() {
        assertEquals(120, trailerTruck.getSpeed());
    }

}
