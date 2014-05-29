package me.ninjachen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ninja_chen on 14-5-30.
 */
@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @RequestMapping("/")
    public String home(){
        return "Its  in ninja Controller";
    }
}
