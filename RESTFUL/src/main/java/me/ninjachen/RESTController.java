package me.ninjachen;

import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    /*      http://localhost:8080/ninjachen/happy  */
    @RequestMapping("/ninjachen/{mood}")
    @ResponseBody
    String ninjachen(@PathVariable String mood) {
        return "Ninjachen comes ! He feels " + mood;
    }



    /*      http://localhost:8080/welcome?name=Hunter   */
    @RequestMapping(value="/welcome", method = GET)
    String home(@RequestParam(required = false, defaultValue = "Ninja") String name) {
        return "Hello World, " + name;
    }


    /*      http://localhost:8080/welcome?name=Hunter   */
    @RequestMapping(value="/post", method = POST)
    String post(@RequestParam(required = true, defaultValue = "Ninja") String name) {
        return "Hello World, " + name + ". Its post method!";
    }

}
