package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
class FirstDockerizeAppApplicationTests {
    static Logger logger= LoggerFactory.getLogger(App.class);

	@Test
	void contextLoads() {
        logger.error("#TEST Case Executing..");
        String str=null;
        String str2="1";
        String str3="1";
		assertNotNull("The car should be null", str);
		assertSame(str2, str3);
        logger.info("#TEST Case Executed!");
	}

}
