package hello.springbasic.order;

public interface OrderService {

    // 주문생성
    Order createOrder(Long memberId, String itemName, int itemPrice);


}
