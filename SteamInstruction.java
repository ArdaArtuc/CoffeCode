package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class SteamInstruction extends BasicInstruction {
    public SteamInstruction(){
        super("STEAM $d, $s, $t", "XOR: rd = rs ^ rt", BasicInstructionFormat.R_FORMAT, "000010 sssss ttttt ddddd 00000 000010");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
RegisterFile.updateRegister(ops[0], RegisterFile.getValue(ops[1]) & RegisterFile.getValue(ops[2]));
}
        };
    }
    }
