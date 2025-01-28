
# Java Testing Project: Employee & AdvancedMath

## 📖 About

This project is designed to demonstrate effective Java testing strategies using JUnit 5. It includes two primary classes, `Employee` and `AdvancedMath`, along with corresponding unit test files.

### 🔑 Features

1. **Employee Class**
   - Models an employee with attributes like name, job title, and salary.
   - Includes input validation for constructors and methods.
   - Methods tested:
     - `introduce()`: Introduces the employee.
     - `giveRaise(double percentage)`: Updates the employee's salary by a percentage, with validation for negative input.

2. **AdvancedMath Class**
   - Provides basic mathematical operations with input validation and exception handling.
   - Methods tested:
     - `addition(int a, int b)` and `addition(String a, int b)`: Overloaded methods to add integers or a string-represented number to an integer.
     - `multiply(int a, int b)`: Throws a custom `OverTheLimitException` if the result exceeds integer maximum value.

3. **JUnit 5 Tests**
     - Ensure proper exception messages.
     - Test edge cases such as invalid input formats and large values.

## 📂Directories and Files
<details open>
   <summary><b>Project's Tree</b></summary>

``` bash
  .
  | - .gitignore     # Specifies files and directories to ignore in Git version control 
  | - LICENSE        # Contains the licensing terms for the project 
  | - README.md      # Provides an overview and instructions for the project
  |
  └───src            # Main source code directory
  |  -  AdvancedMath.java
  |  -  Employee.java
  |
  └───tests          # Test files directory
    | - AdvancedMathTest.java
    | - EmployeeTest.java
 ```
</details>

## 🚀Getting Started

1.  **Clone the Repository**:
    
    ```
    git clone https://github.com/Clamata/Java-Testing.git
    ```
    
2.  **Set Up the Project**:
    
    -   Open your preferred IDE.
        
    -   Import the project and ensure the `src` and `tests` directories are correctly marked as source and test folders, respectively.
        
3.  **Run Unit Tests**:
    
    -   Execute all tests from your IDE's test runner, or use a build tool like Maven or Gradle if configured.
        

----------

## 📜 License

This project is licensed under the MIT License. Feel free to use, modify, and distribute the code as permitted under the terms of this license.
