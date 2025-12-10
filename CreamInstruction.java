package coffee.mips.instructions;

import mars.*;
import mars.mips.instructions.*;
import mars.mips.hardware.*;
import mars.util.*;

public class CreamInstruction extends BasicInstruction {
    public CreamInstruction(){
        super("CREAM $d", "Increment: rd = rd + 5", BasicInstructionFormat.R_FORMAT, "000001 00000 00000 ddddd 00000 000101");

new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
int val = RegisterFile.getValue(ops[0]) + 5;
RegisterFile.updateRegister(ops[0], val);
}
        };
    }
    }
