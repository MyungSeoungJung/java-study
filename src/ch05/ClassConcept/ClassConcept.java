package ch05.ClassConcept;


public class ClassConcept {
    public static void main(String[] args) {
        //클래스 = 구조화된 데이터 구조를 생성하기 위한 틀(템플릿,template)
        //같은 역할을 수행하는 코드를 사용하기 위함(재사용)
        // OOP(object oriented programming) -> CBD(component based desigh) -> SOA(service oriented architecture)
        //design : 코드 수준의 설계
        //단점:boiler-plate의 증가 (코드를 시작하기 위한 기본 뼈대가 증가)

        //첫 번째 주문 정보 객체 생성
        OrderInfo order1 = new OrderInfo("ORD001", "John Doe", "Product A", 49.99, 2);
        // orderInfo order1 = new orderinfo();  == 빈 생성자는 코딩을 안해도 기본적으로 만들어짐, 생성자를 별도로 만들면 기본적으로 있는건 사라짐
        order1.displayOrderDetails(); //호출
        System.out.println();

        // 두 번째 주문 정보 객체 생성
        OrderInfo order2 = new OrderInfo("ORD002", "Jane Smith", "Product B", 99.99, 3);
        order2.displayOrderDetails(); //호출
        
        //변수 = 자료형 변수명
        //클래스 : 개발자가 만들어낸 자료형

        //객체를 생성
        //클래스명 객체명 = new 클래스명(...);
        
        //빈 생성자로 주문정보 객체 1개 생성
        //데이터 값이 아무것도 없음
        OrderInfo order3 = new OrderInfo();
        //자바 다른 클래스 필드를 직접 접근하지않음
        // order3.orderId = "ORD0003";
        //자바에서는 다른 클래스에서 필드에 접근할때는 메서드로만 접근한다
        order3.displayOrderDetails();

        order3.setOrderId("Ord003");  //setter로 외부에서 orderid 변경
    }
}