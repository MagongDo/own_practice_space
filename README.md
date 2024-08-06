package javaz.src.programus;

import java.util.HashSet;
import java.util.Set;

public class pokemon {
    public int solution(int[] nums) {
        int answer=0;
        int N = nums.length;
        // N/2 마리의 포켓몬을 선택할 수 있음
        int maxCount = N / 2;

        // 포켓몬 종류 번호를 저장하기 위한 집합(Set)을 생성
        Set<Integer> set = new HashSet<>();

        // 배열을 순회하면서 포켓몬의 종류 번호를 집합에 추가
        for (int num : nums) {
            set.add(num);
        }

        // 집합(set)에 저장된 포켓몬 종류의 개수를 확인
        int uniqueCount = set.size();
        answer=Math.min(uniqueCount, maxCount);
        // 선택할 수 있는 포켓몬 종류의 최대 개수(maxCount)와 실제 유니크한 종류 수 중 작은 값 반환
        return answer;
    }
       
}
