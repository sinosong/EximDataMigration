package com.brilliance.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.brilliance.util.DataUtil;
import com.brilliance.util.PropertiesUtil;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
//@MapperScan("com.baomidou.springboot.mapper*")//这个注解，作用相当于下面的@Bean MapperScannerConfigurer，2者配置1份即可
public class MybatisPlusConfig {



    /**
     * 根据数据源创建SqlSessionFactory
     */
//    @Bean(name = "sqlSessionFactory")
//    @ConditionalOnBean(DataSource.class)
//    public MybatisSqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
//        MybatisSqlSessionFactoryBean sessionFactory = new MybatisSqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactory.setMapperLocations(resolver.getResources(PropertiesUtil.getString("mybatis.mapperLocations")));
//        sessionFactory.setTypeAliasesPackage(PropertiesUtil.getString("mybatis.typeAliasesPackage"));
//
//        PaginationInterceptor page = new PaginationInterceptor();
//        page.setDialectType(PropertiesUtil.getString("mybatis.dialectType"));
//        sessionFactory.setPlugins(new Interceptor[]{page});
//
//        MybatisConfiguration configuration = new MybatisConfiguration();
//        configuration.setLogImpl(Slf4jImpl.class);
//        configuration.setCallSettersOnNulls(true);
//        sessionFactory.setConfiguration(configuration);
//
////        String idType = PropertiesUtil.getString("mybatis.idType");
////        GlobalConfiguration config = new GlobalConfiguration();
////        config.setDbColumnUnderline(true);
////        config.setSqlInjector(new AutoSqlInjector());
////        if (DataUtil.isEmpty(idType)) {
////            config.setIdType(IdType.AUTO.getKey());
////        } else {
////            config.setIdType(IdType.valueOf(idType).getKey());
////        }
////        sessionFactory.setGlobalConfig(config);
//        return sessionFactory;
//    }

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        /*
//         * 【测试多租户】 SQL 解析处理拦截器<br>
//         * 这里固定写成住户 1 实际情况你可以从cookie读取，因此数据看不到 【 麻花藤 】 这条记录（ 注意观察 SQL ）<br>
//         */
//        List<ISqlParser> sqlParserList = new ArrayList<>();
//        TenantSqlParser tenantSqlParser = new TenantSqlParser();
////        tenantSqlParser.setTenantHandler(new TenantHandler() {
////            @Override
////            public Expression getTenantId() {
////                return new LongValue(1L);
////            }
////
////            @Override
////            public String getTenantIdColumn() {
////                return "tenant_id";
////            }
////
////            @Override
////            public boolean doTableFilter(String tableName) {
////                // 这里可以判断是否过滤表
////                /*if ("user".equals(tableName)) {
////                    return true;
////                }*/
////                return false;
////            }
////        });
//
////        sqlParserList.add(tenantSqlParser);
////        paginationInterceptor.setSqlParserList(sqlParserList);
////        paginationInterceptor.setSqlParserFilter(new ISqlParserFilter() {
////            @Override
////            public boolean doFilter(MetaObject metaObject) {
////                MappedStatement ms = PluginUtils.getMappedStatement(metaObject);
////                // 过滤自定义查询此时无租户信息约束【 麻花藤 】出现
////                if ("com.baomidou.springboot.mapper.UserMapper.selectListBySQL".equals(ms.getId())) {
////                    return true;
////                }
////                return false;
////            }
////        });
        paginationInterceptor.setDialectType("oracle");
        return paginationInterceptor;
    }

    /**
     * 相当于顶部的：
     * {@code @MapperScan("com.baomidou.springboot.mapper*")}
     * 这里可以扩展，比如使用配置文件来配置扫描Mapper的路径
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage("com.brilliance.mapper*");
        return scannerConfigurer;
    }

    @Bean
    @ConditionalOnBean(DataSource.class)
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

//    @Bean
//    public H2KeyGenerator getH2KeyGenerator() {
//        return new H2KeyGenerator();
//    }

    @Bean
    public OracleKeyGenerator getOracleKeyGenerator(){
        return new OracleKeyGenerator();
    }


    /**
     * 性能分析拦截器，不建议生产使用
     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor(){
//        return new PerformanceInterceptor();
//    }
}
