package com.imikasa.controller;

import com.imikasa.common.CommonResult;
import com.imikasa.pojo.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/quick-start")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Hello World1!";
    }

    /**
     * 统一结果返回的测试，因为config/GlobalResponseBodyHandler 已经设置了拦截返回值，
     * 所以即使你返回的不是commonResult类型的值也会给你转换成要显示的类型
     * @return
     */
    @GetMapping("/noGlobal")
    public Book noGlobal(){
        return new Book(1,"《第一行Android代码》","ssa",23.9);
    }
    @GetMapping("/hasGlobal")
    public CommonResult<Book> hasGlobal(){
        return CommonResult.success(new Book(2,"《spring 实战》","ssa",34.2));
    }


}
