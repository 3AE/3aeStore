# 3AE整站介绍

| 修订版本 | 修订内容  | 修订日期 |
| :-----: |  :-----:  | :-----: |
|  v1.0.1 | 更新了JAVA架构 | 2018-12-03 |

---  
感谢身边的家人;  
感谢南京睿实消防设备有限公司；  
感谢身边的领导；  
感谢带我的小哥；  
感谢身边的同事；  
感谢身边的朋友。  

## Situation & Task

之前有留下来的很多电商项目File，由于各方面原因上家公司不做了，而那耗费了很多心力、脑力、体力做出来的Demo我不忍心丢弃,想按照行业要求和编码规范完成属于自己的电商项目。由于工作需求限制，现在需从零到一建立一个完善的物联网系统，因此，这两个大型系统需要在我“三脚猫的功夫”的能力下创建一个公共的web架构，也可以随着项目发展和个人能力成长来逐渐完善成一套大型易扩展的系统。  

## Action

该工程是JAVA架构  
  
最近也在学习如何利用Netyy框架去构建一个SOA、RPC类似dubbo这样架构  
主流的架构Spring cloud  

## JAVA架构

```utf-8
3ae-parent      pom管理
3ae-common      共享资源文件
3ae-channel     底层通信
3ae-dto         传输
3ae-pojo        对象实体
3ae-dao         Data Access Object数据访问对象
3ae-agent       服务端代理
3ae-server      C/S服务
3ae-service     B/S微服务
3ae-job         自动运行
3ae-journal     日志文件目录
3ae-enums       常量枚举
3ae-exception   网站异常捕获
3ae-api         ESB总线为模型对外的接口，内含REST目录
3ae-admin       大型网站的后台管理
3ae-user        大型网站的用户中心
3ae-portal      大型网站的门户
```

## 一些约束,接下来每天所做的一些内容

1、图片编码格式采用YUV420sp

```utf-8
主要使用netty框架
3ae-channel -> io.netty
根据国标BT601（标清）和BT709（高清）两种转换方式，分了模拟和数字两种。
后期可能会在这个基础之上实现图像传输。（UDP）
```

2、sonarqube的maven配置

```shell
  mvn sonar:sonar \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=d9be46eadefc3bc0f5f9cde712980d51cf9053a1
```

3、配了阿里云的rdc.aliyun.com

4、更新了njrs-rd59的代码分析

5、配置了海康的SDK

6、配置了线上的markdown的预览功能  
[刍易-知难行易](http://3ae.store)  
[看云-个人文档](http://book.3ae.store)  

