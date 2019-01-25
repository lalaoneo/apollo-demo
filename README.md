# apollo-demo
* 确保启动了apollo配置服务,可以参考linux-demo的安装方法

* 应用程序demo：[参考文档](https://www.cnblogs.com/EasonJim/p/7649047.html)

* 启动类中加注解：@EnableApolloConfig

* 配置：
···properties
server.port=8080

app.id=apollo-demo

apollo.meta=http://192.168.245.128:8080

apollo.bootstrap.enabled = true

apollo.bootstrap.namespaces = application
