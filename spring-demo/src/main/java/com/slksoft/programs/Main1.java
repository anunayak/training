package com.slksoft.programs;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.slksoft.cfg.AppConfig1;
import com.slksoft.cfg.AppConfig2;
import com.slksoft.cfg.AppConfig3;
import com.slksoft.dao.UserDao;

public class Main1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx;
		Logger log =Logger.getLogger("Main1");
		ctx=new AnnotationConfigApplicationContext(AppConfig3.class);
		log.info("-------- Spring Container Ready");
		UserDao dao=ctx.getBean("jdbcDao",UserDao.class);
		
		
		
		int c=dao.count();
		log.info(String.format("There are %d users", c));
		
		
		ctx.close();
	}

}
