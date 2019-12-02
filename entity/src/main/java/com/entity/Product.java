package com.entity;

import lombok.Data;

import java.math.BigDecimal;
/**
 * @author 挥霍的人生
 */
@Data
public class Product {
    private int pId;
    private String pName;
    private String pType;
    private String parameter;
    private BigDecimal pSalary;
}
