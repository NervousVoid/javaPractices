public enum Size {
    XXS (32) {
        public String getDescription(){
            return "Child size";
        }
    },
    XS (34){
        public String getDescription(){
            return "Short women size";
        }
    },
    S (36){
        public String getDescription(){
            return "Women size";
        }
    },
    M (38){
        public String getDescription(){
            return "Short men size";
        }
    },
    L (40){
        public String getDescription(){
            return "Men size";
        }
    };

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return this.euroSize;
    }
}
