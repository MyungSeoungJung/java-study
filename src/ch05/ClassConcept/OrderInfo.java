package ch05.ClassConcept;

//클래스 = 구조화된 데이터 구조를 생성하기 위한 틀(템플릿,template)
//같은 역할을 수행하는 코드를 사용하기 위함(재사용)

//주문정보
//상거래 시스템의 기본
//물건구매,예약,배달,중고거래
//orderInfo : 소프트웨어 개발자는 데이터/정보를 다루는사람이다
//데이터/정보 = 문자열,숫자,파일(이미지,문서파일)
//예약어:일반적으로 시스템에서 사용하는 용어, 예: Order 예약어를 변수로 사용 x


    //ID(Identification : 신원)
    //필드 (멤버변수,field) : 클래스에 선언된 변수 = 필드
    //필드는 자바에서 아주 일반적으로 private를 앞에다가 씀
    //데이터/정보 1건에 이름/번호를 붙이는 행위는 지극히 당연함
/*
    //필드 ↓
    private String orderId;      //주문번호
    private String customerName; //고객명
    private String productName;  //제품명
    private double totalPrice;   //주문금액
    private int quantity;        //주문수량(개수)




 */
    //alt + insert > 생성자선택 > 초기화할 클래스 선택 = 클래스 초기화  =  간단하게 생성자매소드 생성


    //메서드(method) = 클래스의 기능적인 부분, 실행하고 , 수행할 수 있는 단위의 코드
    //메서드도 일반적으로 앞에 public
    //메서드도 카멜케이스로 사용(처음 소문자 다음 문단마다 대문자) EX = orderInfo
    //class 이름은 파스칼케이스(pascal-case)  (대문자시작단어+대문자시작단어) EX = OrderInfo
    // 그외 kebab-case(order-info, 주소 urlㅡ사이트명칭 , 소문자 단어사이에 "-" 사용)
            //snake-case( EX: order_infom, 데이터베이스 시스템에서 자주 사용, 단어사이에 "_"사용, 단어는 주로 소문자이나,대문자만으로 하는 경우가 있음)

    //클래스명과 동일한 이름의 메서드를 생성자
    //객체를 생성할때 사용
    //객체 (object, instance)는 클래스 찍어낸 걸 객체라고한다

public class OrderInfo {            //클래스

    //필드 ↓  //전역변수(저장)
    private String orderId;
    private String customerName;
    private String productName;
    private double totalPrice;
    private int quantity;


    public OrderInfo(){  // *** 빈 생성자를 만들때 ****

        }

         // ↓ 생성자  =  좀 특이한 메소드   (클래스메인에 있는 객체로부터 받은 매게변수를 저장)         클래스와 이름이 같아야함 (매우 중요)
        public OrderInfo(String orderId, String customerName, String productName, double totalPrice, int quantity) {
        //this라고 하는 것은 현재 객체를 말함
        //this.필드명: 현재 객체의 필드에 접근한다
        this.orderId = orderId;   //this.는 전역변수에 있는 필드를 사용
        this.customerName = customerName;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }
    
    
        //메서드 작성형식
        //아무것도 반환하지않으면 void
        //매게변수(parameter) : 입력값에 대해서 형식을 지정
        /*
        [공개범위 public/private [반환타입(String, void)] [메서드이름] (매개변수,매개변수2,매개변수3)
         실행되는 코드..
         [return 반환값]

         */

    /*

       getter와 setter는 private로 선언된 필드에 접근하기 위해서 사용한다.


    ---setter : 필드의 값을 변경할 때 사용-----------
        //public void set필드명(필드타입 필드명){
        // this.필드명 = 필드명;


        ----getter: 필드값을 반환할 때 사용---------
        public String getOrderId() {
        String temp = this.orderId;
            //return = 값을 반환함
            //리턴 값이 있다면 변수에 할당됨.
        return  this.orderId;
        }

         */

   
    public void setOrderId(String orderId){  // Setter 메소드
        this.orderId = orderId;
    }


    public void displayOrderDetails() {           //메소드 = 사용하기 편하게 함축시켜놓은 기능
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Quantity: " + quantity);
    }

    public void increaseQuantity(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("수량이 추가되었습니다. 총 수량: " + quantity);
    }
}
