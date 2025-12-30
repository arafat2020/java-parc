# 🚀 Java DSA & Problem Solving Practice

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue.svg)](https://maven.apache.org/)
[![LeetCode](https://img.shields.io/badge/LeetCode-Solutions-yellow.svg)](https://leetcode.com/)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)

A comprehensive collection of **Data Structures & Algorithms** implementations and **LeetCode problem solutions** in Java. This repository demonstrates proficiency in algorithmic thinking, problem-solving, and clean code practices.

## 📋 Table of Contents

- [About](#-about)
- [Problem Categories](#-problem-categories)
- [Algorithms Implemented](#-algorithms-implemented)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Solutions Overview](#-solutions-overview)
- [Tech Stack](#-tech-stack)
- [Learning Resources](#-learning-resources)
- [Contributing](#-contributing)

## 🎯 About

This repository serves as a **personal learning journey** and **portfolio showcase** for mastering data structures and algorithms using Java. Each solution is crafted with:

- ✅ **Clean, readable code** with proper naming conventions
- ✅ **Optimized algorithms** focusing on time and space complexity
- ✅ **Well-documented solutions** with comments explaining key logic
- ✅ **Multiple approaches** (brute force to optimal) where applicable
- ✅ **Working test cases** in main methods for verification

## 📊 Problem Categories

### Arrays & Strings

- **Three Sum** - Finding triplets that sum to zero
- **Group Anagrams** - Grouping strings by anagram patterns
- **Longest Substring** - Finding longest substring without repeating characters
- **Container With Most Water** - Two-pointer optimization problem
- **Median of Two Sorted Arrays** - Binary search on sorted arrays
- **Merge Two Sorted Arrays** - In-place merging technique

### Linked Lists

- **Reverse Linked List** - Iterative and recursive approaches
- **Add Two Numbers** - Arithmetic operations on linked lists

### Hash Tables & Sets

- **Single Number** - Bit manipulation and hash set techniques
- **Missing Number** - Mathematical approach to find missing element
- **Remove Duplicates II** - Frequency-based duplicate removal

### Graphs & BFS/DFS

- **Rotting Oranges** - Multi-source BFS problem
- **Word Search** - Backtracking and DFS on 2D grid

### Backtracking & Recursion

- **Combination Sum** - Finding all combinations that sum to target

### Greedy & Dynamic Programming

- **Best Price** - Optimization problem
- **Coin Change II** - DP solution for number of ways
- **Last Stone Weight** - Heap-based simulation

### Mathematical Problems

- **Lucky Number** - Number theory and pattern recognition

## 🔧 Algorithms Implemented

### Sorting Algorithms

| Algorithm          | Time Complexity | Space Complexity | Implementation                                                 |
| ------------------ | --------------- | ---------------- | -------------------------------------------------------------- |
| **Bubble Sort**    | O(n²)           | O(1)             | [BubbleSort.java](src/main/java/com/dsa/BubbleSort.java)       |
| **Selection Sort** | O(n²)           | O(1)             | [SelectionSort.java](src/main/java/com/dsa/SelectionSort.java) |
| **Quick Sort**     | O(n log n) avg  | O(log n)         | [QuickSort.java](src/main/java/com/dsa/QuickSort.java)         |

### Key Features:

- **Optimized Bubble Sort** with early termination for sorted arrays
- **Hoare's Partition Scheme** in Quick Sort for better performance
- Detailed comments explaining algorithm logic

## 📁 Project Structure

```
java-practice/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               ├── dsa/              # Core DSA implementations
│               │   ├── BubbleSort.java
│               │   ├── SelectionSort.java
│               │   └── QuickSort.java
│               └── practice/         # LeetCode-style problems
│                   ├── ThreeSum.java
│                   ├── GroupAnagram.java
│                   ├── MedianOfTwoSortedArray.java
│                   ├── RottingOrange.java
│                   ├── CombinationSum.java
│                   ├── WordSearch.java
│                   └── ... (15+ more solutions)
├── pom.xml                          # Maven configuration
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- **Java 17** or higher
- **Maven 3.x**
- IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Clone the Repository

```bash
git clone https://github.com/arafat2020/java-parc.git
cd java-parc
```

### Build the Project

```bash
mvn clean compile
```

### Run Individual Solutions

Each solution has a `main` method for testing:

```bash
# Example: Run Quick Sort
mvn exec:java -Dexec.mainClass="com.dsa.QuickSort"

# Example: Run Three Sum
mvn exec:java -Dexec.mainClass="com.practice.ThreeSum"
```

Or use your IDE to run individual files directly.

## 💡 Solutions Overview

### Featured Solutions

#### 🔹 Three Sum (LeetCode #15)

**Problem:** Find all unique triplets that sum to zero.  
**Approach:** Two-pointer technique with duplicate handling  
**Complexity:** O(n²) time, O(1) space  
**File:** [ThreeSum.java](src/main/java/com/practice/ThreeSum.java)

#### 🔹 Group Anagrams (LeetCode #49)

**Problem:** Group strings that are anagrams of each other.  
**Approach:** HashMap with sorted string as key  
**Complexity:** O(n \* k log k) time, O(n) space  
**File:** [GroupAnagram.java](src/main/java/com/practice/GroupAnagram.java)

#### 🔹 Median of Two Sorted Arrays (LeetCode #4)

**Problem:** Find median of two sorted arrays.  
**Approach:** Two-pointer merge technique (optimized)  
**Complexity:** O(m + n) time, O(1) space  
**File:** [MedianOfTwoSortedArray.java](src/main/java/com/practice/MedianOfTwoSortedArray.java)

#### 🔹 Quick Sort

**Implementation:** Hoare's partition scheme  
**Optimization:** In-place sorting with divide-and-conquer  
**Complexity:** O(n log n) average, O(n²) worst case  
**File:** [QuickSort.java](src/main/java/com/dsa/QuickSort.java)

#### 🔹 Rotting Oranges (LeetCode #994)

**Problem:** Find minimum time to rot all oranges in grid.
**Approach:** Breadth-First Search (BFS) with level-order traversal
**Complexity:** O(m * n) time, O(m * n) space
**File:** [RottingOrange.java](src/main/java/com/practice/RottingOrange.java)

### Complete Problem List

| #   | Problem                     | Difficulty | Topics           | File                                                                                  |
| --- | --------------------------- | ---------- | ---------------- | ------------------------------------------------------------------------------------- |
| 1   | Add Two Numbers             | Medium     | Linked List      | [AddTowNumber.java](src/main/java/com/practice/AddTowNumber.java)                     |
| 2   | Best Price                  | Medium     | Greedy/DP        | [BestPrice.java](src/main/java/com/practice/BestPrice.java)                           |
| 3   | Combination Sum             | Medium     | Backtracking     | [CombinationSum.java](src/main/java/com/practice/CombinationSum.java)                 |
| 4   | Group Anagrams              | Medium     | Hash Table       | [GroupAnagram.java](src/main/java/com/practice/GroupAnagram.java)                     |
| 5   | Last Stone Weight           | Easy       | Heap             | [LastStoneWeight.java](src/main/java/com/practice/LastStoneWeight.java)               |
| 6   | Longest Palindromic Substring | Medium     | String/Two Pointers | [LongestPalindromicSubstring.java](src/main/java/com/practice/LongestPalindromicSubstring.java) |
| 7   | Longest Substring           | Medium     | Sliding Window   | [LongestSubString.java](src/main/java/com/practice/LongestSubString.java)             |
| 8   | Lucky Number                | Easy       | Math             | [LuckyNumber.java](src/main/java/com/practice/LuckyNumber.java)                       |
| 9   | Median of Two Sorted Arrays | Hard       | Binary Search    | [MedianOfTwoSortedArray.java](src/main/java/com/practice/MedianOfTwoSortedArray.java) |
| 10  | Merge Two Sorted Arrays     | Easy       | Two Pointers     | [MergeTwoSortedArray.java](src/main/java/com/practice/MergeTwoSortedArray.java)       |
| 11  | Missing Number              | Easy       | Math/Bit         | [MissingNumber.java](src/main/java/com/practice/MissingNumber.java)                   |
| 12  | Remove Duplicates II        | Medium     | Array            | [RemoveDuplicateTwo.java](src/main/java/com/practice/RemoveDuplicateTwo.java)         |
| 13  | Reverse Linked List         | Easy       | Linked List      | [ReversedLinkedList.java](src/main/java/com/practice/ReversedLinkedList.java)         |
| 14  | Rotting Oranges             | Medium     | BFS/Graph        | [RottingOrange.java](src/main/java/com/practice/RottingOrange.java)                   |
| 15  | Single Number               | Easy       | Bit Manipulation | [SingleNumber.java](src/main/java/com/practice/SingleNumber.java)                     |
| 16  | Three Sum                   | Medium     | Two Pointers     | [ThreeSum.java](src/main/java/com/practice/ThreeSum.java)                             |
| 17  | Container With Most Water   | Medium     | Two Pointers     | [WaterContainer.java](src/main/java/com/practice/WaterContainer.java)                 |
| 18  | Word Search                 | Medium     | Backtracking/DFS | [WordSearch.java](src/main/java/com/practice/WordSearch.java)                         |
| 19  | Coin Change II              | Medium     | DP/Recursion     | [CoinChange.java](src/main/java/com/practice/CoinChange.java)                         |

## 🛠 Tech Stack

- **Language:** Java 17
- **Build Tool:** Maven
- **Development:** Object-Oriented Programming, Clean Code Principles
- **Concepts:** Data Structures, Algorithms, Time/Space Complexity Analysis

## 📚 Learning Resources

Resources that helped in this journey:

- [LeetCode](https://leetcode.com/) - Problem practice platform
- [GeeksforGeeks](https://www.geeksforgeeks.org/) - Algorithm tutorials
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/) - Complexity reference
- [Java Documentation](https://docs.oracle.com/en/java/) - Official Java docs

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available for learning purposes.

## 👨‍💻 Author

**Arafat**

- GitHub: [@arafat2020](https://github.com/arafat2020)
- Repository: [java-parc](https://github.com/arafat2020/java-parc)

---

⭐ **Star this repository** if you find it helpful!

💼 **Actively practicing** and adding new solutions regularly

🎯 **Goal:** Master DSA and ace technical interviews
