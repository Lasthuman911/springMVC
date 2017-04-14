package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Name: admin
 * Date: 2017/4/14
 * Time: 16:15
 */
@Controller//声明为一个控制器
@RequestMapping("/")//将控制器映射到“/”
public class HomeController {
    @RequestMapping(method = GET)//处理对 GET 的请求
    public String home(){
       return "home";//视图名为home，这个String将会被Spring MVC解读为要渲染的视图名称
//        DispatcherServlet会要求视图解析器将这个逻辑名称解析为实际的视图
    }
}
