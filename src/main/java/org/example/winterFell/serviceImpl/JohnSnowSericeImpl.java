package org.example.winterFell.serviceImpl;

import org.example.winterFell.service.JohnSnowService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class JohnSnowSericeImpl implements JohnSnowService {

	public static final String VARIABLE_CHECK = "sfdsf";
	String Brother = "Robstark";
	String Sister = "Aryastark";
	private String variableCheck;


	public int familyChart() {
		String Siblings = Brother + Sister;
		int siblingsCount;
		Set<String> siblingsSet = new HashSet<>();
		siblingsSet.add(Brother);
		siblingsSet.add(Sister);
		siblingsCount = siblingsSet.size();
		int  siblingsCount2 = (int)siblingsSet.stream().count();
		Result result = new Result(siblingsCount, siblingsSet);
		variableCheck = VARIABLE_CHECK;
		extracted(result.siblingsSet(), variableCheck, Brother);
		System.out.println("JohnSnowSericeImpl.familyChart");
		return result.siblingsCount();
	}

	private record Result(int siblingsCount, Set<String> siblingsSet) {
	}

	private static void extracted(Set<String> siblingsSet, String variableCheck, String brother) {
		System.out.println(variableCheck);
		System.out.println("MS_DHONI");
		System.out.println("Brother = " + brother);
		System.out.println("siblingsSet = " + siblingsSet);
	}
}