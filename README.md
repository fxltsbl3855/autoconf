# autoconf

#本项目是spring的自动加载示例项目；

#原理：跟jdk spi类似，只不过spring又实现了一套

#示例项目使用用法：
  ##1 打包本项目形成一个jar包
  ##2 在另外一个项目中使用：
        *a 引入step1中的jar
        *b 代码中引入并使用
```javascript
@Autowired
private ExampleService exampleService;
```
         *c 配置文件中加入配置
```javascript
com.qms.autoconfigure.prefix=front
com.qms.autoconfigure.suffix=end
com.qms.autoconfigure.enabled=true
```         
