package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Theme {
    @Id
    @SequenceGenerator(name="THEME_SEQ_GEN", sequenceName="THEME_SEQ", allocationSize=1)
    @GeneratedValue(generator="THEME_SEQ_GEN", strategy=GenerationType.SEQUENCE)
    private int themeId;
    
    @Column(nullable=false)
    private int themeType;
    
    public Theme(){}

    public Theme(int themeId, int themeType) {
        super();
        this.themeId = themeId;
        this.themeType = themeType;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public int getThemeType() {
        return themeType;
    }

    public void setThemeType(int themeType) {
        this.themeType = themeType;
    }

    @Override
    public String toString() {
        return "Theme [themeId=" + themeId + ", themeType=" + themeType + "]";
    }
    
    
}
