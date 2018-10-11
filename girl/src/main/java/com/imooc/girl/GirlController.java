package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    //返回所有女生
    @GetMapping(value="/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }
    //添加女生
    @PostMapping(value="/girls")
    public Girl girlAdd(@RequestParam("cupsize") String cupsize,
                          @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setCupsize(cupsize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }
    //查找一个女生
    @GetMapping(value="/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }
    //修改一个女生
    @PutMapping(value="/girls/{id}")
    public Girl girlupdate(@PathVariable("id") Integer id,
                           @RequestParam("cupsize") String cupsize,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupsize(cupsize);

        return girlRepository.save(girl);
    }
    //删除一个女生
    @DeleteMapping(value="/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }
    //通过年龄来查询
    @GetMapping(value="/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age")Integer age){
        return girlRepository.findByAge(age);
    }
    //一次添加两个女生信息
    @PostMapping(value="/girls/two")
    public void girltwo(){
        girlService.insertTwo();
    }
}

