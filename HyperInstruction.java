package coffee.mips.instructions;

import mars.*;
import mars.mips.hardware.*;
import mars.mips.instructions.*;
import mars.util.*;

public class HyperInstruction extends BasicInstruction {
    public HyperInstruction(){
        super("HYPER label", "Jump: PC = label", BasicInstructionFormat.J_FORMAT, "000110 address");\
new SimulationCode(){
public void simulate(ProgramStatement statement) throws ProcessingException{
String label = statement.getOriginalTokenList().get(0).getValue();
int addr = Globals.program.getLocalSymbolTable().getAddressLocalOrGlobal(label);
Globals.program.getCurrentProgramCounter().setValue(addr);
}
        };
    }
    }