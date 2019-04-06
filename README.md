# AIDLDemo
通过aidl调用远程服务

# 目标
通过手写aidl生成的Java类来了解aidl的调用过程

# aidl客户端需要stub和proxy，而服务端只需要stub
step1：客户端通过Stub.asInterface(service)获得远程代理类；

step2：服务端通过new Stub()来实现接口具体方法；

step3：服务端重写Stub()类中的onTransact()方法来验证客户端是否具有权限。

# 关于service绑定
### Activity中
step1：bindService()；

step2：重写ServiceConnection的onServiceConnected()和onServiceDisconnected()方法；
### Service中
step3：重写onBind()方法返回IBinder对象。

# 在本工程中
重写IBinder对象为Stub对象。
