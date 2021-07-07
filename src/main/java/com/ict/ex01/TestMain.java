package com.ict.ex01;

public class TestMain {
	public static void main(String[] args) {
		// Service service = new Service();
		// biz 안에 있는 dao.prn()에서 dao가 지정되지 않아서 오류 발생
		// service.biz();
		
		/*
		// 생성자를 이용하거나 setter를 이용해서 dao를 지정할 수 있다.
		OracleDAO oracleDAO = new OracleDAO();
		Service service = new Service(oracleDAO); // oracleDAO가 DAO를 상속받아서 선택이 가능
		service.biz();
		System.out.println("---------------------");
		
		// setter를 이용해서 dao를 지정
		MySQLDAO mySQLDAO = new MySQLDAO();
		Service service2 = new Service();
		service2.setDao(mySQLDAO);
		service2.biz();
		*/
		
		DAO dao = null;
		int su = 2; // su의 값에 따라 객체가 바뀜
		switch (su) {
		case 1: dao = new OracleDAO(); break;
		case 2: dao = new MySQLDAO(); break;
		}
		
		Service service = new Service(dao);
		service.biz();
		System.out.println("==================");
		
		Service service2 = new Service();
		service2.setDao(dao);
		service2.biz();
	}
}
