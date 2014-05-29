package me.ninjachen;

import org.springframework.web.bind.annotation.*;

/**
 * Created by ninja_chen on 14-5-30.
 */
@RestController
public class RESTController {

    /*      http://localhost:8080   */
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    /*      http://localhost:8080/welcome?name=Hunter   */
    @RequestMapping("/welcome")
    String home(@RequestParam(required = false, defaultValue = "Ninja") String name) {
        return "Hello World, " + name;
    }

    /*      http://localhost:8080/ninjachen/happy  */
    @RequestMapping("/ninjachen/{mood}")
    @ResponseBody
    String ninjachen(@PathVariable String mood) {
        return "Ninjachen comes ! He feels " + mood;
    }

}
