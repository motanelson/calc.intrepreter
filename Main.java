// java -jar antlr-4.9.2-complete.jar -visitor math.g4
// javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java
// java -cp .:antlr-4.9.2-complete.jar Main '2+(1+1)'
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String input = args[0];

        CharStream cs = CharStreams.fromString(input);
        mathLexer lexer = new mathLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mathParser parser = new mathParser(tokens);

        ParseTree tree = parser.expr();

        EvalVisitor visitor = new EvalVisitor();
        double result = visitor.visit(tree);

        System.out.println("Resultado: " + result);
    }
}