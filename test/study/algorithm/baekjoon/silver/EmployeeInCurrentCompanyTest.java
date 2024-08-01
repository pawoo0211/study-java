package study.algorithm.baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

@DisplayName("현재 회사에 있는 사람 테스트")
public class EmployeeInCurrentCompanyTest {

    @Test
    void case1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int repeatCount = Integer.parseInt(reader.readLine());

        // 1. 회사에 출, 퇴근한 사람 저장
        Map<String, Integer> enterCountMap = new HashMap<>();
        for (int count = 0; count < repeatCount; count++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
            String employee = tokenizer.nextToken();
            enterCountMap.put(employee, enterCountMap.getOrDefault(employee, 0) + 1);
        }

        // 출,퇴근 수가 2 이상인 사람 제거
        List<String> employeeInCurrentCompany = new ArrayList<>();
        for (String employee : enterCountMap.keySet()) {
            if (enterCountMap.get(employee) % 2 == 0) {
                employeeInCurrentCompany.add(employee);
            }
        }

        Collections.sort(employeeInCurrentCompany, Collections.reverseOrder());

        StringBuilder stringBuilder = new StringBuilder();
        for (String employee : employeeInCurrentCompany) {
            stringBuilder.append(employee + "\n");
        }

        System.out.println(stringBuilder);
    }
}