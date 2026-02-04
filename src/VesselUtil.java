public Vessel getVesselById(String vesselId) {
    for (Vessel v : vesselList) {
        if (v.getVesselId().equals(vesselId)) {
            return v;
        }
    }
    return null;
}
