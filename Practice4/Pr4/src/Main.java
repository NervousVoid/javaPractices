public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        System.out.println(comp.cpu.getVoltage());
        comp.cpu.uppervolt(0.15);
        System.out.println(comp.cpu.getFreq());
        System.out.println(comp.cpu.getVoltage());
        comp.mem.addInMem("123");
        comp.mem.printMem();
        System.out.println(comp.moni.getPpi());
    }


//    //Задание 1
//    public static void main(String[] args) {
//        Season season = Season.FALL;
//        season.iLove();
//        for (Season s : Season.values()) {
//            System.out.printf("%s: %s\n", s, s.getDescription());
//        }
//    }

////    Задание 2
//    public static void main(String[] args) {
//        TShort tshirt = new TShort(Size.XXS.getEuroSize(), 1200, "Blue");
//        Pants pants = new Pants(Size.M.getEuroSize(), 3500, "Black");
//        Skirt skirt = new Skirt(Size.S.getEuroSize(), 2000, "Brown");
//        Tie tie = new Tie(4500, "Pink");
//
//        Clothes[] clothes = {tshirt, pants, skirt, tie};
//        Atelier atelier = new Atelier();
//        atelier.dressMan(clothes);
//        atelier.dressWoman(clothes);
//    }
}