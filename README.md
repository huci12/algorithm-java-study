# 🚀 Algorithm Java Study

[![Java](https://img.shields.io/badge/Java-11%2B-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![Gradle](https://img.shields.io/badge/Gradle-7%2B-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)

> 📚 알고리즘 문제 해결 능력 향상을 위한 개인 학습 프로젝트입니다.

## 📋 목차
- [프로젝트 소개](#-프로젝트-소개)
- [프로젝트 구조](#-프로젝트-구조)
- [해결한 문제들](#-해결한-문제들)
- [사용 기술](#-사용-기술)
- [시작하기](#-시작하기)
- [학습 기록](#-학습-기록)
- [향후 계획](#-향후-계획)

## 💡 프로젝트 소개

이 프로젝트는 다양한 알고리즘 문제들을 Java로 해결하며 문제 해결 능력을 향상시키기 위한 학습 공간입니다. HackerRank, Programmers 등 여러 플랫폼의 문제들을 체계적으로 정리하고 최적화된 솔루션을 구현하는 것을 목표로 합니다.

### 🎯 주요 목표
- 알고리즘 및 자료구조에 대한 깊은 이해
- 문제 해결 능력 향상
- 코드 최적화 기법 학습
- Clean Code 작성 연습

## 📁 프로젝트 구조

```
algorithm-java-study/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── study/
│                   ├── Main.java
│                   ├── hakerlank/
│                   │   ├── FizzBuzz.java
│                   │   ├── StringAnagram.java
│                   │   ├── UnexpectedDemand.java
│                   │   ├── MinimumAbsoluteDifferenceInAnArray.java
│                   │   ├── TwoStrings.java
│                   │   └── MarkAndToys.java
│                   └── programmers/
│                       └── (추가 예정)
├── build.gradle
├── settings.gradle
└── README.md
```

## 🏆 해결한 문제들

### HackerRank

#### 1. FizzBuzz
- **난이도**: 🟢 Easy
- **카테고리**: Implementation
- **핵심 개념**: 조건문, 반복문, 입출력 최적화
- **문제 설명**: 
  - 1부터 n까지의 숫자에 대해 특정 규칙에 따라 출력
  - 3과 5의 공배수는 "FizzBuzz", 3의 배수는 "Fizz", 5의 배수는 "Buzz" 출력
- **최적화 포인트**:
  - BufferedWriter를 사용한 입출력 성능 개선
  - StringBuilder를 활용한 문자열 연결 최적화

#### 2. String Anagram
- **난이도**: 🟡 Medium
- **카테고리**: Hash Table, String
- **핵심 개념**: 해시맵, 문자 빈도수 계산, 아나그램
- **문제 설명**: 
  - 주어진 사전(dictionary)에서 각 쿼리 문자열의 아나그램 개수를 찾기
  - 아나그램: 같은 문자들로 구성된 다른 순서의 문자열
- **최적화 포인트**:
  - 문자 빈도수 배열을 키로 사용하여 O(1) 검색 시간 달성
  - HashMap을 활용한 중복 계산 제거

#### 3. Unexpected Demand
- **난이도**: 🟢 Easy
- **카테고리**: Greedy Algorithm
- **핵심 개념**: 그리디 알고리즘, 정렬
- **문제 설명**: 
  - 제한된 위젯으로 최대한 많은 주문을 충족시키기
  - 각 주문은 완전히 충족되어야 함
- **최적화 포인트**:
  - 오름차순 정렬을 통한 그리디 접근
  - 작은 주문부터 처리하여 최대 주문 수 달성

#### 4. Minimum Absolute Difference in an Array
- **난이도**: 🟢 Easy
- **카테고리**: Sorting, Array
- **핵심 개념**: 정렬, 배열 순회
- **문제 설명**: 
  - 정수 배열에서 두 원소 간 절대값 차이의 최솟값 찾기
  - 예시: [3, -7, 0] → 최소 차이는 3 (3과 0의 차이)
- **해결 방법**:
  - 배열을 정렬 후 인접한 원소들의 차이만 비교
  - 정렬된 배열에서는 최소 차이가 항상 인접한 원소 사이에서 발생
- **학습 포인트**:
  - `List.of()`로 생성된 불변 리스트의 특성 이해
  - `int[]` 배열을 `List<Integer>`로 변환하는 다양한 방법
  - Stream API vs 전통적인 배열 처리 방식의 트레이드오프

#### 5. Two Strings
- **난이도**: 🟢 Easy
- **카테고리**: Hash Table, String
- **핵심 개념**: Set 자료구조, 문자 비교
- **문제 설명**: 
  - 두 문자열이 공통 부분 문자열을 가지는지 확인
  - 부분 문자열은 최소 한 글자도 가능
  - 예시: "hello"와 "world" → "YES" (공통 문자 'o', 'l' 존재)
- **해결 방법**:
  - 방법 1: HashSet을 사용한 O(n+m) 시간복잡도 솔루션
  - 방법 2: boolean 배열(26개)을 사용한 공간 효율적 솔루션
- **최적화 포인트**:
  - 첫 번째 문자열의 문자들을 Set에 저장
  - 두 번째 문자열 순회 중 공통 문자 발견 시 즉시 종료

#### 6. Mark and Toys
- **난이도**: 🟢 Easy
- **카테고리**: Greedy Algorithm, Sorting
- **핵심 개념**: 그리디 알고리즘, 정렬
- **문제 설명**: 
  - 제한된 예산으로 최대한 많은 장난감 구매
  - 각 장난감의 가격이 주어졌을 때 최대 구매 가능 개수 계산
  - 예시: 예산 50달러, 가격 [1, 12, 5, 111, 200, 1000, 10] → 4개 구매 가능
- **해결 방법**:
  - 가격을 오름차순으로 정렬
  - 저렴한 장난감부터 구매하여 최대 개수 달성
- **알고리즘 패턴**:
  - Unexpected Demand 문제와 유사한 그리디 접근법
  - 정렬 후 누적 합계가 예산을 초과하기 전까지 카운트

### Programmers
*(추가 예정)*

## 🛠 사용 기술

- **Language**: Java 11+
- **Build Tool**: Gradle 8.13
- **IDE**: IntelliJ IDEA
- **Version Control**: Git

## 🚀 시작하기

### Prerequisites
- JDK 11 이상
- IntelliJ IDEA (권장)
- Git

### 프로젝트 실행 방법

1. **저장소 클론**
   ```bash
   git clone https://github.com/[your-username]/algorithm-java-study.git
   cd algorithm-java-study
   ```

2. **IntelliJ IDEA에서 프로젝트 열기**
   - File → Open → 프로젝트 폴더 선택

3. **Gradle 빌드**
   ```bash
   ./gradlew build
   ```

4. **특정 문제 실행**
   - IntelliJ에서 원하는 클래스의 main 메소드 실행
   - 또는 터미널에서:
   ```bash
   ./gradlew run --args="[클래스명]"
   ```

## 📈 학습 기록

### 2025년 1월
- ✅ FizzBuzz 문제 해결 및 최적화
- ✅ String Anagram 문제 해결 (HashMap 활용)
- ✅ Unexpected Demand 문제 해결 (그리디 알고리즘)
- ✅ Minimum Absolute Difference in an Array 문제 해결 (정렬 활용)
- ✅ Two Strings 문제 해결 (Set 자료구조 활용)
- ✅ Mark and Toys 문제 해결 (그리디 알고리즘)

## 📅 향후 계획

### 단기 목표
- [ ] HackerRank 문제 수집 및 해결 노하우 공유
- [ ] Programmers 코딩테스트 고득점 Kit 완주
- [ ] 매일 최소 1문제씩 꾸준히 해결
- [ ] 각 문제에 대한 상세한 풀이 과정 문서화

### 중기 목표
- [ ] 자료구조별 문제 정리 (Array, LinkedList, Tree, Graph 등)
- [ ] 알고리즘별 문제 정리 (DP, DFS/BFS, Binary Search 등)
- [ ] 시간복잡도 & 공간복잡도 분석 추가

### 장기 목표
- [ ] 코딩 테스트 대비 종합 문제집 구성
- [ ] 문제 유형별 템플릿 코드 작성
- [ ] 개인 블로그에 문제 풀이 과정 포스팅

## 💬 Contact

궁금한 점이나 개선 사항이 있다면 언제든지 Issue를 남겨주세요!

---

<p align="center">
  <i>꾸준함이 실력을 만듭니다 💪</i>
</p>
