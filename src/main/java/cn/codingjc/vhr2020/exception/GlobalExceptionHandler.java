package cn.codingjc.vhr2020.exception;

import cn.codingjc.vhr2020.model.RespBean;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * 全局异常处理
 * @author coding_jc
 * @date 2020/10/8
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public RespBean mySQLException(SQLException e){
         if(e instanceof MySQLIntegrityConstraintViolationException){
             return RespBean.error("该数据有关联数据，操作失败");
         }
         return RespBean.error("数据库操作异常，操作失败");
    }
}
