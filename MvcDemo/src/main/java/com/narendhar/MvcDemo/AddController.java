package com.narendhar.MvcDemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AddController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req,HttpSession session){
        int num1=Integer.parseInt(req.getParameter("num1"));
        int num2=Integer.parseInt(req.getParameter("num2"));
        int result=num1+num2;
        session.setAttribute("result", result);

        return  "result.jsp";
    }

}
