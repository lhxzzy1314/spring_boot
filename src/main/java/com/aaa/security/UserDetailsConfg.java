package com.aaa.security;

import com.aaa.entity.Role;
import com.aaa.entity.Users;
import com.aaa.service.RoleService;
import com.aaa.service.UsersService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserDetailsConfg implements UserDetailsService {

    @Resource
    UsersService usersService;

    @Resource
    RoleService roleService;

    /**
     * 根据请求用户名获取正确的用户详细信息，判断用户状态，状态正常，再拿着正确的密码和表单提交的密码做对比(自动)
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) {
        System.out.println("============获取用户信息，验证用户身份:" + username + "============");
        Users user = usersService.getOne(new QueryWrapper<Users>().eq("username", username));
        if (null != user) {
            // 设置角色、权限
            /*List<String> roles = new ArrayList<>();// 查询角色
            List<String> roles = new ArrayList<>();// 查询权限
            List<GrantedAuthority> grantedAuthorities = new ArrayList();
            for (String role : roles) {
                grantedAuthorities.add(new SimpleGrantedAuthority(role));
            }*/
            //设置角色
            List<GrantedAuthority> authorityList=null;
            if (null!=user.getRid()){
                Role role = roleService.getOne(new QueryWrapper<Role>().eq("rid", user.getRid()));
                authorityList = AuthorityUtils.createAuthorityList(role.getAnnotation());
                user.setAuthorities(authorityList);
            }
            return user;
        } else {
           throw new UsernameNotFoundException("用户名找不到");
        }
    }

}
