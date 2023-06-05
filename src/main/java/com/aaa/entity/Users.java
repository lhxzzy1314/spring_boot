package com.aaa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author  liuniu 
 * @create 2023-05-29 22:50 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users implements Serializable, UserDetails {

	/**
	 * table name:uid
	 * table type:int(11)
	 * table comment:员工表
	 */
	@TableId
	private Integer uid;

	/**
	 * table name:name
	 * table type:varchar(255)
	 * table comment:员工姓名
	 */
	private String name;

	/**
	 * table name:sex
	 * table type:varchar(255)
	 * table comment:性别
	 */
	private String sex;

	/**
	 * table name:phone
	 * table type:varchar(255)
	 * table comment:手机号
	 */
	private String phone;

	/**
	 * table name:idcard
	 * table type:varchar(255)
	 * table comment:身份证号
	 */
	private String idcard;

	/**
	 * table name:site
	 * table type:varchar(255)
	 * table comment:地址
	 */
	private String site;

	/**
	 * table name:remarks
	 * table type:varchar(255)
	 * table comment:备注
	 */
	private String remarks;

	/**
	 * table name:entry
	 * table type:timestamp
	 * table comment:入职时间
	 */
	private Date entry;

	/**
	 * table name:dimission
	 * table type:timestamp
	 * table comment:离职时间
	 */
	private Date dimission;

	/**
	 * table name:head
	 * table type:varchar(255)
	 * table comment:头像
	 */
	private String head;

	/**
	 * table name:username
	 * table type:varchar(255)
	 * table comment:账号
	 */
	private String username;

	/**
	 * table name:password
	 * table type:varchar(255)
	 * table comment:密码
	 */
	private String password;

	/**
	 * table name:state
	 * table type:int(11)
	 * table comment:状态
	 */
	private Integer state;

	/**
	 * table name:rid
	 * table type:int(11)
	 * table comment:外键角色
	 */
	private Integer rid;

	/**
	 * table name:updateUid
	 * table type:int(11)
	 * table comment:最后一次修改人
	 */
	@TableField("updateUid")
	private Integer updateUid;

	/**
	 * table name:updateTime
	 * table type:timestamp
	 * table comment:最后一次修改时间
	 */
	@TableField("updateTime")
	private Date updateTime;

	// 角色权限
	@TableField(exist = false)
	private List<GrantedAuthority> authorities;

	/**
	 * 获取权限
	 *
	 * @return
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	/**
	 * 账户是否过期
	 *
	 * @return
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * 账户是否锁定
	 *
	 * @return
	 */
	@Override
	public boolean isAccountNonLocked() {
		return this.state != 2;
	}

	/**
	 * 凭证(密码)是否过期
	 *
	 * @return
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * 是否启用
	 *
	 * @return
	 */
	@Override
	public boolean isEnabled() {
		return this.state != 1;
	}
}
