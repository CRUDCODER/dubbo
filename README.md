# dubbo

## 1. 准备阶段

### 1.1 配置zookeeper

在linux中使用docker配置

docker pull zookeeper  //安装zookeeper

docker run -d -p 2181:2181 --name myzookeeper zookeeper //启动zookeeper

### 1.2 安装dubbo-admin控制台

随便找一个dubbo-admin项目 更改配置文件中的zookeeperip地址 然后打包上传linux



## 2.工程说明

### 2.1 dubbo 父工程

用于集中管理子工程maven依赖

### 2.2dubbo-server-api

服务公共模块

主要提供bean实体、common公共组件、service服务类接口、util工具包，还可以将enum枚举类和constant常量放在其中，同样可以将mapper放在里面

### 2.3duubo-server-provider

服务提供者

主要实现公共模块中定义的service接口和mapper

### 2.3duubo-server-consumer

服务消费者

使用provider工程提供的service接口实现类完成功能。