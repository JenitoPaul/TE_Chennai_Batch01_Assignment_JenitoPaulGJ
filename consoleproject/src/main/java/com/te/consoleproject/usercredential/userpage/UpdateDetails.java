package com.te.consoleproject.usercredential.userpage;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Query;
import com.te.consoleproject.endurance.Existence;

public class UpdateDetails extends Existence {
	SimpleDateFormat dateFormat =  new SimpleDateFormat("dd-MM-yyyy");
	public void update(int pass) {
		try {
			et.begin();
		
			String update = "update PrimaryInfo set  role=:na,hiredate=:date,"
					+ "sal=:sal,deptno=:deptno,deptname=:deptname,"
					+ "commission=:comm,empno=:empno where password =:pass";
			Query query = em.createQuery(update);
//			info.setEmpname(name);
//			info.setEmail(gmail);
//			info.setMobilenumber(mob);
//			info.setPassword(pas1);
			query.setParameter("pass", pass);
			System.out.println("Enter Name ");
			System.out.println("Enter Gmail Address "); 
			System.out.println("Enter Mobile No");
			
			System.out.println("1. enter role");
			query.setParameter("na", scanner.next());
			System.out.println("2. enter hiredate Like 'DD-MM-YYY'");
			query.setParameter("date", dateFormat.parse((scanner.next())));
			System.out.println("3. enter Salary");
			query.setParameter("sal", scanner.nextDouble());
			System.out.println("4. enter dept no");
			query.setParameter("deptno", scanner.nextInt());
			System.out.println("5. enter dept name");
			query.setParameter("deptname", scanner.next());
			System.out.println("6. enter commission");
			query.setParameter("comm", scanner.nextDouble());
			System.out.println("7. enter emp no");
			query.setParameter("empno", scanner.nextInt());

			int res = query.executeUpdate();
			if(res==1) {
			System.out.println("Updated Sucessfull");
			}
			et.commit();
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
