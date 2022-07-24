package net.softsociety.practice2.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.practice2.service.CartService;
import net.softsociety.practice2.vo.OrderList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String gotoCartFromHome(Model model) {
        //selectAll orderlist
        List<OrderList> orders = cartService.selectAll();
        if (orders == null) {
            log.debug("불러올 항목이 없음");
            return "redirect:/";
        }

        log.debug("카트전체목록: {}", orders);
        model.addAttribute("orders", orders);

        return "/cart";
    }

    /**
     * 제품 번호를 받아서 post방식으로 들어옴
     * @return cart 페이지
     */
    @PostMapping("/cart")
    public String gotoCart(OrderList orderList, Model model) {
        // 객체 가져오기
        log.debug("가져온 객체값 orderList" + orderList);
        int res = cartService.insertCart(orderList);
        if (res == 0) {
            log.debug("카트 담기 실패!");
            return "redirect:/";
        }
        //selectAll orderlist
        List<OrderList> orders = cartService.selectAll();
        if (orders == null) {
            log.debug("불러올 항목이 없음");
            return "redirect:/";
        }

        log.debug("카트전체목록: {}", orders);
        model.addAttribute("orders", orders);

        return "/cart";
    }

    /**
     * Cart 장바구니 삭제
     * @return redirect
     */
    @GetMapping("/deleteCart")
    public String deleteCart(String pNum) {
        log.debug("넘어온값: " + pNum);

        int res = cartService.deleteCart(pNum);
        if (res == 0) {
            log.debug("카트 삭제 실패!");
            return "redirect:/";
        }

        log.debug("카트삭제");

        return "redirect:/cart";
    }
}
