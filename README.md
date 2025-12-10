# Password Checker & Generator

A simple and effective tool for checking password strength (1–10) and generating strong, secure passwords.

---

## 📌 Project Overview
This project helps users:
1. **Check the strength of their passwords**
2. **Generate a strong new password**

Both features work through a simple interactive menu.

---

## ⭐ Key Features

### 🔐 1. Password Strength Checker
Users can enter any password, and the system evaluates its strength on a **scale from 1 to 10** based on:

- Uppercase letters  
- Lowercase letters  
- Numbers  
- Special symbols  
- Length of the password  

### 🔑 2. Strong Password Generator
Users can generate a secure password by specifying the desired length (**minimum 8 characters**).

The generated password always includes:
- At least **1 uppercase letter**
- At least **1 lowercase letter**
- At least **1 number**
- At least **1 special symbol**
- Remaining characters are random from all allowed sets

---

## 🧩 Functions

### 🔎 Password Checking

#### **checkPasswordStrength(String password)**  
→ Returns an integer score **1–10**  
Criteria:
- Length ≥ 8  
- Contains uppercase letters  
- Contains lowercase letters  
- Contains numbers  
- Contains symbols  

#### Helper functions:
- **countUppercase(String password)** → counts uppercase letters  
- **countLowercase(String password)** → counts lowercase letters  
- **countNumbers(String password)** → counts digits  
- **countSymbols(String password)** → counts special symbols  

---

### ⚙️ Password Generation

#### **generatePassword(int length)**  
→ Returns a randomly generated strong password  

Guarantees the following:
- 1 uppercase  
- 1 lowercase  
- 1 number  
- 1 symbol  
- Remaining characters filled randomly  

---

## 👤 User Interaction

### **mainMenu() includes:**
- Enter a password to check its strength  
- Generate a new password  
- Exit the program  

---

## 📜 Rules
- Minimum password length for generated passwords: **8 characters**  
- Users can check multiple passwords in the same session  
- Generated passwords are always strong and contain a secure mix of character types  

---

## 📌 Hashtags (for LinkedIn / GitHub)
