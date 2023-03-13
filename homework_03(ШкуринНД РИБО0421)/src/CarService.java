public class CarService {
    private String location; // the location of car service
    private int mechanicsCount; // count of mechanics in service

    // creating CarService class
    public CarService(String location){
        this.location = location;
    }

    //this method modifies car model
    public void modify(Car car){
        if(car != null && this.mechanicsCount > 0){
            String model = car.getModel();
            model = model.replace("a", "o");
            model = model.replace("i", "e");
            model = model.toLowerCase();
            car.setModel(model);
        }
    }

    // setter
    public void setMechanicsCount(int mechanicsCount) {
        if(mechanicsCount <= 0)
            this.mechanicsCount = 1;
        else
            this.mechanicsCount = mechanicsCount;
    }

    // getter
    public int getMechanicsCount() {
        return mechanicsCount;
    }
}
