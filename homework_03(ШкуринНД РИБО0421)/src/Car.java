public class Car {

    // Create fields
    private int weight; // car weight
    private float maxSpeed; // car max speed
    private String model;// car model
    private int age;// car age

    // Constructors
    public Car(int weight, float maxSpeed, String model, int age){

        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.age = age;
    }

    public Car() {

    }

    // 1st method
    public void beepSignal(){
        System.out.println("B-e-e-e-p");
    }

    // 2nd method
    public boolean inMove(){
        return true;
    }

    // 3rd method (answer)
    public String toString(){
        return "\nCar object{ " + "Weight: " + this.weight + ", Max speed: " + this.maxSpeed + ", Model : " +
                this.model + ", Age: " + age + " }";
    }

    // setters
    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setMaxSpeed(float maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setModel(String model){
        this.model = model;
    }


    // getters
    public int getWeight(){
        return weight;
    }

    public float getMaxSpeed(){
        return maxSpeed;
    }

    public int getAge(){
        return age;
    }

    public String getModel(){
        return model;
    }

}
