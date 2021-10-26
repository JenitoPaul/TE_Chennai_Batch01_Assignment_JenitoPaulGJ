package com.te.consoleproject.usercredential.userpage;

import com.te.consoleproject.beans.PrimaryInfo;
import com.te.consoleproject.endurance.Existence;

public class ViewDetails extends Existence   {

	void view(int a) {
		PrimaryInfo info = em.getReference
				(PrimaryInfo.class, a);
		if(info != null) {
			System.out.println("Employee Name 	: "+info.getEmpname());
			System.out.println("Email-ID	: "+info.getEmail());
			System.out.println("Mobile Number	: "+info.getMobilenumber());
			System.out.println("HiredDate	: "+info.getHiredate());
			System.out.println("Role		: "+info.getRole());
			System.out.println("Salary/Month	: "+info.getSal());
			System.out.println("Commission	: "+info.getCommission());
			System.out.println("Department Name	: "+info.getDeptname());
			System.out.println("Department No	: "+info.getDeptno());
		}
	}
}
