package coffee.mips.instructions;

import mars.*;
import mars.mips.instructions.*;
import mars.mips.hardware.*;
import mars.util.*;

public class BitterInstruction extends BasicInstruction {
    public BitterInstruction(){
        super("BITTER $d, $s", "Not: rd = ~rs", BasicInstructionFormat.R_FORMAT, "000001 sssss 00000 ddddd 00000 001001");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
RegisterFile.updateRegister(ops[0], ~RegisterFile.getValue(ops[1]));
}
        };
    }
    }