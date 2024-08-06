

    
     
        import java.util.HashSet;
        import java.util.Set;
        public int solution(int[] nums){
          int answer=0;
          int N=nums.length;
          int maCount=N/2;
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
       

