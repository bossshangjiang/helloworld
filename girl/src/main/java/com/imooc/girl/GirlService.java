package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    //事务，要么都成功，要么都不成功
    @Transactional
    public void insertTwo(){
        Girl girla=new Girl();
        girla.setCupsize("A");
        girla.setAge(18);
        girlRepository.save(girla);

        Girl girlb=new Girl();
        girlb.setCupsize("BBBB");
        girlb.setAge(19);
        girlRepository.save(girlb);
    }

}
