package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class PourInstruction extends BasicInstruction {
    public PourInstruction(){
       super("POUR $d, $s", "Move: rd = rs", BasicInstructionFormat.R_FORMAT, "000001 sssss 00000 ddddd 00000 001011");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
RegisterFile.updateRegister(ops[0], RegisterFile.getValue(ops[1]));
}
        };
    }
    }
