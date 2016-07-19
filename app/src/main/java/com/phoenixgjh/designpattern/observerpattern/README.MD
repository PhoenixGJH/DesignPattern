## 定义
> 简单来说，当有多个观察者想同时观察同一个主题对象的时候，当主题对象的 状态发生变化，观察者能够回调自身的方法去更新自己
## 实现步骤
> 要定义一个观察者接口
> 观察者实现观察者接口
> 要有一个被通知者接口，里面有addObserver（Observer observer），
> removeObserver（Observer observer）， notifyObservers（）方法
> 在被观察者发生变化的时候，调用 notifyObservers（），遍历List，回调observer里面的方法