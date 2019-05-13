# springboot-dubbo-demo
基于incubator-dubbo-spring-boot-project/dubbo-spring-boot-samples/抽离出来的应用程序  
#### 说明：
1、接口定义统一在interface-sample中  
2、provider-sample内嵌了zookeeper，目前仅为单机版，不推荐用于生产；如果需要注册到外部zk，请注释main方法EmbeddedZooKeeper部分即可  
3、项目版本控制均在parent配置  
4、注册服务管理配置页面请参考https://github.com/apache/incubator-dubbo-admin  