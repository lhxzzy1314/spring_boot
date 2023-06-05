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
public class Publisher implements Serializable {

	/**
	 * table name:id
	 * table type:int(11)
	 * table comment:电影出版社表
	 */
	private Integer id;

	/**
	 * table name:pname
	 * table type:varchar(255)
	 * table comment:出版社名字
	 */
	private String pname;

	/**
	 * table name:site
	 * table type:varchar(255)
	 * table comment:出版社地址
	 */
	private String site;

	/**
	 * table name:contact
	 * table type:varchar(255)
	 * table comment:联系人
	 */
	private String contact;

	/**
	 * table name:the
	 * table type:varchar(255)
	 * table comment:负责人
	 */
	private String the;

}
