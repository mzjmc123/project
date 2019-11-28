package cn.mzjmc.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages =  {"cn.mzjmc.project.mapper"})
public class ProjectApplication {

    public static void main(String[] args) {
        //System.out.printf("Hello world");
        SpringApplication.run(ProjectApplication.class, args);
    }



}
