package ${package};

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by carmen on July 2017.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap m) {
        m.addAttribute("helloTemplate", "Hello Template");
        return "index";
    }
}