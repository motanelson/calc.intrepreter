import java.util.List;

public class EvalVisitor extends mathBaseVisitor<Double> {

    @Override
    public Double visitExpr(mathParser.ExprContext ctx) {
        return visit(ctx.addExpr());
    }

    @Override
    public Double visitAddExpr(mathParser.AddExprContext ctx) {
        double result = visit(ctx.mulExpr(0));

        for (int i = 1; i < ctx.mulExpr().size(); i++) {
            double right = visit(ctx.mulExpr(i));
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("+")) {
                result += right;
            } else {
                result -= right;
            }
        }
        return result;
    }

    @Override
    public Double visitMulExpr(mathParser.MulExprContext ctx) {
        double result = visit(ctx.atom(0));

        for (int i = 1; i < ctx.atom().size(); i++) {
            double right = visit(ctx.atom(i));
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("*")) {
                result *= right;
            } else {
                result /= right;
            }
        }
        return result;
    }

    @Override
    public Double visitAtom(mathParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) {
            return Double.parseDouble(ctx.NUMBER().getText());
        } else {
            return visit(ctx.expr());
        }
    }
}
