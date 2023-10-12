//자식 클래스
public class SuperSonicAirplane extends Airplane{


    public static final int NORMAL = 1;

    public static final int SUPERSONIC = 2;


    public int flyMode = NORMAL;


    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else {
            //부모 클래스의 멤버인 fly() 메소드 호출.
            super.fly();
        }
    }
}
