# 문제
- 프로그래머스 H-Index
- https://programmers.co.kr/learn/courses/30/lessons/42747

# 풀이
H-INDEX는 H번 이상 인용된 논문이 H개 이상일 때, H의 최대 값을 구하는 문제이다.<br/>

내림차순 정렬을 통해 인덱스와 값을 비교한다. 인용수가 index보다 큰 경우 answer+1<br/>

 그 수가 index와 작거나 같아지는 순간 answer를 리턴해주면 된다.


# 코드
```c++
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
bool compare(int a, int b){
    return a > b;
}
int solution(vector<int> citations) {
    int answer= 0;
    sort(citations.begin(),citations.end(), compare);
    for(int i=0;i<citations.size();i++){
        if(citations[i] > i){
            answer += 1;
        }else{
            return answer;
        }
    }
}
```
