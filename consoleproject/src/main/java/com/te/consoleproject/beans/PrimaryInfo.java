package com.te.consoleproject.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "emplprimaryinfo")
@Entity
@Data
public class PrimaryInfo implements Serializable{

	public PrimaryInfo(){
		super();
	}
	@Id
	@Column
	private Integer password;
	@Column
	private String empname;
	@Column(name="mobile")
	private Long mobilenumber;
	@Column
	private String role;
	@Column
	private Date hiredate;
	@Column(name="salary")
	private Double sal;
	@Column
	private  Integer deptno;
	@Column
	private String deptname;
	@Column(name="comm")
	private Double commission;
	@Column
	private String email;
	@Column
	private Integer empno;

	
}
