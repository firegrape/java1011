public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;

        Calculator cal = new Calculator();

        System.out.println("원면적: " +cal.areaCircle(r));

        System.out.println("\n--------------------------\n" );

        Computer com = new Computer();

        System.out.println("원면적 : " + com.areaCircle(r));
        System.out.println(com.muti(10, 20));


    }
}
