public interface Transport {
    void updateTyre();

    default void checkEngine() {
        throw new RuntimeException("В данном транспортном средстве двигатель технически не предусмотрен");
    }

    default void checkTrailer() {
        throw new RuntimeException("Для данного транспортного средства прицеп технически не предусмотрен");
    }
}
