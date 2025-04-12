class Commission {
    private double sale;

    // Constructor
    public Commission(double sale) {
        this.sale = sale;
    }

    // Method to calculate commission based on sales
    public double commission() {
        if (sale < 500) {
            return sale * 0.02; // 2% commission
        } else if (sale <= 5000) {
            return sale * 0.05; // 5% commission
        } else {
            return sale * 0.08; // 8% commission
        }
    }
}