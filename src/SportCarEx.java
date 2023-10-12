public class SportCarEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();
        car.speed = 10;
        car.speedUp();
        car.stop();

        System.out.println("현재속도: "+ car.speed);

        SportCar sportCar = new SportCar();
        sportCar.speed = 100;
        sportCar.speedUp();
        sportCar.speedUp();

        System.out.println(sportCar.speed);
       sportCar.stop();
    }
}
