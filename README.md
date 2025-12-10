# CoffeeCode – Custom Language for MARS-LE

CoffeeCode is a coffee-themed custom assembly language for **MARS-LE**.  
It adds new instructions (like `BEANS`, `BREW`, `POUR`, `SIP`, `DROP`, etc.) implemented in Java and exposed through MARS-LE’s Language Switcher.

## Structure

- `coffee/mips/instructions/.`
  - Java classes for each custom instruction (e.g., `BeansInstruction`, `BrewInstruction`, `DropInstruction`, ...)
- `mars/mips/instructions/customlangs/CoffeCustomLanguage.java`
  - Registers all CoffeeCode instructions and defines the language `"CoffeeCode` for MARS-LE.

## Build (Windows / PowerShell)

From the MARS-LE root:

```powershell
javac -d out mars/mips/instructions/customlangs/CoffeCustomLanguage.java coffee/mips/instructions/*.java
jar cf CoffeCustomLanguage.jar -C out.
Remove-Item -Recurse -Force out
