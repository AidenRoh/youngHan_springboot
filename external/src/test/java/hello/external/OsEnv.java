package hello.external;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsEnv {

	public static void main(String[] args) {
		Map<String, String> envMap = System.getenv();
		for (String key : envMap.keySet()) {
			log.info("env {}={}",key, System.getenv(key));
		}
	}

	//Os 환경 변수로 서버 구분하기
	//DBURL = dev.db.com / DBURL=prod.db.com 와 같이 설정하여
	String dburl = System.getenv("DBURL"); // 다음과 같이 활용할 수 있을 것이다.
}
