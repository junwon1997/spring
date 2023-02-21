package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "Spring", 20000);
        order.setItemPrice(order.calculatePrice());
        System.out.println("new order = " + order);


    }
}