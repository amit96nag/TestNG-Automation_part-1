<h1 align="center" style="font-size:48px; text-transform:uppercase;">
🚀 TestNG Automation Project (Part 1)
</h1>

---

## 🧩 Overview
This repository demonstrates **automated web testing** using **Selenium WebDriver** and **TestNG** framework in Java.  
It is designed for learning, experimentation, and developing robust testing strategies for web applications.

---

## ⚙️ Technologies Used
| Tool / Framework | Purpose |
|------------------|----------|
| **Java** | Programming language for automation scripts |
| **Selenium WebDriver** | Browser automation |
| **TestNG** | Test framework for assertions, annotations, and reporting |
| **Maven** | Build and dependency management |
| **IDE** | IntelliJ IDEA / Eclipse (recommended) |

---

## 📂 Project Structure

TestNG-Automation_part-1-main/
│
├── src/
│ ├── main/java/ # (If applicable) Application code
│ ├── test/java/ # Test cases go here
│ │ ├── testng.xml # Test suite configuration file
│ │ ├── base/ # Base classes for WebDriver setup
│ │ ├── pages/ # Page Object Model (POM) classes
│ │ └── tests/ # Test classes using TestNG annotations
│
├── pom.xml # Maven dependencies
├── README.md # Documentation (this file)
└── test-output/ # TestNG reports (auto-generated)


---

## 🧠 Features
✅ TestNG annotations for better test control  
✅ Page Object Model (POM) for modular code  
✅ Assertions for validation  
✅ Parallel test execution support  
✅ HTML report generation  

---

## 🚀 How to Run the Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/TestNG-Automation_part-1.git
cd TestNG-Automation_part-1-main

2️⃣ Install Dependencies

Make sure you have Maven installed, then run:

mvn clean install

3️⃣ Run Test Suite

Execute tests using:

mvn test


or directly via testng.xml inside your IDE.

📊 Test Reports

After test execution, reports are automatically generated at:

/test-output/index.html


Open it in your browser to view the results.

🧑‍💻 Author

Amit Nag
📍 Bangladesh
💼 Automation Tester | Java & Selenium Enthusiast
🔗 GitHub Profile
