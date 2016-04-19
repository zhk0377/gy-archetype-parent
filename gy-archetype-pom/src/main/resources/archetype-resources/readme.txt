install到本地仓库：
mvn clean install -Dmaven.test.skip=true -Dfile.encoding=UTF-8 -Dmaven.javadoc.skip=false -U -T 1C -Pprod
deploy到私服：
mvn clean deploy -Dmaven.test.skip=true -Dfile.encoding=UTF-8 -Dmaven.javadoc.skip=false -U -T 1C -Pprod