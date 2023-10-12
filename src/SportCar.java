public class SportCar extends Car{

    @Override
    public void speedUp(){
        speed += 10;
    }

    // private는 상속받지 못한다.
    // speedDown()은 자식 클래스인 sportCar 클래스에서 직접 생성한 메소드가 됨.
    private  void speedDown(){

        speed -= 10;
    }


    // 부모 클래스에서 상속해준 stop()메소드가 final로 지정 오버라이딩 불가능
    //물려준거 그대로 사용해야함.


//    public void stop(){
//        System.out.println("스포츠카 를 멈춤");
//        speed =0;
//    }

}
