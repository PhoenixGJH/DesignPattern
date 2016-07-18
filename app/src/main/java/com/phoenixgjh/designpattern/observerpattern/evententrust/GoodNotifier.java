package com.phoenixgjh.designpattern.observerpattern.evententrust;

/**
 * Created by Phoenix on 2016/7/18.
 */
public class GoodNotifier extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... params) {
        EventHandler handler = getEventHandler();
        handler.addEvent(object, methodName, params);
    }

    @Override
    public void notifyEveryone() {
        try {
            getEventHandler().notifyEveryone();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
