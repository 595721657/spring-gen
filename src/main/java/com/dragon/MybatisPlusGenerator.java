package com.dragon;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 59572
 */
public class MybatisPlusGenerator {
    public static void main(String[] args) {
       /* FastAutoGenerator.create(
                new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/productdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Shanghai", "root", "root"))
                // 全局配置
                .globalConfig((builder) -> builder
                        // 交互式作用名称
                        .author("dragon")
                        .fileOverride()
                        // 开启swagger模式
                        .enableSwagger()
                        // 输出位置
                        .outputDir("D:\\若依项目\\MybatisPlusGenerator-main\\chongshoumicropink\\src\\main\\java"))
                // 包配置
                .packageConfig((builder) -> builder
                        .service("service")
                        .serviceImpl("service.Impl")
                        .mapper("mapper")
                        .xml("mapper")
                        .entity("entity")
                )

                // 策略配置
                //请输入表名，多个英文逗号分隔？所有输入 all
                .strategyConfig((builder) -> builder.addInclude(getTables("all"))
                        .controllerBuilder().enableRestStyle().enableHyphenStyle()
                        .entityBuilder().enableLombok()
                        // 下划线转驼峰命名
                        .columnNaming(NamingStrategy.underline_to_camel)
                        //.addTableFills(
                        // new Column("update_time", FieldFill.INSERT_UPDATE))
                        //.addTableFills(
                        // new Column("create_time", FieldFill.INSERT)
                        .build())

                *//*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 *//*
//                .templateEngine(new BeetlTemplateEngine())
                .templateConfig((scanner, builder) -> getTemplateConfig())


                .execute();
    }


    public static TemplateConfig getTemplateConfig() {
        TemplateConfig templateConfig = new TemplateConfig.Builder()
//                .disable(TemplateType.ENTITY)
                .entity("/gen/entity.java.vm")
                .service("/gen/service.java.vm")
                .serviceImpl("/gen/serviceImpl.java.vm")
                .mapper("/gen/mapper.java.vm")
                .xml("/gen/mapper.xml.vm")
                .controller("/gen/controller.java.vm")
                .build();
        return templateConfig;*/
    }


    /**
     * 处理 all 情况
     * @param tables
     * @return
     */
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
