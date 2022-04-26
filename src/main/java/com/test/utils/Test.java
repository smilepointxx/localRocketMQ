package com.test.utils;

import com.test.impl.SendMqServiceImpl;
import com.test.service.SendMQService;

/**
 * mac os
 * Created by smile on 2022-04-26.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        SendMQService sendMqService = new SendMqServiceImpl();
        sendMqService.send("");
    }

}
