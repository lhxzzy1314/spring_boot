package com.aaa.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import java.io.Serializable;

/**
 * @author  liuniu 
 * @create 2023-06-01 14:03 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Type implements Serializable {

	/**
	 * table name:tid
	 * table type:int(11)
	 * table comment:电影类型表
	 */
	private Integer tid;

	/**
	 * table name:tname
	 * table type:varchar(255)
	 * table comment:类型名称
	 */
	private String tname;

	/**
	 * table name:parent
	 * table type:int(11)
	 * table comment:类型分级
	 */
	private Integer parent;

	/**
	 * table name:url
	 * table type:varchar(255)
	 * table comment:路径
	 */
	private String url;

	/**
	 * table name:remark
	 * table type:varchar(255)
	 * table comment:备注
	 */
	private String remark;

	/**
	 * table name:state
	 * table type:int(255)
	 * table comment:状态
	 */
	private Integer state;

}
