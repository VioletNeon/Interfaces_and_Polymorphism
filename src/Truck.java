import java.util.Objects;

public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        return this.getWheelsCount() == truck.getWheelsCount() && Objects.equals(this.getModelName(), truck.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getModelName(), this.getWheelsCount());
    }
}