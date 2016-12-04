package com.jiaoyiping.event;/*
 * Created with Intellij IDEA
 * USER: 焦一平
 * Mail: jiaoyiping@gmail.com
 * Date: 2016/12/2
 * Time: 16:04
 * To change this template use File | Settings | Editor | File and Code Templates
*/

public class HPEventListener implements ApplicationListener<HPEvent> {
    @Override
    public void onApplicationEvent(HPEvent event) {
        System.out.println("================================");
        System.out.println("捕捉到HP事件:" + event.getSource().toString());
        System.out.println("================================");
    }
}