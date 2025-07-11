Features:
    Ask user to enter two numbers

    Divide first number by second

    Handle invalid input (letters instead of numbers)

    Handle division by zero

    Show friendly messages

    Keep asking until input is valid

⚙ How it works:
    Use while (true) loop to keep asking

    Use try to run risky code

    Use catch to handle:

        ArithmeticException: division by zero

        InputMismatchException: letters instead of numbers

        Exception: unexpected errors

    Close scanner at the end

    UML Diagram:
   
    @startuml
class ExceptionDemo {
    +main(String[] args): void
}
note right of ExceptionDemo::main
loop until valid input:
  try read input and divide
  catch ArithmeticException: print message
  catch InputMismatchException: print message and clear input
  catch Exception: print generic error
finally: close scanner
@enduml
