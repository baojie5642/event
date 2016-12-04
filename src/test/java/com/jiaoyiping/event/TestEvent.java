package com.jiaoyiping.event;/*
 * Created with Intellij IDEA
 * USER: 焦一平
 * Mail: jiaoyiping@gmail.com
 * Date: 2016/12/2
 * Time: 16:08
 * To change this template use File | Settings | Editor | File and Code Templates
*/

import org.junit.Test;

import java.util.concurrent.Executors;

public class TestEvent {
    @Test
    public void testEventMulticaster() throws InterruptedException {
        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        multicaster.setTaskExecutor(Executors.newFixedThreadPool(20));
        multicaster.addApplicationListener(new HPEventListener());
        multicaster.addApplicationListener(new CMCCEventListener());
        multicaster.multicastEvent(new HPEvent("慧与中国"));
        multicaster.multicastEvent(new HPEvent("HPE"));
        multicaster.multicastEvent(new CMCCEvent("中国移动通信研究院"));
        Thread.sleep(5000);
    }


}    