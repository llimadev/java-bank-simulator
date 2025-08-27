## Java - Bank Simulator

This is a bank simulator project developed for learning and improving skills in Java and Object-Oriented Programming (OOP). The goal is to create a simple and educational application that simulates essential banking operations.

### Implemented Features
The project already has a solid foundation for bank simulation and error handling, which shows a focus on robust and maintainable code. The current features include:

- Basic Banking Operations: Core logic for performing deposits, withdrawals, and transfers between accounts, as well as tracking the balance for each.
- Account Validation: Validation logic for both CheckingAccount and SavingsAccount has been added, ensuring operations are performed securely and within business rules.
- Error Handling: An error-handling system has been created with a focus on logging exceptions and centralizing error messages, making debugging more efficient.
- ErrorCatalog: A centralized catalog to manage error messages by code.
- ErrorLogger: A tool to log exceptions with important data, such as a timestamp and OS information.
- AccountValidationException: A custom exception to capture specific validation errors.
Future Ideas (Roadmap)

This project is in constant evolution. In the future, the following features and improvements are planned for implementation:
- User Interface (UI): Creation of a simple interface (via terminal or GUI) for the user to interact with the simulator.
- User Registration: Adding the functionality to create new accounts and users in the system.
- Transaction History: Implementing a detailed statement so users can view the history of all their operations.
- More Account Types: Adding new account types (e.g., investment or corporate accounts), each with its own business rules.
- Data Persistence: Instead of using volatile in-memory data, implementing a database to save account and user information permanently.

### How to Contribute
Contributions are always welcome! If you'd like to help, feel free to open an issue to report a bug, suggest a new feature, or submit a pull request with your improvements.