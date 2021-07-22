package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService ;

    @Autowired // spring container 에 있는 member service와 자동으로 연결해줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
