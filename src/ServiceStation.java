public class ServiceStation {
    public void checkCommonParams(Vehicle transport) {
        if (transport == null) {
            throw new IllegalArgumentException("Машина отсутствует");
        }

        System.out.println("\n" + "Обслуживаем " + transport.getModelName() + ":");

        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    public void check(Car car) {
        checkCommonParams(car);

        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        checkCommonParams(bicycle);
    }

    public void check(Truck truck) {
        checkCommonParams(truck);

        truck.checkEngine();
        truck.checkTrailer();
    }
}
