package com.jiaoyiping.event;
 /*
  * Created with Intellij IDEA
  * USER: 焦一平
  * Mail: jiaoyiping@gmail.com
  * Date: 2016/12/4
  * Time: 10:55
  * To change this template use File | Settings | Editor | File and Code Templates
 */

public class CMCCEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CMCCEvent(Object source) {
        super(source);
    }
}