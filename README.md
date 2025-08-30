
# BaseValidator

BaseValidator is a simple Java utility to validate whether a given string represents a valid number in a specified base (from 2 to 36).

## Features
- Supports bases from 2 to 36.
- Validates digits `0-9` and letters `A-Z` for higher bases.
- Returns `false` for invalid characters or invalid bases.

## Installation
1. Clone the repository:
```bash
git clone https://github.com/yourusername/BaseValidator.git
````

2. Build the project with Maven:

```bash
cd BaseValidator
mvn clean install
```

## Usage in Your Code

You can use the `Solution` class in your Java project like this:

```java
import com.example.basevalidator.Solution;

public class ExampleUsage {
    public static void main(String[] args) {
        boolean validBinary = Solution.validateBase("1011", 2);
        boolean validHex = Solution.validateBase("1A3F", 16);
        System.out.println("Binary valid? " + validBinary);
        System.out.println("Hex valid? " + validHex);
    }
}
```

> Note: You do not need a `Main` class to use the library or run tests.

## Running Tests

JUnit 5 tests are included in `src/test/java`. Run them with:

```bash
mvn test
```

You should see output like:

```
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
```

## Examples of Valid and Invalid Numbers by Base

| Base | Valid Examples | Invalid Examples | Explanation                            |
| ---- | -------------- | ---------------- | -------------------------------------- |
| 2    | 0, 1, 1011     | 2, 102, abc      | Only digits 0 and 1 are allowed        |
| 8    | 0, 7, 123      | 8, 19, G7        | Digits 0–7 only                        |
| 10   | 0, 42, 12345   | A1, 12B, -1      | Digits 0–9 only                        |
| 16   | 0, 1A3F, FF    | 1G3F, XYZ, 19H   | Digits 0–9 and letters A–F only        |
| 36   | 0, Z, 10, 1Z   | !, @, 1\*        | Digits 0–9 and letters A–Z are allowed |

## How It Works

* Characters `'0'-'9'` are converted using `c - '0'`.
* Characters `'A'-'Z'` are converted using `c - 'A' + 10`.
* If any character exceeds the base, the method returns `false`.


