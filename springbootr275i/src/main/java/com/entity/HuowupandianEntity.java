package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 货物盘点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 08:50:09
 */
@TableName("huowupandian")
public class HuowupandianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuowupandianEntity() {
		
	}
	
	public HuowupandianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 盘点日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pandianriqi;
	
	/**
	 * 商品编号
	 */
					
	private String shangpinbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 生产地
	 */
					
	private String shengchandi;
	
	/**
	 * 商品分类
	 */
					
	private String shangpinfenlei;
	
	/**
	 * 盘点数量
	 */
					
	private String pandianshuliang;
	
	/**
	 * 盘点情况
	 */
					
	private String pandianqingkuang;
	
	/**
	 * 盘点备注
	 */
					
	private String pandianbeizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：盘点日期
	 */
	public void setPandianriqi(Date pandianriqi) {
		this.pandianriqi = pandianriqi;
	}
	/**
	 * 获取：盘点日期
	 */
	public Date getPandianriqi() {
		return pandianriqi;
	}
	/**
	 * 设置：商品编号
	 */
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：生产地
	 */
	public void setShengchandi(String shengchandi) {
		this.shengchandi = shengchandi;
	}
	/**
	 * 获取：生产地
	 */
	public String getShengchandi() {
		return shengchandi;
	}
	/**
	 * 设置：商品分类
	 */
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
	/**
	 * 设置：盘点数量
	 */
	public void setPandianshuliang(String pandianshuliang) {
		this.pandianshuliang = pandianshuliang;
	}
	/**
	 * 获取：盘点数量
	 */
	public String getPandianshuliang() {
		return pandianshuliang;
	}
	/**
	 * 设置：盘点情况
	 */
	public void setPandianqingkuang(String pandianqingkuang) {
		this.pandianqingkuang = pandianqingkuang;
	}
	/**
	 * 获取：盘点情况
	 */
	public String getPandianqingkuang() {
		return pandianqingkuang;
	}
	/**
	 * 设置：盘点备注
	 */
	public void setPandianbeizhu(String pandianbeizhu) {
		this.pandianbeizhu = pandianbeizhu;
	}
	/**
	 * 获取：盘点备注
	 */
	public String getPandianbeizhu() {
		return pandianbeizhu;
	}

}
