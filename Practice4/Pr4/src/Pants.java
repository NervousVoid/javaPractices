public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(int s, int p, String c){
        this.size = s;
        this.price = p;
        this.color = c;
    }

    @Override
    public void dressWoman(Clothes[] clothes){

    }

    @Override
    public void dressMan(Clothes[] clothes){

    }

    public String getType(){
        return "Pants";
    }

    public String toString() {
        return String.format("%s: %d, %s — %d", this.getType(), this.size, this.color, this.price);
    }
}
