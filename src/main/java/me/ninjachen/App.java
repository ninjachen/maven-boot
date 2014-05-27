package me.ninjachen;

/**
 * Hello world!
 *
 */
/*public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/
import org.springframework.boot.SpringApplication;


// import org.springframework.boot.*;
// import org.springframework.boot.autoconfigure.*;
// import org.springframework.stereotype.*;
// import org.springframework.web.bind.annotation.*;

// @Controller
// @EnableAutoConfiguration
public class App {

    // @RequestMapping("/")
    // @ResponseBody
    // String home() {
    //     return "Hello World!";
    // }

    // @RequestMapping("/ninjachen")
    // @ResponseBody
    // String ninjachen() {
    //     return "Ninjachen comes !";
    // }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ScheduledTasks.class);
    }
}