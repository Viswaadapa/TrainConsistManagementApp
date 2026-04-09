class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("======================================\n");

        assignCargo("Rectangular", "Petroleum");
        assignCargo("Cylindrical", "Petroleum");
        assignCargo("Rectangular", "Food");
    }

    public static void assignCargo(String shape, String cargo) {

        try {

            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment");
            }

            System.out.println("Cargo " + cargo + " safely assigned to " + shape + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + shape + " bogie");
        } finally {
            System.out.println("Operation completed for " + shape + " bogie\n");
        }
    }
}