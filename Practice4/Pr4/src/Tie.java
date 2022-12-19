public class Tie extends Clothes implements MenClothing{

    public Tie(int p, String c){
        this.price = p;
        this.color = c;
    }

    @Override
    public void dressMan(Clothes[] clothes){

    }

    public String getType(){
        return "Tie";
    }

    public String toString() {
        return String.format("%s: %d, %s — %d", this.getType(), this.size, this.color, this.price);
    }
}
