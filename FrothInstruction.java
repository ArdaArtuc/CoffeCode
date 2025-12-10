package coffee.mips.instructions;

import mars.*;
import mars.mips.instructions.*;
import mars.mips.hardware.*;
import mars.util.*;

public class FrothInstruction extends BasicInstruction {
    public FrothInstruction(){
       super("FROTH $d, $s, sh", "Shift Left: rd = rs << sh", BasicInstructionFormat.R_FORMAT, "000001 sssss 00000 ddddd shamt 001000");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
RegisterFile.updateRegister(ops[0], RegisterFile.getValue(ops[1]) << ops[2]);
}
        };
    }
    }