package com.tman.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author haowanjin
 * @email haowanjin@foxmail.com
 * @date 2023-01-05 00:23:01
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
@TableId
private Long id;
	/**
	 * 
	 */
private Long branchId;
	/**
	 * 
	 */
private String xid;
	/**
	 * 
	 */
private String context;
	/**
	 * 
	 */
private String rollbackInfo;
	/**
	 * 
	 */
private Integer logStatus;
	/**
	 * 
	 */
private Date logCreated;
	/**
	 * 
	 */
private Date logModified;
	/**
	 * 
	 */
private String ext;

}
