public class Car {

    public int speed;


    public void speedUp(){
        speed += 1;
    }

    private void speedDown(){
        speed -= 1;
    }

    // final 메소드로 선언
    // 해당 메소드는 오버라이딩 불가
    public final void stop(){
        System.out.println("차를 멈춥니다.");
        speed = 0;
    }
}
