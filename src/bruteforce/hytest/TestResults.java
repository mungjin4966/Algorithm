package bruteforce.hytest;

import java.util.stream.*;
import java.util.*;

public class TestResults
{
    public static class ChargingStation {
        private String station;
        private int kwh;

        public ChargingStation(String station, int kwh) {
            this.station = station;
            this.kwh = kwh;
        }

        public int getKwh () {
            return kwh;
        }

        public String getName() {
            return station;
        }
    }

    public static List<String> chargingStationsThatPass
            (Stream<ChargingStation> chargingStations, int passingKwh) {
        List<String> passName = new ArrayList<>();
        System.out.println(chargingStations.count());
        /* 답안작성 */
        return passName;
    }

    public static void main(String[] args) {

        List<ChargingStation> chargingStations = new ArrayList<ChargingStation>();

        chargingStations.add(new ChargingStation("Seoul", 80));
        chargingStations.add(new ChargingStation("Incheon", 57));
        chargingStations.add(new ChargingStation("Gyeonggi", 21));

        /* 답안작성 */
        chargingStationsThatPass((Stream<ChargingStation>) chargingStations,50);

    }
}
