package com.phoenixgjh.designpattern.observerpattern.evententrust;

/**
 * 通知者的抽象类
 * Created by Phoenix on 2016/7/18.
 */
public abstract class Notifier {
    private EventHandler handler = new EventHandler();

    public EventHandler getEventHandler() {
        return handler;
    }

    public void setEventHandler(EventHandler handler) {
        this.handler = handler;
    }

    /**
     * 增加监听者
     *
     * @param object
     * @param methodName
     * @param params
     */
    public abstract void addListener(Object object, String methodName, Object... params);

    /**
     * 通知
     */
    public abstract void notifyEveryone();
}

