package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/say")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    //@RequestMapping(value="/hi",method=RequestMethod.GET)
    @GetMapping(value="/hi")
    public String say(@RequestParam(value = "id",required=false,defaultValue ="0") String youid){
        return "id:"+youid;
    }
}
