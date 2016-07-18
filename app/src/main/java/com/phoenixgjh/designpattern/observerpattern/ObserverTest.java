package com.phoenixgjh.designpattern.observerpattern;

import android.app.Activity;
import android.os.Bundle;

import com.phoenixgjh.designpattern.R;
import com.phoenixgjh.designpattern.observerpattern.evententrust.GoodNotifier;
import com.phoenixgjh.designpattern.observerpattern.evententrust.Notifier;

import java.util.Date;

/**
 * Created by Phoenix on 2016/7/18.
 */
public class ObserverTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_1();
    }

    /**
     * 观察者模式
     */
    private void init_1() {
        ConcreteSubject subject = new ConcreteSubject();
        NBAObserver observer = new NBAObserver();
        subject.addObserver(observer);
        subject.notifyAllObserver("Warnning");
    }

    /**
     * 事件委托
     */
    private void init_2() {
        //创建观察着
        Notifier notifier = new GoodNotifier();
        WatcherCartoonListener listener_1 = new WatcherCartoonListener();
        PlayingGameListener listener_2 = new PlayingGameListener();
        notifier.addListener(listener_1, "收起漫画书", new Date());
        notifier.addListener(listener_2, "停止玩游戏", new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifier.notifyEveryone();
    }


    public static class WatcherCartoonListener {

    }

    public static class PlayingGameListener {

    }
}
