package study.spring.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.mybatis.service.BoardService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("/test.do")
    public String test(Model model) throws Exception {

        model.addAttribute(boardService.test());
        return "jsonView";
    }

    @RequestMapping("/test2.do")
    public String test2(Model model) throws Exception {

        model.addAttribute(boardService.test2());
        return "jsonView";
    }

    @RequestMapping("/test3.do")
    public String test3(Model model) throws Exception {

        model.addAttribute(boardService.test3());
        return "jsonView";
    }
}
