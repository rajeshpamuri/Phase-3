package com.project.SpringSecurity.entities;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class MyUserDetails implements UserDetails{
private static final long serialVersionUID = 1L;
private String userName;
private String password;
public MyUserDetails() {
}
public MyUserDetails(User user) {
this.userName = user.getName();
this.password = user.getPassword();
}
@Override
public Collection<? extends GrantedAuthority>getAuthorities() {
return null;
}
@Override
public String getPassword() {
return password;
}
@Override
public String getUsername() {
return userName;
}
@Override
public booleanisAccountNonExpired() {
return true;
}
@Override
public booleanisAccountNonLocked() {
return true;
}
@Override
public booleanisCredentialsNonExpired() {
return true;
}
@Override
public booleanisEnabled() {
return true;
}
}