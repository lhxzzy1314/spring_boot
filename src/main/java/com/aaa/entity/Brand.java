package com.aaa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import java.io.Serializable;

/**
 * @author  liuniu 
 * @create 2023-06-01 14:20 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Brand implements Serializable {

	/**
	 * table name:id
	 * table type:int(11)
	 * table comment:电影品牌表
	 */
	@TableId
	private Integer id;

	/**
	 * table name:bname
	 * table type:varchar(255)
	 * table comment:品牌名字
	 */
	private String bname;

	/**
	 * table name:company
	 * table type:varchar(255)
	 * table comment:所属公司
	 */
	private String company;

	/**
	 * table name:headstream
	 * table type:varchar(255)
	 * table comment:品牌发源地
	 */
	private String headstream;

	/**
	 * table name:contact
	 * table type:varchar(255)
	 * table comment:联系电话
	 */
	private String contact;

	/**
	 * table name:the
	 * table type:varchar(255)
	 * table comment:负责人
	 */
	private String the;

}
