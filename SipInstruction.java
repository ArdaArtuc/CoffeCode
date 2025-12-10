package coffee.mips.instructions;

import mars.*;
import mars.mips.instructions.*;
import mars.mips.hardware.*;
import mars.util.*;

public class SipInstruction extends BasicInstruction {
    public SipInstruction(){
        super("SIP $d", "Decrement: rd = rd - 1", BasicInstructionFormat.R_FORMAT, "000001 00000 00000 ddddd 00000 000110");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
int val = RegisterFile.getValue(ops[0]) - 1;
RegisterFile.updateRegister(ops[0], val);
}
        };
    }
    }