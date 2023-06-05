package com.aaa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import java.io.Serializable;

/**
 * @author  liuniu 
 * @create 2023-05-23 15:43 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role implements Serializable {

	/**
	 * table name:rid
	 * table type:int(11)
	 * table comment:职位表
	 */
	@TableId
	private Integer rid;

	/**
	 * table name:rname
	 * table type:varchar(255)
	 * table comment:职位名称
	 */
	private String rname;

	/**
	 * table name:annotation
	 * table type:varchar(255)
	 * table comment:备注
	 */
	private String annotation;

	/**
	 * table name:state
	 * table type:varchar(255)
	 * table comment:状态
	 */
	private String state;

}
