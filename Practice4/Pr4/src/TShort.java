public class TShort extends Clothes implements MenClothing, WomenClothing {
        public TShort(int s, int p, String c){
                this.size = s;
                this.price = p;
                this.color = c;
        }

        public String getType(){
                return "Tshirt";
        }

        @Override
        public void dressMan(Clothes[] clothes) {

        }

        @Override
        public void dressWoman(Clothes[] clothes) {

        }

        public String toString() {
                return String.format("%s: %d, %s — %d", this.getType(), this.size, this.color, this.price);
        }
}
