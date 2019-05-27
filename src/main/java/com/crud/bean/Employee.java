package com.crud.bean;

public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Integer dId;
    
    private Department department;
    
    //查询员工的同时带上部门

    

	public Integer getEmpId() {
        return empId;
    }

    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
    
    public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", gender=" + gender + ", email=" + email + ", dId=" + dId
				+ "]";
	}

	public Employee() {
		super();
	}
	
	public Employee(Integer empId, String empName, String gender, String email,
			Integer dId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.email = email;
		this.dId = dId;
	}

 
}