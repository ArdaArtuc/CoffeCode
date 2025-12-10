package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class RechargeInstruction extends BasicInstruction {
    public RechargeInstruction(){
        super("RECHARGE $d, $s", "Boost Energy: rd = rs + 100", BasicInstructionFormat.R_FORMAT, "000001 sssss 00000 ddddd 00000 001010");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
RegisterFile.updateRegister(ops[0], RegisterFile.getValue(ops[1]) + 100);
}
        };
    }
    }
