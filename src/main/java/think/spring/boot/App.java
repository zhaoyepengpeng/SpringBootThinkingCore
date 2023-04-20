package think.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: App
 * @author: zhaoyepeng
 * @date: 2023-04-19 10:34:27
 **/

@SpringBootApplication
public class App {
    /**
     * 主要介绍不使用 spring-boot-starter-parent中的pom.xml文件，
     * 使用自定义的pom.xml文件
     * 主要通过在pom中配置实现,标签为  dependencyManagement
     * <dependencyManagement>
     * <dependencies>
     * <dependency>
     * <groupId>org.springframework.boot</groupId>
     * <artifactId>spring-boot-dependencies</artifactId>
     *次版本号若大于2.0.2.RELEASE，运行命令 mvn clean package 会报错
     * <version>2.0.2.RELEASE</version>
     * <version>2.0.2.RELEASE</version>
     * <type>pom</type>
     * <scope>import</scope>
     * </dependency>
     * </dependencies>
     * </dependencyManagement>
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
