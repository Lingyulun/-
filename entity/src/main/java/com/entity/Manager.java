package com.entity;

import lombok.Data;

/**
 * @author 挥霍的人生
 * 管理员表实体类
 */
@Data
public class Manager {
  private int MId;// 编号
  private String Mname;//姓名
  private String  Mphone;//电话
  private String Maddress;//地址
  private String Menabled;//权限
  private String Musername;//用户名
  private String  Mpasseord;//密码
  private String  Mremark;//备注
}
