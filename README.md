# springcloud-feign-config-server

product-view-service-feign注册到了eureka-server中. <br>
同样在product-view-service-feign中的bootstrap.yml中, <br>
配置指定了 config->label 为 config-label-test(git仓库分支), <br>
指定了其discovery的service-id为 config-server <br>
也指定了其注册中心为8761端口的eureka.  <br>

在config-server中指定了其git的uri地址为 <br>
https://github.com/deadzq/springcloud-config-server-test ,<br>
即git仓库地址,下面的search-paths为test1, 指定该仓库中文件夹. <br>

启动顺序在开启feign前先要开启config-server <br>
注意要将版本信息调整为与feign项目name值相同. <br>
