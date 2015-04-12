package ht.tm.dev.chec.domain.utils;

public class DomainUtils {

	public static boolean isDotCom(String[] domain) {
		String suffix = domain[domain.length - 1];
		if (suffix.equalsIgnoreCase("com")) {
			return true;
		}
		return false;
	}
}
