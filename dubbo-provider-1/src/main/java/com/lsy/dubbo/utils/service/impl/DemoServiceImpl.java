package com.lsy.dubbo.utils.service.impl;

import com.lsy.dubbo.utils.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lipiaofei
 * @version 1.0
 * @date 2019/03/08 11:06
 */
@Service(version = "${project.service.version}", weight = 100)
public class DemoServiceImpl implements DemoService {

    private static Integer num = 0;

    public String sayHello(String name) {
        System.out.println("sayHello接口被调用 ----- 1 -- "+(++num));
        return "Hello " + name;
    }
}
