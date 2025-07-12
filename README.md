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
│                   │   └── UnexpectedDemand.java
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

## 📅 향후 계획

### 단기 목표
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
