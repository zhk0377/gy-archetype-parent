install到本地仓库：
mvn clean install -Dmaven.test.skip=true -Dfile.encoding=UTF-8 -Dmaven.javadoc.skip=false -U -T 1C -Pprod
deploy到私服：
mvn clean deploy -Dmaven.test.skip=true -Dfile.encoding=UTF-8 -Dmaven.javadoc.skip=false -U -T 1C -Pprod

##generator命令
mybatis-generator:generate

##generator步骤
1. 选择demo-pom工程，运行maven - Run As Maven build...  
Goals参数：`clean install -Dmaven.test.skip=true -Dfile.encoding=UTF-8 -Dmaven.javadoc.skip=false -U -T 1C`

2. 选择demo-business工程，运行maven - Run As Maven build...  
Goals参数：`mybatis-generator:generate`

3. 刷新demo-business工程即可

###注意事项
1. 执行generate之前请配置demo-business\src\main\resources\conf\generator\generator.properties中jdbc信息  