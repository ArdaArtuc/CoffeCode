package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class SpillInstruction extends BasicInstruction {
    public SpillInstruction(){
        super("SPILL $d", "Clear: rd = 0", BasicInstructionFormat.R_FORMAT, "000001 00000 00000 ddddd 00000 000111");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
RegisterFile.updateRegister(ops[0], 0);
}
        };
    }
    }