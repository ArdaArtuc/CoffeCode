package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class ScoopInstruction extends BasicInstruction {
    public ScoopInstruction(){
      super("SCOOP $t, imm($s)", "Load: rt = PANTRY[rs+imm]", BasicInstructionFormat.I_FORMAT, "000011 sssss ttttt immediate");
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
int addr = RegisterFile.getValue(ops[1]) + ops[2];
try {
    RegisterFile.updateRegister(ops[0], Globals.memory.getWord(addr));

} catch (AddressErrorException e) {
    throw new ProcessingException(statement, e);
}
        };
    }
}