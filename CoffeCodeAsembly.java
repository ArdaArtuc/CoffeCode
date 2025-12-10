package coffee.mips.instructions;

import mars.mips.instructions.*;

public class CoffeCodeAsembly extends CustomAssembly{
    @Override
    public String getName(){
        return "CoffeCodeAsembly";
    }

    @Override
    public String getDescription(){
        return "CoffeCodeAsembly is a custom assembly language";
    }

    @Override
    protected void populate(){
        instructionList.add(new BrewInstruction());
        instructionList.add(new BurnINstruction());
        instructionList.add(new GrindInstruction());
        instructionList.add(new FilterInstruction());
        instructionList.add(new PressInstruction());
        instructionList.add(new MixInstruction());
        instructionList.add(new SteamInstruction());
        instructionList.add(new ScoopInstruction());
        instructionList.add(new DropInstruction());
        instructionList.add(new TasteInstruction());

        instructionList.add(new BoilInsturction());
        instructionList.add(new BeansInstruction());
        instructionList.add(new CreamInstruction());
        instructionList.add(new SipInsturction());
        instructionList.add(new SpillInstruction());
        instructionList.add(new FrothInstruction());
        instructionList.add(new BitterInstruction());
        instructionList.add(new RechargeInstruction());
        instructionList.add(new HyperInstruction());
        instructionList.add(new PourInstruction());
    }
}

    