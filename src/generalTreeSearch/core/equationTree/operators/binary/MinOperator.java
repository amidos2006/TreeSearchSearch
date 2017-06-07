package generalTreeSearch.core.equationTree.operators.binary;

import generalTreeSearch.core.equationTree.EquationNode;
import generalTreeSearch.core.gameTree.GameNode;

public class MinOperator extends BinaryOperator{
    public MinOperator(EquationNode left, EquationNode right) {
	super(left, right);
    }

    @Override
    public double evaluate(GameNode node) {
	return Math.min(this.left.evaluate(node), this.right.evaluate(node));
    }

    @Override
    public String toString() {
	return "min(" + this.left.toString() +  "," + this.right.toString() + ")";
    }
}
