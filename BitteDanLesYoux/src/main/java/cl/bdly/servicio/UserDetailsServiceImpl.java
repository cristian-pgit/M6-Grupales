package cl.bdly.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cl.bdly.modelo.Usuario;
import cl.bdly.repositorio.UsuarioRepository;
import dl.bdly.dto.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userDao.findByUsername(username);
		if (user == null) {
	        throw new UsernameNotFoundException("Could not find user");
	    }
	         
	    return new MyUserDetails(user);
	}

}
