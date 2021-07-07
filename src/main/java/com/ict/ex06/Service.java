package com.ict.ex06;

public class Service {
	private DAO dao;
	public Service(){
		System.out.println("서비스 생성자");
	}
	
	// DAO를 받는 생성자
	public Service(DAO dao) {
		super();
		this.dao = dao;
		System.out.println("서비스 생성자");
	}

	// setter
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	// 실행하고 싶은 메소드
	public void biz() {
		// dao가 뭔지 지정이 안되어있음
		dao.prn();
	}

}
