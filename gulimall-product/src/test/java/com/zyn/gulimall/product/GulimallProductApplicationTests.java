package com.zyn.gulimall.product;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.zyn.gulimall.product.entity.BrandEntity;
import com.zyn.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list();
        list.forEach((item->{
            System.out.print(item);
        }));
    }

}
