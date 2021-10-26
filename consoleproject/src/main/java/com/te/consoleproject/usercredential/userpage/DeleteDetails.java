package com.te.consoleproject.usercredential.userpage;

import com.te.consoleproject.beans.PrimaryInfo;
import com.te.consoleproject.endurance.Existence;

public class DeleteDetails extends Existence {
	void delete(int a) {
	
		et.begin();
		PrimaryInfo info = em.find(PrimaryInfo.class, a);
		em.remove(info);
		et.commit();
		System.out.println("Deleted Successfully");
	}
}