package com.jiaoyiping.event;/*
 * Created with Intellij IDEA
 * USER: 焦一平
 * Mail: jiaoyiping@gmail.com
 * Date: 2016/12/2
 * Time: 16:03
 * To change this template use File | Settings | Editor | File and Code Templates
*/

import com.jiaoyiping.event.ApplicationEvent;

public class HPEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public HPEvent(Object source) {
        super(source);
    }
}