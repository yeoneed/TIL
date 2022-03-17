# 📝 코딩테스트를 위한 파이썬 문법
## 1️⃣ 자료형
### 🔷수 자료형
: 숫자 자료형(정수형, 실수형), 코딩 테스트에서 대부분은 정수형을 다루는 문제가 출제됨
#### 1. 정수형
양의 정수, 음의 정수, 0, **코딩테스트에서 출제되는 알고리즘 문제 대부분이 입력과 출력 데이터가 정수형임**
#### 2. 실수형
변수에 소수점을 붙임 수를 대입하면 실수형 변수
**< 소수부가 0이거나 정수부가 0인 소수는 0을 생략하고 작성할 수 있다. >**
```
a= 5. 
print(a) #a = 5.0 출력
a= -.7
print(a) #a = -0.7 출력
```
#### 2-1. (실수형) 지수 표현
e다음에 오는 수는 10의 지수부를 의미한다.  
예) 1e9: 1 * 10의 9제곱 = INF(무한대)의미로 사용  
예2) 
```
a = 75.25e1 #75.25 * 10의 1제곱
print(a) #a=752.5
```
```
a= 3954e-3  #3954 * 10^(-3) 즉 곱하기 10의 -3제곱
print(a) # a= 3.954
```
#### 2-2. 컴퓨터는 실수를 정확히 표현하지 못한다. 
```
a = 0.3 + 0.6
print(a)

if a ==0.9:
	print(True) #True, False 는"" 안씌워줘도 출력됨
else:
	print(False)
```
=> 따라서 소수점 값을 비교하는 작업이 필요한 문제라면 실수 값을 비교하지 못해서 원하는 결과를 얻지 못할 수 있다.  
=> 이럴때 round()함수 사용  

**round 함수**  
```
round(123.456,2) #=> 소수점 2번째 자리까지 반올림(=세번째 자리에서 반올림)
round(123.456) #=>소수점 첫째자리까지 반올림
```
#### 3. 수 자료형의 연산 
/: 나누기  
//: 몫 구하기  
%: 나머지 구하기  
**: 거듭제곱 구하기 <code>x ** y </code>= x^y의 의미

### 🔷 리스트 자료형
: 파이썬 리스트 자료형은 내부적으로 '배열'을 채택, 연결리스트 자료구조 기능을 포함해서 **append(), remove()**등의 메서드를 지원한다. 

#### 1. 리스트 만들기
```
a= [1,2,3,4,5] #기본 형태
a = list() #빈 리스트 선언1
a = [] #빈 리스트 선언2
```
```
# 크기가 n이고 모든 값이 0인 1차원 리스트 초기화
n = 10
a = [0] * n
print(a)
```
#### 2. 리스트 인덱싱과 슬라이싱
1. 인덱싱: **인덱스값**(0부터 시작) 을 입력해 리스트의 **특정한 원소에 접근**하는 것
```
a = [1,2,3,4,5,6,7]
# 뒤에서 첫번째 원소 출력:
print(a[-1])

#뒤에서 세**번째** 원소 출력:
print(a[-3])

#네 **번째** 원소 값 변경:
a[3] = 7
print(a)
```  
  
2. 슬라이싱: [시작인덱스 : (끝인덱스-1) ] 형태

### 3. 리스트 컴프리핸션
= 리스트 초기화 하는 방법(긴 코드를 간략하게!)
```
#0부터 19까지의 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i%2==1]
print(array)
```

```
#1부터 9까지 수의 제곱값을 포함하는 리스트
array = [i * i for i in range(1,10)]
print(array)
```
```
# 2차원 리스트 초기화 할 때 매우 용이
# 예) nxm 크기의 2차원 리스트 초기화
n = 3
m = 4
array = [[0]*m for _ in range(n)]
```
=> <code>언더바 " _ " 사용 이유</code>: 단순 반복을 위해!(변수 i,j 이런거의 **값 무시하고** 그냥 간단한 반복을 수행할 때 사용)
```
#n*m 크기의 2차원 리스트 초기화(잘못된 방법)
n = 3
m = 4
array = [[0] * m] * n #n=3개의 동일한 리스트 생성
print(array)

array[1][1] = 5 #다 같은 객체에서 나온 3개의 자료이므로 array[][1]=5가 됨
print(array)
```
=> 다 같은 객체에서 나온 3개의 자료이므로 array[][1]=5가 되는 것 중요!

#### 4. 리스트 관련 기타 메소드
책 424p: 메소드 별 시간 복잡도 정리
```
#특정 인덱스에 데이터 추가
a.insert(2,3) #인덱스2에 값 3추가
```
```
#특정 값 세기
print("값이 3인 데이터 개수:", a.count(3))
```
```
#특정 값 제거
print("값 1인 데이터 제거(두개 이상이면 한개만 제거)", a.remove(1))
```
* insert(삽입 위치 인덱스, 삽입할 값) - 삽입 후 원소 위치 조정: O(N)
* append(삽입할 값) - O(1)
* count(값) - O(N)
* remove(값)- O(N) 원소 위치 조정 때문에

### 🔷문자열 자료형
#### 1. 문자열 초기화
" ' ' " 혹은 ' " " ' 혹은 \'  혹은 \"' (백슬래쉬 사용)
#### 2. 문자열 연산
```
a = "hello"
b = "world"
print(a + " " + b)
```
```
a = "string"
print(a*3) #string 3번 출력
```
```
a = "abcdef"
print(a[2:4])
```
#### 3. 튜플 자료형
- 튜플: 한번 선언된 값을 변경할 수 없다. 
-  리스트 대괄호 이용, 튜플은 소괄호()이용
- 튜플은 대입해서 변경 불가-> `a[7] =2` 이런거 **안됨**=> 값 변경하면 안되는 우선순위 큐에 사용
- 각 원소의 성질이 서로 다를 때 주로 사용-> 다익스트라 (비용, 노드 번호) 

#### 4. 사전 자료형
: 키와 값을 쌍으로 가지는 자료형  
변경 불가능 한 값= '키'  
key, value 구성-> 해시 테이블 사용해서 시간 복잡도 O(1)
```
data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'banana'
data['코코넛'] = 'coconut'
if '사과' in data:
	print("'사과'를 키로 가지는 데이터 존재")
```  
<br>
  
- 키/값만 뽑아서 **리스트로** 이용할 때
```
key_list = data.keys()
data_list = data.values()
```
<br>

- 각 키에 따른 값을 하나씩 출력
```
for key in key_list:
	print(data[key])
```
### 🔷집합 자료형
#### 1. 집합 자료형 소개
집합: 문자열 or 리스트 이용해서 생성 가능
- 집합 특징
	- 중복을 허용하지 않는다.
	- 순서가 없다. => 인덱싱으로 값을 얻을 수 없다. 
	- 키 존재 x, 값만 존재
	- 특정한 데이터가 이미 등장한 적이 있는지 여부 체크에 유리*(;검사 연산의 시간복잡도가 O(1)이기 때문에)*
	- set([])함수 혹은 { } 이용
```
data=set([1,2,3,4,5])
data = {1,2,3,4,5}
```
#### 2.  집합 자료형의 연산
- 합집합: |
- 교집합: &
- 차집합: -

#### 3. 집합 자료형 관련 함수
```
data= set([1,2,3]) #기본 집합
```

- add(): 새로운 원소 추가
```
data.add(4)
# {1,2,3,4} 
```
- update(): 여러 개의 값을 한꺼번에 추가
```
data.update([5,6]) # 여러개 추가할때는 리스트 []괄호를 사용하네!
# {1,2,3,4,5,6}
```
- remove(): 특정한 값 제거
```
data.remove(3)
# {1,2,4,5,6}
```
=> 모두 시간 복잡도 O(1): 왜? 인덱스 없어서 그런듯, 값에 바로 접근하고 기존 값들 위치 정렬할 필요가 없음
## 2️⃣ 조건문
### 🔷 비교 연산자
```
x>=y 
x<=y 
```
-> 등호 순서 주의! **두번째 오는 수 바로 옆에 = 붙임**
### 🔷 기타 연산자
- x in list: 리스트안에 x가 들어가 있을 때 true이다
- x not in 문자열: 문자열 안에 x가 들어가 있지 않을 때 true이다
- 조건문에서 pass 사용(아래 코드 o)
```
score = 90
if score>=90:
	pass # 나중에 작성할 소스코드
```
- 조건부 표현식(아래 코드 o)
```
score = 99
result = "success" if score>=80 else "Fail"
print(result)
```
```
a= [1,2,3,4,5,5,5]
remove_set = {3,5} 
result = [i for i in a if i not in remove_set]
print(result)
```
=> 조건 처리 할때는 리스트와 집합 혼용 가능함을 기억!

## 3️⃣ 반복문
### for 문
- for in 리스트/튜플/문자열 사용 가능
- for i in range(처음, 끝, 증감) 에서 `처음은 포함`, `끝은 불포함`, `증감은 마이너스여도 됨!`

## 4️⃣ 함수
: 동일한 알고리즘을 반복적으로 수행해야 할 때-> 함수 사용하면 매우 효율적: `왜?` 이거 안쓰면 매번 소스코드를 작성해야 하기 때문
```
# 함수 기본 형태
def 함수명(매개변수):
	실행할 소스코드
	return 반환값
# 매개변수, 반환값은 존재하지 않을수도 있다. 왜?
# 매개변수: main함수와 지정함수의 관계를 맺어주는 역할
# 반환값: 출력이 목적인 함수이면 없어도 됨
# return 기능: 값을 반환하거나 / 함수 빠져나가기
```
### 🔷 Global 변수 사용
: 함수 안에서 함수 밖의 데이터를 변경해야 하는 경우
```
a=0
def func():
	global a #전역변수 a에 대해 접근
	a+=1

for i in range(10): #0~9까지
	func() #함수 호출 

print(a)
```

### 🔷 람다 사용
: 함수를 더 간단하게 표현하는 방식
```
def add(a,b):
	return a+b
#일반적인 add 메소드 사용 시
print(add(3,7))

#람다 표현식으로 구현한 add() 메소드
print((lambda a,b:a+b)(3,7))
#즉 람다 입력 인자: 출력 값
```

## 5️⃣ 입출력
```
import sys
sys.stdin.readline().rstrip()
```
=> 파이썬에서 input()이 시간이 많이 걸리기 때문에 시간 조금 걸리는 입력이 위의 입력

```
# 출력할 변수들
a=1
b=2
print(a,b)
```

```
#출력시 오류코드가 발생하는 소스코드 예시
#문자와 숫자사이= 즉 형태 다른 애들끼리는 +로 연결할 수 없음
#=> int 형 숫자 변수를 str()씌워서 문자형태로 바꾸거나
answer = 7
print("정답은 " + str(answer) + "입니다.")

#콤마(,)로 구분
answer = 7
print("정답은" , answer, "입니다.")

#f-string 문법도 사용 가능
#f-string: 문자열 앞에 접두사 f를 붙임으로써 사용할 수 있고, {}안에 변수(예: answer) 넣어서 따로 형변환없이 여러 문자 형태들을 이어서 작성할 수 있다. 
answer = 7
print(f"정답은 {answer}입니다.")

```
## 6️⃣ 주요 라이브러리의 문법과 유의점
### 🔷 표준 라이브러리
: 특정한 프로그래밍 언어에서 **자주 사용되는** **표준 소스코드**를 미리 구현해놓은 라이브러리  
### 🔷 가장 중요한(많이 쓰이는) 라이브러리 6가지
- 내장 함수: print(), input(), sorted()
- itertools: 반복되는 형태의 데이터를 편하게 조작해보자! 요런 기능 제공하는 순열, 조합 라이브러리를 제공한다. 
- heapq: 힙 기능을 제공하는 라이브러리, ***우선순위 큐*** 기능을 구현하기 위해 사용한다. 
	- 우선순위 큐에서, 높은 우선순위를 가진 원소는 낮은 우선순위를 가진 원소보다 먼저 처리된다. 만약 두 원소가 같은 우선순위를 가진다면 그들은 큐에서 그들의 순서에 의해 처리된다.
- bisect: 이진 탐색 기능 제공
- collections: 덱, ***카운터*** 등의 유용한 자료구조를 포함하고 있는 라이브러리
```
#카운터 예제
from collections import Counter

Counter('hello world') # Counter({'l': 3, 'o': 2, 'h': 1, 'e': 1, ' ': 1, 'w': 1, 'r': 1, 'd': 1})
```
- math(): 필수적인 수학적 기능을 제공하는 라이브러리- 팩토리얼(!), 제곱근, 최대공약수, 삼각함수 관련 함수부터 pi와 같은 상수를 포함하고 있다. 

### 🔷 내장 함수
- **iterable 객체**: 리스트, 딕셔너리, 튜플 자료형처럼 반복 가능한 객체
	- [iterable객체 설명 링크](https://sangwoo0727.github.io/python/Python-6_IterableAndIterator/)
  
 - 내장 함수 종류: **sum(), min(), max(), sorted()**
	  - **eval:** 문자열 형태로 주어진 수식 반환
	```
	  result = eval("(3+5)*7")
	  print(result)
	```

- 특정한 기준에 따라 **sorted()** 정렬 수행 가능(lambda 이용)
```
result = sorted([('홍길동', 35), ('이순신', 75), ('아무개', 50)], key = lambda x:x[1], reverse=True)
#위 리스트를 정렬하는데, x[1]을 기준으로, 내림차순으로 정렬한다. 
print(result)
```

- iterable 객체는 기본으로 **sort()함수 내장**

```
data = [9,1,8,5,4]
data.sort()
print(data)
```
### 🔷itertools
:  파이썬에서 반복되는 데이터를 처리하는 기능을 포함하고 있는 라이브러리
1. **permutations:** 리스트/튜플/딕셔너리 같은 iterable 객체에서 **r개의** 데이터를 뽑아 일렬로 나열하는 **순서를 고려한 모든 경우 즉 순열을 계산**해주는 클래스
	```
	from itertools import permutations
	data = ['A', 'B', 'C'] #데이터 준비
	result = list(permutations(data, 3) #모든 경우의 수 구하기
	print(result)

	# 출력결과: ('A', 'B', 'C'), ('A', 'C', 'B'), ('B', 'A', 'C') 등등 순서를 고려한 모든 경우의 수 출력
	```
2. **combinations:**
: 리스트에서 r개의 데이터를 뽑아 순서를 고려하지 않고 나열하는 모든 **조합**을 계산
```
from itertools import combinations
data = ['A', 'B', 'C'] #데이터 준비
result = list(combinations(data,2)) #2개를 뽑는 모든 조합 구하기
print(result)
#(a,b), (a,c), (b,c) 이렇게 순서 상관없는 묶음만 생성
```
3.  **product:** iterable 객체에서 r개의 데이터를 뽑아 일렬로 나열하는 모든 경우(순열)을 계산하며, 원소를 **중복**하여 뽑는다. 
```
from itertools import product
data = ['A', 'B', 'C'] #데이터 준비
result = list(product(data, repeat=2)) #2개를 뽑는 모든 순열 구하기(중복 허용)
print(result)
#(a,a), (b,b), (a,c) 등등 중복을 포함, 순서 고려해서 뽑음
```
4. **combinations_with_replacement**: combinations 와 같은 iterable 객체에 서 r개의 데이터를 뽑는데, 중복(a,a)은 허용하지만 순서는 고려안함
```
from itertools import combinations_with_replacement

data = ['A', 'B', 'C'] #데이터 준비
result = list(combinations_with_replacement(data, 2)) #2개 뽑는데 중복 고려한 조합으로 뽑아라
print(result)
```
### 🔷heapq
: 힙 기능을 위해 heapq라이브러리 제공
- **힙:** 완전 이진 트리 형태로 최소 힙, 최대 힙이 존재 **(부모 노드와 자식 노드간에 일정한 관계가 성립)**, 우선순위 큐 기능 구현
	- 시간 복잡도: O(Nlog2N) = 완전 이진 트리인 힙 재정비 시간이 O(log2N)이고 요소 개수가 N개 이므로
	- `heapq.heappush()`: 원소 삽입
	- `heapq.heappop()`: 원소 삭제
	```
	import heapq	
	def heapsort(iterable):
	h =[]
	result=[]
	#모든 원소를 차례대로 힙에 삽입
	for value in iterable:
		heap.heappush(h,value)
	#힙에 삽입된 모든 원소 차례대로 꺼내서 담기
	for i in range(len(h)):
		result.append(heapq.heappop(h))
		return result
	result = heapsort([1,3,5,7,9,2,4,6,8,0])
	print(result)
	```
- 파이썬은 항상 **최소힙**만!=> 최대 힙을 구현하려면 원소의 부호를 임시로 변경하는 방식
	```
	import heapq
	def heapsort(iterable):
		h = []
		result = []
		#모든 원소 힙에 삽입
		for value in iterable:
			heap.push(h,-value) #음수 넣으면 제일 큰 값이 제일 작아지니까 최소 힙 루트에 들어감('-9'가)
		for i in range(len(h)):
			result.apppend(-heapq.heappop(h)) #-9부터 0까지 다시 음수 붙여서 출력: 9 8  7 6 ...
			return result
		totalresult = heapsort([1,3,5,7,9,2,4,6,8,0])
		print(totalresult)
	```
### 🔷bisect 라이브러리
:`정렬된 배열`에서 특정한 원소를 찾아야 할 때 매우 효과적  
1. `bisect_left(a,x)`: a:리스트에,  x:**값**을 넣을 수 있는 가장 왼쪽 **인덱스**를 찾는다. *(단, 정렬 순서 유지)*
2. `bisect_right(a,x)`: a:리스트에,  x:**값**을 넣을 수 있는 가장 오른쪽 **인덱스**를 찾는다. *(단, 정렬 순서 유지)*
```
	#예제
	from bisect import bisect_left, bisect_right
	a = [1,2,4,4,8]
	b = 4
	print(bisect_left(a,b)) #인덱스 2(인덱스 1의 2 다음에 들감)
	print(bisect_right(a,b)) #인덱스 4(인덱스 3의 4 다음에 들감)
```
3. 값이 어떤 **범위에 속하는 원소의 개수**를 구하고자 할 때도 효과적으로 사용될 수 있음
	```
	#예제: 값이 [left_value, right_value] 사이인 데이터의 개수를 반환하는 함수
	from bisect import bisect_left, bisect_right
	def count_by_range(x, left_value, right_value):
		left_idx = bisect_left(x,left_value)
		right_idx = bisect_right(x,right_value)
		return (right_idx - left_idx)
	a = [1,2,4,4,8]
	print(count_by_range(a,1,4)) #값이 1~4인 데이터 개수 출력
	```
### 🔷 collections 라이브러리
: **deque(큐/스택 구현)**, **Counter** 대표적
1. **deque:** 스택, 큐의 기능을 모두 포함한다.
	- **마지막** 원소 제거(**오른쪽)=pop()**이 기본, **첫번째** 원소를 제거하고 싶으면 **popleft()** 사용
	- **첫번째 인덱스**에 원소를 삽입: **appendleft(x)** 사용, **마지막** 인덱스 삽입: **append(x)**
	- 큐 자료구조로 쓸 때- 삽입: append(), 삭제: popleft() => 삽입 삭제 방향이 다르니까!
```
		from collections import deque
		data = deque([2,3,4])
		data.appendleft(1) #첫번째에 1 삽입
		data.append(5) #마지막에 5 삽입
		print(data) #얘 출력 시 deque([1,2,3,4,5])로 나옴
		print(list(data)) #리스트 자료형으로 변환
```
	
2. **Counter**: 원소별 등장 횟수 세는 기능, **딕셔너리** 기반
```
from collections import Counter
counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])
print(counter['blue'])
print(counter(['green'])
print(counter) #출력결과: Counter({'blue': 3, 'green': 1, 'red': 2})
print(dict(counter))
```

### 🔷 math 라이브러리: 수학적인 기능 포함

- 팩토리얼: `factorial(n)`
- 제곱근: `sqrt(n)` 
- 최대공약수: `gcd(a,b)` 등 실행
```
	import math
	print(math, factorial(5)) #제곱은은 sqrt(5), 최대공약수는 gcd(21,14) 요런식
```
- pi 랑 e도 쓸 수 있음
```
	import math
	print(math.pi)
	print(math.e)
```
