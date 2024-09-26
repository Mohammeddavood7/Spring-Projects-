package com.webproj.constant;
public interface QueryConstant {

  String INSERT = "insert into employee(empName,empAddress,empSal) values(?,?,?)";
  String UPDATE = "update employee set empName=?,empAddress=?,empSal=? where empId=?";
  String DELETE = "delete from employee where empId=?";
  String Get_ALL = "select *from employee";
  String Get_ONE = "select *from employee where empId = ?";
}
