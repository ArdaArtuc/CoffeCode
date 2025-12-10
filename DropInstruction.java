package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class DropInstruction extends BasicInstruction {
    public DropInstruction(){
      super("DROP $t, imm($s)", "Store: PANTRY[rs+imm] = rt", BasicInstructionFormat.I_FORMAT, "000100 sssss ttttt immediate");
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
int addr = RegisterFile.getValue(ops[1]) + ops[2];
try {
   Globals.memory.setWord(addr, RegisterFile.getValue(ops[0]));
} catch (AddressErrorException e) {
    throw new ProcessingException(statement, e);
}
        };
    }
}