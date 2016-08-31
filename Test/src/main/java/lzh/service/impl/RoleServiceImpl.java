package lzh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lzh.dao.RoleMapper;
import lzh.model.Role;
import lzh.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	public RoleMapper roleMapper;

	public RoleMapper getRoleMapper() {
		return roleMapper;
	}
	@Autowired
	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	@Override
	public Role getRoleById(int id) {

		return roleMapper.selectByPrimaryKey(id);
	}

}
