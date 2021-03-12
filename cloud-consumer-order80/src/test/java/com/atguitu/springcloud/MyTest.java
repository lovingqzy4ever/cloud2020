package com.atguitu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qinchangfa
 * @create 2021/2/2
 */
@Slf4j
public class MyTest {
    private static final String URL = "http://localhost:8080";

    @Test
    public void tes1(){
        List<Integer> intList = new ArrayList<Integer>();
        log.info("this is a log");
    }
}
