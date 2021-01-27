package com.aia.op;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class DataSourceTest {
	
	//@Autowired
	@Setter(onMethod_ = { @Autowired })
	//@Autowired
	private DataSource dataSource; 
	
	//@Autowired
	@Setter(onMethod_ = { @Autowired })
	private SqlSessionFactory sqlSessionFactory;
	
	
	@Test
	public void testMybatis() {
		
		try(
				SqlSession session = sqlSessionFactory.openSession(); 
				Connection con = session.getConnection(); ){
			
			log.info(session);
			log.info(con);
			
			System.out.println(session);
			System.out.println(con);
			
		} catch (Exception e) {
			fail(e.getMessage());
			//e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testConnection() {
		
		try(Connection con = dataSource.getConnection();){
			//log.info(con);
			System.out.println("!!!! Connection : " + con);
		} catch (Exception e ) {
			fail(e.getMessage());
		}
		
	}

}
