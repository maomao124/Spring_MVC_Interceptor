package mao.spring_mvc_interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Project name(项目名称)：Spring_MVC_Interceptor
 * Package(包名): mao.spring_mvc_interceptor
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 18:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class UserController
{
    @RequestMapping("/toLogin")
    public String initLogin()
    {
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session)
    {
        System.out.println(user.getName());
        if ("admin".equals(user.getName()) && "123456".equals(user.getPassword()))
        {
            // 登录成功，将用户信息保存到session对象中
            session.setAttribute("user", user);
            // 重定向到主页面的跳转方法
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！ ");
        return "login";
    }


    @RequestMapping("/main")
    public String toMain()
    {
        return "main";
    }


    @RequestMapping("/logout")
    public String logout(HttpSession session)
    {
        // 清除 session
        session.invalidate();
        return "login";
    }

    @RequestMapping("/test")
    public String test()
    {
        return "test";
    }
}
