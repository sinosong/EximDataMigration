package com.brilliance;

import com.brilliance.entity.BizCBE;
import com.brilliance.service.IBizCBEService;
import com.brilliance.util.SpringContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis-plus Spring Boot 测试 Demo<br>
 * 文档：http://mp.baomidou.com<br>
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.brilliance")
@PropertySource("classpath:config.properties")
public class Application {

    protected final static Logger logger = LoggerFactory.getLogger(Application.class);

    /**
     * <p>
     * 测试 RUN<br>
     * 查看 h2 数据库控制台：http://localhost:8080/console<br>
     * 使用：JDBC URL 设置 jdbc:h2:mem:testdb 用户名 sa 密码 sa 进入，可视化查看 user 表<br>
     * 误删连接设置，开发机系统本地 ~/.h2.server.properties 文件<br>
     * <br>
     * 1、http://localhost:8080/user/test<br>
     * 2、http://localhost:8080/user/test1<br>
     * 3、http://localhost:8080/user/test2<br>
     * 4、http://localhost:8080/user/test3<br>
     * 5、http://localhost:8080/user/add<br>
     * 6、http://localhost:8080/user/selectsql<br>
     * 7、分页 size 一页显示数量  current 当前页码
     * 方式一：http://localhost:8080/user/page?size=1&current=1<br>
     * 方式二：http://localhost:8080/user/pagehelper?size=1&current=1<br>
     * </p>
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        logger.info("PortalApplication is success!");

        /*IUserService userService = (IUserService) SpringContextUtils.getBean(IUserService.class);
        List<User> users =userService.selectListBySQL();
        for(User u:users)
        {
            System.out.println(u.toString());
        }

        System.out.println(userService);*/
        IBizCBEService cbeService = (IBizCBEService) SpringContextUtils.getBean(IBizCBEService.class);
        BizCBE cbe = cbeService.getById(1L);
        System.out.println(cbe);
//        System.out.println(cbe.toString());
//        System.exit(0);

    }

}
