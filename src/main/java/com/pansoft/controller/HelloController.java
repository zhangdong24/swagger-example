package com.pansoft.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "查找一个用户" ,notes = "查找一个用户notes")
    @RequestMapping(value = "user/{name}",method = RequestMethod.GET)
    public String getUser(@PathVariable(value="name")String name){
        return name;
    }


    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "user/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable(value="id")String name){
        return name+"deleted";
    }

}
