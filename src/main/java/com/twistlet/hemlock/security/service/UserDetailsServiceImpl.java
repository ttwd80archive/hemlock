package com.twistlet.hemlock.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.twistlet.hemlock.model.entity.HemlockRole;
import com.twistlet.hemlock.model.entity.HemlockUser;
import com.twistlet.hemlock.model.entity.HemlockUserRole;
import com.twistlet.hemlock.model.repository.HemlockUserRepository;
import com.twistlet.hemlock.model.repository.HemlockUserRoleRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	private final HemlockUserRepository hemlockUserRepository;
	private final HemlockUserRoleRepository hemlockUserRoleRepository;

	@Autowired
	public UserDetailsServiceImpl(final HemlockUserRepository hemlockUserRepository,
			final HemlockUserRoleRepository hemlockUserRoleRepository) {
		this.hemlockUserRepository = hemlockUserRepository;
		this.hemlockUserRoleRepository = hemlockUserRoleRepository;
	}

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		final HemlockUser hemlockUser = hemlockUserRepository.findOne(username);
		if (hemlockUser == null) {
			throw new UsernameNotFoundException("Username " + username + " not found");
		}
		final List<HemlockUserRole> list = hemlockUserRoleRepository.findByHemlockUserUsername(username);
		final List<GrantedAuthority> authorities = new ArrayList<>();
		for (final HemlockUserRole hemlockUserRole : list) {
			final HemlockRole hemlockRole = hemlockUserRole.getHemlockRole();
			final GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(hemlockRole.getRoleName());
			authorities.add(grantedAuthority);
		}
		return new InternalUser(username, hemlockUser.getName(), hemlockUser.getPassword(), authorities);
	}

	public class InternalUser extends User {
		private static final long serialVersionUID = -4446704583952926077L;
		private final String name;

		public InternalUser(final String username, final String name, final String password,
				final Collection<? extends GrantedAuthority> authorities) {
			super(username, password, authorities);
			this.name = name;
		}

		public String getName() {
			return name;
		}

	}
}
