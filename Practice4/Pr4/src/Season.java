public enum Season {
    WINTER (-10),
    SPRING (15),
    SUMMER (25){
        public String getDescription() {
            return "Warm season";
        }
    },
    FALL (10);

    private final int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return "Cold season";
    }

    public void iLove() {
        switch (this) {
            case SUMMER: System.out.println("I like summer \n"); break;
            case SPRING: System.out.println("I like spring \n"); break;
            case FALL: System.out.println("I like fall \n"); break;
            case WINTER: System.out.println("I like winter \n"); break;
        }
    }
}
