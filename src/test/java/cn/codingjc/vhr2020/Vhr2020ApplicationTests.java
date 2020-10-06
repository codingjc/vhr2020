package cn.codingjc.vhr2020;

import cn.codingjc.vhr2020.model.Menu;
import cn.codingjc.vhr2020.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Vhr2020ApplicationTests {

    @Autowired
    MenuService menuService;

    @Test
    void contextLoads() {
        List<Menu> allMenusWithRoles = menuService.getAllMenusWithRoles();
        allMenusWithRoles.stream().forEach(System.out::println);
    }

}
