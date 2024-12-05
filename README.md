
# Morse Code Translator 🔤

**An Innovative Approach to Secure Morse Code Communication**

This project is a Morse Code Translator developed as part of the Milestone 2 assignment for the Databases and Data Structures module. The system uses a **binary tree structure** for efficient Morse code encoding and decoding, with added features like **message reversal** for enhanced security. The project demonstrates expertise in implementing data structures, algorithmic thinking, and security measures.

---

## 🌟 Features

### **Binary Tree Structure**
- Maps Morse code sequences to characters using left (dot) and right (dash) node traversal.
- Supports efficient encoding and decoding operations.

### **Reversal Security**
- Reverses the Morse code message before or after translation to add obfuscation and improve security.

### **Optimized for Performance**
- Decoding and encoding operations are performed in \(O(k)\), where \(k\) is the Morse code length for each character.

### **Validation**
- Ensures input contains only valid Morse code symbols (`.`, `-`, `/`, spaces).
- Provides error messages for empty, null, or invalid inputs.

---

## 🛠️ Technologies Used
- **Programming Language**: Java
- **Data Structures**: Binary tree, stack
- **Algorithm**: Custom encoding/decoding with a reversal feature for security

---

## 📌 Getting Started

### **Prerequisites**
- Java Development Kit (JDK) installed
- Text editor or IDE (e.g., IntelliJ IDEA, Eclipse)
- Morse code data files (`character_codes.txt`, `sample_code.txt`)

### **Installation**
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/morse-code-translator.git
   cd morse-code-translator
   ```
2. Ensure the required input files (`character_codes.txt`, `sample_code.txt`) are in the project directory.

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the application:
   ```bash
   java Milestone2App
   ```

---

## 📖 Usage
1. **Encoding Messages**:
   - Input a text message to convert it into Morse code.
   - Optionally reverse the code for added security.

2. **Decoding Messages**:
   - Provide a Morse code sequence to retrieve the original message.
   - For reversed messages, enable the reversal option before decoding.

3. **Printing the Morse Code Dictionary**:
   - View all character-to-code mappings by traversing the binary tree.

---

## 🚀 Project Structure
- **`TreeNode.java`**: Represents nodes in the Morse code tree.
- **`StackNode.java`**: Supports in-order traversal without recursion.
- **`MorseCodeTree.java`**: Handles tree creation, insertion, and traversal logic.
- **`Milestone2App.java`**: Main application class for encoding, decoding, and managing input/output.

---

## 🔧 Algorithms and Implementation Details

### **Binary Tree for Morse Code**
- **Insertion**: Characters are added by traversing the tree based on dots (left) and dashes (right).
- **Decoding**: Each Morse code sequence is decoded by traversing from the root to the corresponding node.

### **Message Reversal**
- Adds security by reversing the message (e.g., `... --- ...` becomes `... --- ...` in reverse).
- Reversal is performed in-place for efficiency.

### **Validation**
- Ensures the input is not null, empty, or contains invalid characters.

### **Time Complexity**
- **Encoding/Decoding**: \(O(k)\) per character.
- **Reversal**: \(O(m)\), where \(m\) is the length of the Morse code message.

---

## 🧪 Testing

### **Test Cases**
| **Test Case**                      | **Input**                                    | **Expected Output**                                       | **Result**  |
|------------------------------------|---------------------------------------------|-----------------------------------------------------------|-------------|
| Valid Morse Code                   | `... --- ...`                               | Decoded: "SOS"                                           | Pass        |
| Empty Input                        | (empty)                                     | Error: "The Morse code message is empty."                | Pass        |
| Invalid Characters                 | `... --- @@@`                               | Error: "Invalid characters in the message."              | Pass        |
| Valid Morse Code with Reversal     | `... --- ...` (reversed)                    | Decoded: "SOS"                                           | Pass        |

---

## 🤝 Contribution
Contributions are welcome! Fork the repository, make changes, and submit a pull request.

---

## 📜 License
This project is licensed under the MIT License.

---

## 📧 Contact
- **Email**: nimsha.riveen@gmail.com
- **GitHub**: [Morse Code Translator Repository](https://github.com/your-username/morse-code-translator)
