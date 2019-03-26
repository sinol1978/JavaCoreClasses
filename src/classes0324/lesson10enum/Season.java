package classes0324.lesson10enum;

public enum Season {
    WINTER(-10), SPRING(10), SUMMER(20){
        @Override
        public String getDescr() {
            return "Warm season";
        }
    }, FALL(15);

    private double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public String getDescr(){
        return "Cold season";
    }
}
