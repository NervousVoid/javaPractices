public class Skirt extends Clothes implements WomenClothing{
    public Skirt(int s, int p, String c){
        this.size = s;
        this.price = p;
        this.color = c;
    }

    @Override
    public void dressWoman(Clothes[] clothes){

    }

    public String getType(){
        return "Skirt";
    }

    public String toString() {
        return String.format("%s: %d, %s — %d", this.getType(), this.size, this.color, this.price);
    }
}
