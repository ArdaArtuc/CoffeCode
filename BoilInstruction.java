package coffee.mips.instructions;

import mars.*;
import mars.mips.instructions.*;
import mars.mips.hardware.*;
import mars.util.*;



public class BoilInstruction extends BasicInstruction {
    public BoilInstruction(){
        super("BOIL $d, $s", "Heat check: rd = (rs > 90) ? 1 : 0", BasicInstructionFormat.R_FORMAT, "000001 sssss 00000 ddddd 00000 000100");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
int value = RegisterFile.getValue(ops[1]) > 90 ? 1 : 0;
RegisterFile.updateRegister(ops[0], value);
}
        };
    }
    }