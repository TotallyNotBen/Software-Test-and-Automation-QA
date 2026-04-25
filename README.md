# Software-Test-and-Automation-QA

8-2 Journal

How can I ensure that my code, program, or software is functional and secure?

To ensure that my code, program, or software is functional and secure, I need to test it throughout the development process instead of waiting until the end. This includes writing unit tests to verify that individual methods and classes work correctly, using invalid inputs to make sure the program handles errors properly, and reviewing the code for security weaknesses. For example, input validation is important because it prevents users from entering data that could crash the program or create vulnerabilities. I can also use secure coding practices such as limiting access to sensitive data, avoiding hard-coded passwords, using trusted libraries, and running tools like dependency checks to identify known vulnerabilities.

How do I interpret user needs and incorporate them into a program?

I interpret user needs by carefully reviewing the requirements and turning them into specific features, constraints, and test cases. User needs describe what the program should accomplish, while requirements explain how the system should behave. For example, if a customer says that an appointment date cannot be in the past, I would translate that into a validation rule in the code and then create a JUnit test to confirm that past dates are rejected. Asking questions, clarifying unclear requirements, and thinking about how users will actually interact with the system help ensure that the final program meets expectations.

How do I approach designing software?

When designing software, I start by understanding the problem and breaking it into smaller parts. I identify the main objects, their responsibilities, and how they should interact. For example, in the contact, task, and appointment services, each object stored its own data and validation rules, while the service classes handled adding, deleting, and updating records. This separation keeps the design organized and easier to maintain. A good software design should be simple, readable, testable, and flexible enough to change as requirements evolve.
