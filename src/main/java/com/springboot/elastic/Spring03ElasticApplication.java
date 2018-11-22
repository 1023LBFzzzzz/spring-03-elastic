package com.springboot.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支持两种技术来和ES进行交互
 * 1、Jest（默认不生效）
 *  需要导入jest的工具包（io.searchbox.client.JestClient）
 * 2、SpringData ES[ES版本有可能不合适]
 *      版本适配说明：https://github.com/spring-projects/spring-data-elasticsearch
 *      如果版本不适配：
 *          1）、升级SpringBoot的版本
 *          2）、安装对应的ES
 *  1）、Client节点信息clusterNodes；clusterName
 *  2)、ElasticSearchTemplate
 *  3)、编写一个ElasticSearchRepository的子接口来操作ES
 *
 */
@SpringBootApplication
public class Spring03ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring03ElasticApplication.class, args);
    }
}
