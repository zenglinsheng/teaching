package com.teaching.web.controller.user;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author： XO
 * @Description：
 * @Date： 2019/11/03 11:06
 */

@Controller
public class MineController {



    /**
     * 主页
     * @return
     */
    @GetMapping("/user/home")
    public ModelAndView index(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/home", map);
    }

    /**
     * 我的课程
     * @return
     */
    @GetMapping("/user/joinCourse")
    public ModelAndView joinCourse(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/joinCourse", map);
    }

    /**
     * 我创建的课程
     * @return
     */
    @GetMapping("/user/createCourse")
    public ModelAndView createCourse(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/createCourse", map);
    }

    /**
     * 我的收藏
     * @return
     */
    @GetMapping("/user/collect")
    public ModelAndView collection(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/collect", map);
    }

    /**
     * 我的关注
     * @return
     */
    @GetMapping("/user/follow")
    public ModelAndView follow(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/follow", map);
    }

    /**
     * 我的答疑
     * @return
     */
    @GetMapping("/user/answer")
    public ModelAndView answer(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/answer", map);
    }
    /**
     * 我的设置
     * @return
     */
    @GetMapping("/user/setting")
    public ModelAndView setting(Map<String, Object> map,Model model) {

        model.addAttribute("msg","fads");

        return new ModelAndView("user/setting", map);
    }




}
