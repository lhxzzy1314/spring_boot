package com.aaa.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import java.io.Serializable;

/**
 * @author  liuniu 
 * @create 2023-06-01 14:30 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author implements Serializable {

	/**
	 * table name:id
	 * table type:int(11)
	 * table comment:作者表
	 */
	private Integer id;

	/**
	 * table name:aname
	 * table type:varchar(255)
	 * table comment:作者名
	 */
	private String aname;

	/**
	 * table name:sex
	 * table type:varchar(255)
	 * table comment:性别
	 */
	private String sex;

	/**
	 * table name:head
	 * table type:varchar(255)
	 * table comment:照片
	 */
	private String head;

	/**
	 * table name:magnum
	 * table type:varchar(255)
	 * table comment:代表作品
	 */
	private String magnum;

	/**
	 * table name:abj
	 * table type:varchar(255)
	 * table comment:国家
	 */
	private String abj;

	/**
	 * table name:brief
	 * table type:varchar(10000)
	 * table comment:简介
	 */
	private String brief;

}
