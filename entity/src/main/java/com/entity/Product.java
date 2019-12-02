package com.entity;

import lombok.Data;

import java.math.BigDecimal;
/**
 * @author 挥霍的人生
 */
@Data
public class Product {
    private int pId;//编号
    private String pName;//名字
    private String pDesc;//介绍
    private String pImage;//图片
    private int pTid;//类型
    private BigDecimal pSalary;//价格
    private int pCount;//数量
}
