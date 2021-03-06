package lk.dialog.corporate.Qr.data;
// Generated Sep 3, 2012 11:08:46 AM by Hibernate Tools 3.2.1.GA

import java.io.Serializable;
import org.springframework.stereotype.Component;




/**
 * RolePrivilege generated by hbm2java
 */
@Component
public class RolePrivilege  implements Serializable {


     private Integer rolePrivilegeId;
     private Role role;
     private Privileges privileges;

    public RolePrivilege() {
    }

    public RolePrivilege(Role role, Privileges privileges) {
       this.role = role;
       this.privileges = privileges;
    }
   
    public Integer getRolePrivilegeId() {
        return this.rolePrivilegeId;
    }
    
    public void setRolePrivilegeId(Integer rolePrivilegeId) {
        this.rolePrivilegeId = rolePrivilegeId;
    }
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    public Privileges getPrivileges() {
        return this.privileges;
    }
    
    public void setPrivileges(Privileges privileges) {
        this.privileges = privileges;
    }




}


