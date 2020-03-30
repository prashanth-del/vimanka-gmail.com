package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {
	public static Logger log = LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		
		log.info("obj is present");
		log.info("test");
		log.error("obj is not present");
		log.fatal("blocker");
		log.debug("Debugging");
	}

}
