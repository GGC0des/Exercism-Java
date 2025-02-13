public class CarsAssemble {

    public double productionRatePerHour(int speed) {
      int carsProducedPerHour = 221;
      if (speed >= 0 && speed <= 4) {
        return speed * carsProducedPerHour * 1.0;
      } else if (speed >= 5 && speed <= 8){
        return speed * carsProducedPerHour * 0.9;
      } else if (speed == 9) {
        return speed * carsProducedPerHour * 0.8;
      } else if (speed == 10) {
        return 10 * carsProducedPerHour * 0.77;
      } else {
        System.err.println("Error: Assembly line's speed out of bounds. Current speed: " + speed + ". The maximum speed is reached at 10.");
        return 0.0;
      }

    }

    public int workingItemsPerMinute(int speed) {
      // to avoid invalid speed
      if (speed < 0 || speed > 10) {
        System.err.println("Error: Invalid speed for assembly line. Valid range 1 -10.");
        return 0; // code will not run furhter once this return statement is executed
      }
      // runs only if speed is valid
      double ratePerHour = productionRatePerHour(speed); // hourly production rate depending on speed
      double ratePerMinute = ratePerHour/60; // convert to per-minute rate; value could also be declared as `int` here
      return (int) ratePerMinute; // turnication rounding the double down
      }

    }
