package com.aaa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author  liuniu 
 * @create 2023-05-23 11:01 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Texture implements Serializable {

	/**
	 * table name:id
	 * table type:int(11)
	 * table comment:电影材质表
	 */
    @TableId
	private Integer id;

	/**
	 * table name:tename
	 * table type:varchar(255)
	 * table comment:材质名称
	 */
	private String tename;

}
