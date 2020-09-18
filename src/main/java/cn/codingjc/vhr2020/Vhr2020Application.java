package cn.codingjc.vhr2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.codingjc.vhr2020.mapper")
public class Vhr2020Application {

    public static void main(String[] args) {
        SpringApplication.run(Vhr2020Application.class, args);
    }

}
