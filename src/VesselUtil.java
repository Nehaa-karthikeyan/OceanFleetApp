public List<Vessel> getHighPerformanceVessels() {

    List<Vessel> highPerformanceList = new ArrayList<>();
    double maxSpeed = 0;

    // Find maximum speed
    for (Vessel v : vesselList) {
        if (v.getAverageSpeed() > maxSpeed) {
            maxSpeed = v.getAverageSpeed();
        }
    }

    // Collect vessels with max speed
    for (Vessel v : vesselList) {
        if (v.getAverageSpeed() == maxSpeed) {
            highPerformanceList.add(v);
        }
    }

    return highPerformanceList;
}
