package com.narendhar.MvcDemoUsingModelAttribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

//    @RequestMapping("addStudent")
//    //using Model object
//    public  String addStudent(@RequestParam("sno") int rollNo,@RequestParam("sname") String name, Model m){
//        m.addAttribute("sno",rollNo);
//        m.addAttribute("sname",name);
//
//
//        return "result";
//    }

    //here spring by default converts into @RequestParam("sno") and @RequestParam(sname)
//    public  String addStudent( int sno,String sname, Model m){
//        m.addAttribute("sno",sno);
//        m.addAttribute("sname",sname);
//
//
//        return "result";
//    }

    //using ModelView Attribute
//    @RequestMapping("addStudent")
//    public  ModelAndView addStudent( int sno,String sname,ModelAndView mv){
//
//
//        mv.addObject("sno",sno);
//        mv.addObject("sname",sname);
//        mv.setViewName("result");
//        return mv;
//    }

//
    @RequestMapping("addStudent")
    public  ModelAndView addStudent( int sno,String sname,ModelAndView mv){

        Student s=new Student();
        s.setSrollno(sno);
        s.setName(sname);


        mv.addObject("student",s);
        mv.setViewName("result");
        return  mv;
    }

    @ModelAttribute("studentStudyingClass")
    public int studentClass(){
        return 8;
    }





}
