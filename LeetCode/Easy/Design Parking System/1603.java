class ParkingSystem {

    int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        this.slots = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if (this.slots[carType - 1] > 0) {
            this.slots[carType - 1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
