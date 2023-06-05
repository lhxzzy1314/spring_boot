package com.aaa.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import java.io.Serializable;

/**
 * @author  liuniu 
 * @create 2023-05-24 15:39 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleMenu implements Serializable {

	/**
	 * table name:id
	 * table type:int(11)
	 * table comment:权限表
	 */
	private Integer id;

	/**
	 * table name:rid
	 * table type:int(11)
	 * table comment:外键role
	 */
	private Integer rid;

	/**
	 * table name:mid
	 * table type:int(11)
	 * table comment:外键menu
	 */
	private Integer mid;

}
