import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //문제 1) 책 185p의 문제 3번 풀기
        Rect [] rec = new Rect[4];
        for ( int i =0; i<rec.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println(" 너비와 높이 >>");
            int width = sc.nextInt();
            int height = sc.nextInt();
            rec[i] = new Rect(width,height);
        }
        System.out.println("저장하였습니다 ...");
        int sum = 0;
        for(int i=0; i<rec.length; i++){
        sum += rec[i].getArea();
    }
        System.out.println(sum);


        //문제 2) 책 186 5

        Circle pizza = new Circle(5);
        Circle waffle = new Circle(1);

        boolean res = Circle.CircleManager.equals(pizza, waffle);

        if(res == true){
            System.out.println("pizza와 waffle 크 기 같음");
        }else{
            System.out.println("크기 다름");
        }
        Circle.CircleManager.copy(pizza, waffle);
       res = Circle.CircleManager.equals(pizza, waffle);

        if(res == true){
            System.out.println("pizza와 waffle 크 기 같음");
        }else{
            System.out.println("크기 다름");
        }

        //문제 3 ) 책 187 6
        Box a = new Box();
        Box b = new Box(20, 3);
        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();


        //문제 4번

    }
}
