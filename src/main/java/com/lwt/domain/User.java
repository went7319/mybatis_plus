package com.lwt.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data//自动生成get、set、toString方法和无参构造方法
@TableName("student")//实体类与数据库的表构建映射关系
public class User extends Model<User> {//实现user对象直接调用sql语句进行操作
    @TableId(type = IdType.AUTO)//设置id根据数据库自增长，默认为雪花算法算出来的id写入到数据库
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    @TableField(value = "deleted")//设置表中字段名称deleted
    @TableLogic(value = "0",delval = "1")
    private Integer logicDelete;
    @Version
    private Integer version;
}
