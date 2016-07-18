package com.phoenixgjh.designpattern.observerpattern.evententrust;

import java.lang.reflect.Method;

/**
 * 事件对象的封装类
 * Created by Phoenix on 2016/7/18.
 */
public class Event {
    //要执行方法的对象
    private Object object;
    //要执行方法的名称
    private String methodName;
    //要执行方法的参数
    private Object[] params;
    //要执行方法的参数类型
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(this.params);
    }

    /**
     * 根据参数数组生成参数数组类型
     *
     * @param params
     */
    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    private Object getObject() {
        return object;
    }

    private Object[] getParams() {
        return params;
    }

    //TODO 添加一些get和set方法

    /**
     * 根据该对象的方法名，方法参数，利用反射机制执行该方法
     *
     * @throws Exception
     */
    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        if (method != null) {
            method.invoke(this.getObject(), this.getParams());
        }

    }

}
