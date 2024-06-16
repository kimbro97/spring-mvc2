package hello.thymeleafbasic.basic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller
public class TemplateController {
    @GetMapping("fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }
}
