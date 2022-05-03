package behavioral.visitor;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    //adding the components/functionalities during runtime and printing out
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }


}
