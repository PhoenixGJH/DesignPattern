package com.phoenixgjh.designpattern.observerpattern.evententrust;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理者
 * Created by Phoenix on 2016/7/18.
 */
public class EventHandler {
    //事件集合
    private List<Event> mLists;

    public EventHandler() {
        mLists = new ArrayList<>();
    }

    /**
     * 添加某个对象要执行的事件以及需要的参数
     *
     * @param object
     * @param methodName
     * @param params
     */
    public void addEvent(Object object, String methodName, Object... params) {
        mLists.add(new Event(object, methodName, params));
    }

    /**
     * 通知所有的对象执行指定的事件
     *
     * @throws Exception
     */
    public void notifyEveryone() throws Exception {
        for (Event e : mLists) {
            e.invoke();
        }
    }
}
