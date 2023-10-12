package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        int person = 0;
        String name = "";
        String tel = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("인원수를 입력하세요");
        person = sc.nextInt();


        Phone [] phone = new Phone[person];

        for(int i=0; i< phone.length; i++){
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            name = sc.next();
            tel = sc.next();
            phone[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다.");
        while (true) {
            System.out.print("검색할 이름 >>");
            name = sc.next();

            boolean flag = false;

           for(int i=0; i<phone.length; i++) {
               if (name.equals(phone[i].getName())) {
                   System.out.println(name + "의 번호는" + phone[i].getTel());
                   flag = true;
               }
           }

            if (name.equals("exit")) {
                System.out.println("종료합니다...");
                return;
            }
            if(flag == false){
                System.out.println(name + "이 없습니다.");
            }



        }


    }
}
