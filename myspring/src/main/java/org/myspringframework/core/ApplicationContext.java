package org.myspringframework.core;

/**
 * MySpring框架应用上下文接口
 * @Author iyeee
 * @Date 2022/12/27 14:42
 * @Version 1.0.1
 */
public interface ApplicationContext {
    /**
     * 根据bean的名称获取对应的bean对象
     * @param beanName myspring配置文件中bean标签的id
     * @return 对应的bean对象
     */
    Object getBean(String beanName);

}
