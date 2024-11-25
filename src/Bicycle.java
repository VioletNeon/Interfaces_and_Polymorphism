import java.util.Objects;

public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicycle bicycle = (Bicycle) o;

        return this.getWheelsCount() == bicycle.getWheelsCount() && Objects.equals(this.getModelName(), bicycle.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getModelName(), this.getWheelsCount());
    }
}