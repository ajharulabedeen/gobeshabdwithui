package org.gobeshona.service;

import org.gobeshona.model.User;
import org.gobeshona.repo.UserRepository;
import org.gobeshona.security.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by stephan on 20.03.16.
 */
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService
    {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
        {
        User user = userRepository.findByUsername(username);
        
        System.out.println(" Class Name :"+ JwtUserDetailsServiceImpl.class );
        if (user != null)
          {
            System.out.println("\n Not null :\n");
            System.out.println("Name : " + user.getUsername());
            System.out.println("Pass : " + user.getPassword());
            System.out.println("FName : " + user.getFirstname());
//            System.out.println("LName : " + user.getLastname());
            System.out.println("AName : " + user.getAuthorities().toString());
          }
        
        if (user == null)
          {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
          }
        else
          {
            return JwtUserFactory.create(user);
          }
        }
    }
