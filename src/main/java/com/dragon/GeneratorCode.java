package com.dragon;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.dragon.common.web.controller.BaseController;
import com.dragon.common.web.entity.BaseEntity;
import com.dragon.common.web.mapper.BaseEntityMapper;
import com.dragon.common.web.service.IBaseService;
import com.dragon.common.web.service.impl.BaseServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dragon
 * @date 2022/6/2 10:21
 */
public class GeneratorCode {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 1、全局配置
        GlobalConfig gc = new GlobalConfig();
        // 当前项目路径,user.dir找的是当前路径，不修改
        String projectPath = System.getProperty("user.dir");
        // 放置的项目放置
        gc.setOutputDir(projectPath + "/src/main/java");

        //可以将生成得代码单独放在文件夹里，检查完没问题在手动将包复制到项目中
        gc.setOutputDir("D:\\ageneratecode");
        // 生成实体类的文档注解中作者名
        gc.setAuthor("dragon");
        // 生成代码后不打开本地目录
        gc.setOpen(false);
        // 是否覆盖原来生成的
        gc.setFileOverride(true);
        // 指定生成的主键类型--雪花算法生成
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        // 实体属性Swagger2 注解
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        // 2、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/productdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        //去掉Service接口的首字母 I
        //gc.setServiceName("%sService");
        mpg.setDataSource(dsc);

        // 3、包配置
        PackageConfig pc = new PackageConfig();
        // 生成的controller路径映射为一个"/",覆盖默认的"//"
        pc.setModuleName(null)
                //// 生成controller，service，xml并设置路径。
                .setParent("com.dragon.project")
                .setEntity("entity")
                .setMapper("mapper")
                .setService("service")
                .setServiceImpl("service.impl")
                .setController("controller");
        mpg.setPackageInfo(pc);

        // 4、自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };
        // 带上.ftl/.vm标识模板引擎
        String templatePath = "/gen/mapper.xml.vm";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名
                return projectPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 默认xml位置取消生成，传null参
        TemplateConfig config = new TemplateConfig();
        //注:不想生成，直接给空字符串;
       // config.setXml(null).setController("");
        mpg.setTemplate(config);

        // 映射数据库的表明
        String[] strTableNames = {"comminfo", "employee", "supplier"};
        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 开启全局大写命名
        strategy.setCapitalMode(true);
        // 实体类名驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 属性名驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 设置要映射的表名
        strategy.setInclude(strTableNames);
        // 生成的entity就会实现指定的Serializable接口
        strategy.setSuperEntityClass(BaseEntity.class);
        // 生成的controller就会实现指定的Serializable接口
        strategy.setSuperServiceClass(IBaseService.class);
        strategy.setSuperControllerClass(BaseController.class);
        strategy.setSuperMapperClass(BaseEntityMapper.class.getName());
        //strategy.setMa
        strategy.setSuperServiceImplClass(BaseServiceImpl.class);
        // 使用 lombok
        strategy.setEntityLombokModel(true);
        // 开启 restful风格
        strategy.setRestControllerStyle(true);
        // 逻辑删除
        strategy.setLogicDeleteFieldName("deleted");

        // 6、自动填充配置
        /*TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        tableFills.add(updateTime);
        strategy.setTableFillList(tableFills);*/

        // 7、乐观锁(版本号)
        strategy.setVersionFieldName("version");

        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);

        // 执行生成器
        mpg.execute();
    }
}
