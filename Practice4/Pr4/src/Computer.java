public class Computer {
//    private enum Brand {
//        APPLE,
//        HP,
//        ASUS
//    }
    public Processor cpu;
    public Memory mem;
    public Monitor moni;

    public Computer(){
        cpu = new Processor();
        mem = new Memory();
        moni = new Monitor();
    }

    public Computer(double cpu_f, double cpu_v, int m_width, int m_height, int m_size) {
        cpu = new Processor(cpu_f, cpu_v);
        mem = new Memory();
        moni = new Monitor(m_width, m_height, m_size);
    }
}
