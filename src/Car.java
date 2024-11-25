import java.util.Objects;

public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return getWheelsCount() == car.getWheelsCount() && Objects.equals(getModelName(), car.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getWheelsCount());
    }
}