    
package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="F_ROLE")
public class Role {
    
    @Id
    @SequenceGenerator(name="ROLE_SEQ_GEN", sequenceName="ROLE_SEQ", allocationSize=1)
    @GeneratedValue(generator="ROLE_SEQ_GEN", strategy=GenerationType.SEQUENCE)
    private int roleId;
    
    @Column(nullable=false)
    private int roleType;
    
    public Role () {}

    public Role(int roleId, int roleType) {
        super();
        this.roleId = roleId;
        this.roleType = roleType;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "Role [roleId=" + roleId + ", roleType=" + roleType + "]";
    }
    
    

}
