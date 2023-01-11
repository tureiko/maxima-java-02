package org.example;

public class Logistics {
    private Transport[] vehicles;

    public Logistics(Transport... vehicles) {
        this.vehicles = vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Transport[] vehicles) {
        this.vehicles = vehicles;
    }


    private Transport getVehicle;


    public Transport getShipping(City city, int weight, int time) {
        float minDeliveryPrice = vehicles[0].getPrice(city);
        float deliveryPrice;
        int deliveryTime;
        for (Transport transport1 : vehicles) {
            if (isShippingAvailable(transport1)) {
                deliveryPrice = transport1.getPrice(city);
                deliveryTime = city.getDistance() / transport1.getSpeed();
                if (minDeliveryPrice >= deliveryPrice && deliveryPrice != 0) {                        // проверка по мин. стоиомости
                    if (deliveryTime <= time && transport1.getCapacity() > weight) {                // проверка по параметрам
                        getVehicle = transport1;
                        minDeliveryPrice = deliveryPrice;
                    }
                } else if (deliveryTime <= time && transport1.getCapacity() > weight) {
                    if (getVehicle == null && transport1.getPrice(city) != 0) {
                        getVehicle = transport1;
                    } else if (getVehicle != null) {
                        if (getVehicle.getPrice(city) > deliveryPrice && deliveryPrice != 0) {
                            getVehicle = transport1;
                        }
                    }
                }
            }
        }
        if (getVehicle != null) {
            System.out.println("Транспорт для перевозки - " + getVehicle.getName());
            return getVehicle;
        }

        System.out.println("Нет доступного транспорта");
        return null;

    }

    private boolean isShippingAvailable(Transport vehicle) {
        if (vehicle.isRepairing()) {
            vehicle.startRepair();                   // если на ремонте
            return false;
        }
        vehicle.finishRepair();                      // транспорт доступен
        return true;
    }
}
