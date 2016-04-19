package ${package}.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample/test.ftl");
        mav.addObject("time", new Date());
        return mav;
    }

}
