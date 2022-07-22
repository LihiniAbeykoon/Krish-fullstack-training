import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<VehicleType,Vehicle> vehicles = new HashMap<>();
    
    public Registry(){
        this.initializer();
        
    }

    public Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle=null;

        try {
             vehicle = (Vehicle) vehicles.get(vehicleType).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
      }
        return vehicle;
    }

    private void initializer() {

        Car car = new Car();
        car.setEngineCapacity(2000);
        car.setType("Mini");
        car.setFuelType("Gasoline");

        Bus bus=new Bus();
        bus.setNumberOfSeats(32);
        bus.setNumberOfSeats(3000);
        bus.setFuelType("Diesel");

        vehicles.put(VehicleType.CAR, car);
        vehicles.put(VehicleType.BUS, car);

        }
    }
}
