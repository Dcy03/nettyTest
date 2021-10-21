package com.dcy.nettytest.api;

import com.dcy.nettytest.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Dcy
 */
@Controller
public class TestController {

    @Value("${netty.ws}")
    private String ws;

    @Autowired
    private UserGroupRepository userGroupRepository;

    /**
     * 登陆页面
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "test/login";
    }

    /**
     * 登陆后跳转到主页
     */
    @PostMapping("/login.do")
    public String login(@RequestParam Integer userId, HttpSession session, Model model) {
        model.addAttribute("ws", ws);
        session.setAttribute("userId", userId);
        model.addAttribute("groupList", userGroupRepository.findGroupIdByUserId(userId));
        return "test/index";
    }
}
