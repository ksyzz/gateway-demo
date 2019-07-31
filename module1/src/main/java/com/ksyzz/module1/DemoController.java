package com.ksyzz.module1;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengqian
 * @since <pre>2019/07/31</pre>
 */
@RestController
@Api(tags = "module1接口")
public class DemoController {

    @ApiOperation("这是一个接口")
    @GetMapping(value="/hello")
    public String hello(
            @RequestParam("name") String name
    ){
        return "hello " + name;
    }
}
