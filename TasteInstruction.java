package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class TasteInstruction extends BasicInstruction {
    public TasteInstruction(){
    super("TASTE $s, $t, label", "Branch if equal: if (rs == rt) jump", BasicInstructionFormat.I_BRANCH_FORMAT, "000101 sssss ttttt immediate");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
if (RegisterFile.getValue(ops[0]) == RegisterFile.getValue(ops[1])) {
   String label = statement.getOriginalTokenList().get(2).getValue();
   int addr = Globals.program.getLocalSymbolTable().getAddressLocalOrGlobal(label);
   Globals.instructionSet.processBranch(addr);
}
} 
        };
    }
    }