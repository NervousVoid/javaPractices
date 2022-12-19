public class Atelier implements MenClothing, WomenClothing{
    public void dressMan(Clothes[] clothes) {
        System.out.println("Suitable for men:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                System.out.println(c.toString());
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Suitable for women:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                System.out.println(c.toString());
            }
        }
    }
}
