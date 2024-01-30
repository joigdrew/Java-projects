public class Car {
    private String model;
    private int wheels;
    private int doors;
    private boolean isManual;
    private String engine;

    public Car() {
        model = "unknown";
        wheels = 4;
        doors = 4;
        isManual = false;
        engine = "v6";
    }

    public Car(String model, int wheels, int doors, boolean isManual, String engine) {
        this.model = model;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printDetails() {
        System.out.printf(" %s%s%n %s%d%n %s%d%n %s%b%n %s%s%n",
                "Model: ", this.model, "Wheels: ", this.wheels,
                "Doors: ", this.doors, "Manual Drive: ", this.isManual,
                "Engine: ", this.engine);
    }
}
