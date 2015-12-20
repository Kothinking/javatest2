package javatest;

import java.util.List;

public interface UsercenterInterface {

	int getUserBaseData(int userid);
	List<String> getUserPublish(int userid,int page,int flag);
	List<String> getUserFans(int userid);
}
