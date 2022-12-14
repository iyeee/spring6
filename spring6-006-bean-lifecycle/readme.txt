bean的生命周期五步:
    第一步：实例化bean
    第二步：bean属性赋值
    第三步：初始化bean
    第四步：使用bean
    第五步：销毁bean

bean的生命周期七步:
    第一步：实例化bean
    第二步：bean属性赋值
    执行“bean后处理器”的before方法
    第三步：初始化bean
    执行“bean后处理器”的after方法
    第四步：使用bean
    第五步：销毁bean

bean生命周期十步

        1.检查bean是否实现了aware相关的接口，如果实现了接口则调用这些接口中的方法
        然后调用这些方法的目的是为了给你传递一些数据，让你更加方便使用
        2.检查了bean是否实现了InitializingBean接口，如果实现了则调用接口中的方法
        3.检查bean是否实现了disposableBean接口

        第一步：实例化bean
        第二步：bean属性赋值
        检查是否实现了aware相关接口，并设置相关依赖(三种aware)
        执行“bean后处理器”的before方法
        检查是否实现了InitializingBean接口，并调用接口方法
        第三步：初始化bean
        执行“bean后处理器”的after方法
        第四步：使用bean
        检查是否实现了DisposableBean接口，并调用接口方法
        第五步：销毁bean
