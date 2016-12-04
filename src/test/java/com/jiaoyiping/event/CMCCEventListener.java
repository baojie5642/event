package com.jiaoyiping.event;
 /*
  * Created with Intellij IDEA
  * USER: 焦一平
  * Mail: jiaoyiping@gmail.com
  * Date: 2016/12/4
  * Time: 10:58
  * To change this template use File | Settings | Editor | File and Code Templates
 */

public class CMCCEventListener implements ApplicationListener<CMCCEvent> {
    @Override
    public void onApplicationEvent(CMCCEvent event) {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("捕捉到CMCC事件:" + event.getSource());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}