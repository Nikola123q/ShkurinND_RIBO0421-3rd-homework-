import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Шкурин Н.Д. РИБО-04-21 1 ВАРИАНТ----------");
        // connecting scanner
        Scanner scanner = new Scanner(System.in);

        // creating car
        Car car = new Car();
        System.out.print("Car weight: ");
        int weight = scanner.nextInt(); // car weight
        car.setWeight(weight);

        System.out.print("Car max speed: ");
        float maxSpeed = scanner.nextFloat(); // car max speed
        car.setMaxSpeed(maxSpeed);

        System.out.print("Car model: ");
        scanner.nextLine();
        String model = scanner.nextLine(); // car model
        car.setModel(model);

        System.out.print("Car age: ");
        int age = scanner.nextInt(); // age of car
        car.setAge(age);
        System.out.println(car.toString()); // first output

        // crating car service
        CarService cs = new CarService("ул. Ленина, д.5");

        cs.setMechanicsCount(10);
        cs.modify(car);
        System.out.println(car.toString()); // second output

    }
}
