package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class FilterInstruction extends BasicInstruction {
    public FilterInstruction(){
        super("FILTER $d, $s, $t", "Divide: rd = rs / rt", BasicInstructionFormat.R_FORMAT, "000001 sssss ttttt ddddd 00000 000011");
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
int[] ops = statement.getOperands();
int divisor = RegisterFile.getValue(ops[2]);
if (divisor == 0) throw new ProcessingException(statement, "Division by zero");
RegisterFile.updateRegister(ops[0], RegisterFile.getValue(ops[1]) / divisor);
}
        };
    }
    }
