package pack2;

import pack1.A;

//A클래스를 부모 클래스로 하여 필드와 메소드를 상속받음.

public class D extends A {
    // A클래스의 멤버가 모두 protected 접근제한자를 가지고 있음.
    // A클래스를 상속받은 클래스 D 내부에서는 A클래스의 멤버를 사용할 수 있음.
    public D(){
        super();
        this.field = "pack1의 클래스 A에서 상속받은 field";
        this.method();
    }
}
