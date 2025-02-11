Item Checker

📌 Project Overview

This Java project verifies the validity of license plates and Twitter usernames based on predefined rules. It consists of three main classes:

Item → Represents an object with a code (String) and a valid status (Boolean).

ItemChecker → Contains methods for verifying license plates and Twitter usernames.

ItemCheckerApp → Provides a menu interface using JOptionPane to interact with ItemChecker.

🚀 Features

✅ License Plate Verification

A valid Irish vehicle registration plate follows this format: YYY-LL-SSSSSS

YYY → A three-digit year (any three-digit number is accepted).

LL → A two-letter county/city identifier (must be one of the predefined valid codes).

SSSSSS → A sequence of 1 to 6 digits.

The format must include two dashes (-) separating the groups.

Valid county/city identifiers:
CK, CE, CN, CW, DN, DL, GY, KE, KK, KY, LK, LD, LH, LM, LS, MH, MN, MO, OY, RN, SO, TY, WD, WH, WX, WW

✅ Twitter Username Verification

A valid Twitter username must:

Start with @.

Be between 5 and 16 characters long.

Contain only letters (a-z, A-Z), digits (0-9), and underscores (_).

📌 How It Works

User selects an option from the menu:

1) Verify License Plates

2) Verify Twitter Username

3) Exit

The user inputs the number of items to validate.

For each input, the program checks its validity and outputs a list of results (valid or invalid).

🛠 Technologies Used

Java

JOptionPane (for user interaction)

Regular Expressions (Regex) for validation

📦 Project Structure

📂 src/
 ├── 📄 Item.java         # Object class (code & valid status)
 ├── 📄 ItemChecker.java  # Methods to verify license plates and usernames
 ├── 📄 ItemCheckerApp.java  # Main menu interface (JOptionPane)

🏁 Github

Clone the repository: