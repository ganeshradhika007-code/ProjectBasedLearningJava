ava Programs Using Lambda Expressions and Stream Operations
Objective

This project demonstrates the use of Lambda Expressions and Stream Operations in Java to simplify sorting, filtering, and data processing tasks.
It consists of three parts:

Sorting Employee Objects Using Lambda Expressions

Filtering and Sorting Students Using Streams

Stream Operations on Product Dataset

Each part highlights modern, functional-style programming introduced in Java 8 and later.

Part A: Sorting Employee Objects Using Lambda Expressions
Objective

To sort a list of Employee objects by name, age, and salary using lambda expressions for cleaner and more efficient code.

Concepts Used

Lambda expressions for defining inline comparators.

Sorting using List.sort() or Collections.sort().

Functional programming style for object comparison.

Program Overview

Create an Employee class with fields:
String name, int age, and double salary.

Store multiple employees in a List<Employee>.

Use lambda expressions to:

Sort by name alphabetically.

Sort by age in ascending order.

Sort by salary (ascending or descending).

Display results for each sorting type.

Sample Output
Sorted by Name:
Alice 25 50000.0
Bob 30 45000.0
Charlie 28 60000.0

Sorted by Age:
Alice 25 50000.0
Charlie 28 60000.0
Bob 30 45000.0

Sorted by Salary (Descending):
Charlie 28 60000.0
Alice 25 50000.0
Bob 30 45000.0

Part B: Filtering and Sorting Students Using Streams
Objective

To use Java Stream API and lambda expressions for filtering students who scored above 75%, sorting them by marks, and displaying their names.

Concepts Used

Stream operations (filter, sorted, map, forEach).

Functional-style filtering and transformation.

Simplified list processing with lambdas.

Program Overview

Define a Student class with fields:
String name and double marks.

Store several student objects in a list.

Use stream operations to:

Filter students with marks > 75%.

Sort filtered students by marks.

Map to student names and display them.

Display all student names who meet the criteria.

Sample Output
Students scoring above 75% (sorted by marks):
Alice
John
Rahul

Part C: Stream Operations on Product Dataset
Objective

To perform analytical operations on a list of Product objects using Java streams — grouping, finding the most expensive product, and computing the average price.

Concepts Used

Collectors.groupingBy() for data grouping.

Collectors.maxBy() to find top elements per group.

Collectors.averagingDouble() for aggregation.

Comparator.comparingDouble() for comparisons.

Program Overview

Create a Product class with:

String name

double price

String category

Store multiple products in a List<Product>.

Use Stream API to:

Group products by category.

Find the most expensive product in each category.

Calculate the average price of all products.

Display all results clearly.

Sample Output
Products Grouped by Category:
{Electronics=[Laptop, Mobile], Grocery=[Rice, Sugar]}

Most Expensive Product in Each Category:
Electronics -> Laptop ($80000.0)
Grocery -> Rice ($2000.0)

Average Price of All Products: 41000.0

Summary
Part	Focus Area	Key Concepts	Core Operations
A	Sorting Employee Objects	Lambda Expressions	Custom Comparators and Sorting
B	Filtering & Sorting Students	Stream API + Lambdas	Filter, Sort, Map, ForEach
C	Product Data Analysis	Stream API + Collectors	Grouping, Max, Average
How to Compile and Run

Ensure you have Java 8 or later installed.

Compilation
javac SortEmployeesLambda.java
javac FilterSortStudents.java
javac ProductStreamOperations.java

Execution
java SortEmployeesLambda
java FilterSortStudents
java ProductStreamOperations

Learning Outcomes

By completing this project, you will:

Understand how to use lambda expressions for concise code.

Apply stream operations for efficient data filtering and aggregation.

Develop functional programming skills in Java.

Learn to handle real-world data processing scenarios effectively.
