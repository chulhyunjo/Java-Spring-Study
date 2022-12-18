### 프로그래머스 연습문제

1. 자연수 뒤집어 배열로 만들기(lv.1)

```java
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> answer = new ArrayList();
        while (n>0) {
            Long tmp = n%10;
            int tmpint = tmp.intValue();
            answer.add(tmpint);
            n /= 10;
        }
        int[] ans = answer.stream().mapToInt(i->i).toArray();
        return ans;
    }
}
```

string 배열의 경우는 toArray로 간단하게 변환 가능하지만 int 배열의 경우는 위와 같이 변환해야함.


